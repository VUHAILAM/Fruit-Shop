
import view.FruitView;
import view.OrderView;

import controller.*;
import common.*;
import model.User;
import view.UserView;

public class MainApp {
    public static void main(String[] args) {
        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("  1.Login");
            System.out.println("  2.Exit");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 2)) {
                case 1:
                    UserView userView = new UserView();
                    User user = userView.login();
                    if (user.getType() == 1) {
                        handleAdminMenu(user);
                    } else {
                        handleSaleMenu(user);
                    }
                    break;
                default:
                    return;
            }
        }
    }

    //YenNTHHE141078
    private static void goShopping() {
        FruitManager fm = new FruitManager();
        FruitView fv = new FruitView();
        OrderManager om = new OrderManager();
        OrderView ov = new OrderView();
        fm.readFruitListFromFile();
        fv.displayListFruit(fm.getFruitList());
        //check store has fruit or not
        if (DataInput.checkInputIntLimit(1, fm.getFruitList().size()) == -1) {
            System.out.println("There are no fruit in store");
            return;
        }
        System.out.print("Enter item: ");
        int item = DataInput.checkInputIntLimit(1, fm.getFruitList().size());
        System.out.print("Enter quantity: ");
        int quantity = DataInput.checkInputIntLimit(1, fm.getFruitByItem(item).getQuantity());

        om.shopping(fm.getFruitList(), fm.getFruitByItem(item), quantity);
        ov.displayListOrder(om.getListOrder());
        String name = DataInput.checkInputString("Enter name: ");
        om.putToHT(name);
        System.out.println("Add successfull");
    }

    private static void handleAdminMenu(User user) {
        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("  1.Manage users");
            System.out.println("  2.Manage fruits");
            System.out.println("  3.Logout");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 3)) {
                case 1:
                    UserView.manageUsers();
                    break;
                case 2:
                    FruitView.manageFruits();
                    break;
                default:
                    return;
            }
        }
    }

    private static void viewOrders() {
        OrderManager orderManager = new OrderManager();
        OrderView orderView = new OrderView();
        orderView.viewOrder(orderManager.getHT());
    }

    private static void handleSaleMenu(User user) {
        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("  1.Manage fruits");
            System.out.println("  2.View orders");
            System.out.println("  3.Shopping");
            System.out.println("  4.Logout");
            switch (DataInput.checkInputIntLimit(AppConstant.ENTER_CHOICE, 1, 4)) {
                case 1:
                    FruitView.manageFruits();
                    break;
                case 2:
                    viewOrders();
                case 3:
                    goShopping();
                default:
                    return;
            }
        }
    }
}
