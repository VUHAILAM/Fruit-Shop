package controller;

import common.AppConstant;
import common.DataInput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Fruit;
import model.User;
import view.FruitView;

public class FruitManager {

    private ArrayList<Fruit> fruitList = new ArrayList<>();

    public void addFruit() {
        //loop until user don't want to create fruit
        while (true) {
            String fruitId = DataInput.checkInputString("Enter fruit id: ");
            if (DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id exist");
                return;
            }
            String fruitName = DataInput.checkInputString("Enter fruit name: ");
            double price = DataInput.checkInputDouble("Enter price: ",Double.MIN_VALUE,Double.MAX_VALUE);
            int quantity = DataInput.checkInputInt("Enter quantity: ");
            String origin = DataInput.checkInputString("Enter origin: ");
            fruitList.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            //check user want to continue or not
            FruitView.displayListFruit(fruitList);
            if (!DataInput.checkInputYN()) {
                return;
            }

        }

    }

    public void updateFruit() {
        //loop until user don't want to create fruit
        while (true) {
            String fruitId = DataInput.checkInputString("Enter fruit id: ");
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
            } else {
                String fruitName = DataInput.checkInputString("Enter fruit name: ");
                double price = DataInput.checkInputDouble("Enter price: ",Double.MIN_VALUE,Double.MAX_VALUE);
                int quantity = DataInput.checkInputInt("Enter quantity: ");
                String origin = DataInput.checkInputString("Enter origin: ");
                for (Fruit fruit : fruitList) {
                    if (fruit.getFruitId().equals(fruitId)) {
                fruit.setFruitName(fruitName);
                fruit.setPrice(price);
                fruit.setQuantity(quantity);
                fruit.setOrigin(origin);
            }
 
                }   
        FruitView.displayListFruit(fruitList);
            }
            break;
        }
    }
    public void deleteFruit() {
        while (true) {
            String fruitId = DataInput.checkInputString("Enter fruit id: ");
            if (!DataInput.fruitExisted(fruitList, fruitId)) {
                System.err.println("Id does not exist!");
                return;
            } else {
                for (Fruit fruit : fruitList) {
                    if (fruit.getFruitId().equals(fruitId)) {
                        if (fruitList.size() > 1) {
                            fruitList.remove(fruit);
                            FruitView.displayListFruit(fruitList);
                        } else {
                            fruitList = null;
                            System.out.println("List is empty");
                        }
                    }
                }
            }
            break;
        }

    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    //get fruint user want to by
    public Fruit getFruitByItem(int item) {
        int countItem = 1;
        for (Fruit fruit : fruitList) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }
    
    public void saveToFile() {
        try (FileOutputStream fos = new FileOutputStream(new File(AppConstant.FRUIT_DATA))) {
            for (Fruit fruit : fruitList) {
                String user = fruit.toString();
                fos.write(user.getBytes());
                fos.write("\n".getBytes());
            }
        } catch (IOException ex) {
        }
    }
    
    public void readFruitListFromFile() {
        File fi = new File(AppConstant.USER_DATA);
        fruitList.clear();
        List<String[]> listFruitRaw = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fi))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] fruitInfo = line.split("\\|");
                listFruitRaw.add(fruitInfo);
            }
            for(int i = 0; i < listFruitRaw.size(); i++) {
                Fruit f = new Fruit();
                f.setFruitId(listFruitRaw.get(i)[0].trim());
                f.setFruitName(listFruitRaw.get(i)[1].trim());
                f.setPrice(Double.parseDouble(listFruitRaw.get(i)[2].trim()));
                f.setQuantity(Integer.parseInt(listFruitRaw.get(i)[3].trim()));
                f.setOrigin(listFruitRaw.get(i)[4].trim());
                fruitList.add(f);
            }
        } catch (IOException ex) {
        }
    }
}
