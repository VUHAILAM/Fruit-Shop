package common;

import model.Fruit;
import model.Order;
import java.util.ArrayList;
import java.util.Scanner;
import model.User;

public class DataInput {

    private static final Scanner in = new Scanner(System.in);
    private static final String PASS_VALID = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$";

    //check user input number limit
    public static int checkInputIntLimit(String msg, int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg);
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]\nPlease enter again!");
            }
        }
    }

    public static String checkPassword(String msg) {
        while (true) {
            System.out.print(msg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty! Please enter again!");
            } else if (!result.matches(PASS_VALID)) {
                System.out.println("Password must include more than 6 chars, both letter and numbers!");
            } else {
                return result;
            }
        }
    }

    //check user input number limit
    //YenNTHHE141078
    public static int checkInputIntLimit (int min, int max) throws NumberFormatException{
        //loop until user input correct
        while (true) {
            if (min > max) {
                return -1;
            }
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString(String smg) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    // Tuan Anh thêm hàm này để check người dùng nhập username. 
    public static String checkInputUsername(ArrayList<User> userList, String msg) {
        while (true) {
            String username = checkInputString(msg);

            if (username.length() >= 5 && Character.isLetter(username.charAt(0))) {
                for (User user : userList) {
                    if (user.getUserName().equalsIgnoreCase(username)) {
                        System.err.println("Username must be unique");
                        break;
                    } else {
                        return username;
                    }
                }
            } else {
                System.err.println("userName has >= 5 chars, unique, & must start with a letter character");
            }
        }
    }
    
    //check user input int
    public static int checkInputInt(String smg) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer.");
                System.out.print("Enter again: ");
            }
        }
    }

     // Tuan Anh optimize lại hàm này thêm hai tham số double min và double max
    public static double checkInputDouble(String smg, double min, double max) {
        //loop until user input correct
        while (true) {
            System.out.println(smg);
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]\nPlease enter again!");
            }

        }
    }

    //check user input yes/ no
    public static boolean checkInputYN() {
        System.out.print("Do you want to continue (Y/N)? ");
        //loop until user input correct
        while (true) {
            String result = checkInputString("");
            //return true if user input y/Y
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    //check id exist
    public static boolean fruitExisted(ArrayList<Fruit> lf, String id) {
        for (Fruit fruit : lf) {
            if (id.equalsIgnoreCase(fruit.getFruitId())) {
                return true;
            }
        }
        return false;
    }

        //check id exist
    public static boolean userExisted(ArrayList<User> userList, int userCode) {
        for (User user : userList) {
            if (userCode == user.getUserId()) {
                return true;
            }
        }
        return false;
    }
    //check item exist or not
    public static boolean checkItemExist(ArrayList<Order> lo, String id) {
        for (Order order : lo) {
            if (order.getFruitId().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }
}
