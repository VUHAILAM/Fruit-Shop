/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.AppConstant;
import common.DataInput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author kiennt
 */
public class UserManager {
     // Vì list của user cập nhập liên tục mỗi lần đọc file nên bỏ final
    private ArrayList<User> userList = new ArrayList<>();

    // Tuan Anh thêm phần này để cập nhập id của user
    public UserManager() {
        userList = getUserList();
        new User().setCount(userList.size());
    }
    //
    

    // Tuan Anh sua ham nay de tra ve mot list user
    public static List<String> getListAccounts() {
        List<String> listUsers = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(AppConstant.USER_DATA), StandardCharsets.UTF_8));) {
            listUsers = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                listUsers.add(userInfo[1]);
            }
        } catch (Exception ex) {
        }
        return listUsers;
    }
    //

     //YenNTHHE141078
    public static boolean checkLogin(User user) {
        File f = new File(AppConstant.USER_DATA);
        List<String[]> listUser = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                listUser.add(userInfo);
                //check user list is duplicate or not
                for (int i = 0; i < listUser.size() - 1; i++) {
                    for (int j = i + 1; j < listUser.size() - 1 - i; j++) {
                        if (Integer.parseInt(listUser.get(i)[0].trim()) == Integer.parseInt(listUser.get(j)[0].trim())
                                || listUser.get(i)[1].trim().equals(listUser.get(j)[1].trim())) {
                            return false;
                        }
                    }
                }
            }
            for (int i = 0; i < listUser.size() - 1; i++) {
                if (user.getUserName().equals(listUser.get(i)[1].trim()) && user.getPassword().equals((listUser.get(i)[2].trim()))) {
                    user.setType(Integer.parseInt(listUser.get(i)[3].trim()));
                    user.setUserId(Integer.parseInt(listUser.get(i)[0].trim()));
                    return true;
                }
            }
        } catch (IOException ex) {
        }

        return false;
    }

    public static void changePassword(User user, String newPassword) {
        List<String> listUsers = getListAccounts();
        if (listUsers != null && !listUsers.isEmpty()) {
            for (int i = 0; i < listUsers.size(); i++) {
                String[] userInfo = listUsers.get(i).split("\\|");
                if (user.getUserId() == Integer.parseInt(userInfo[0])) {
                    listUsers.set(i, userInfo[0] + "|" + userInfo[1] + "|" + newPassword + "|" + userInfo[3]);
                    user.setPassword(newPassword);
                }
            }
            saveAccount(listUsers);            
        }
    }

    public static void saveAccount(List<String> listUsers) {
        try (FileOutputStream fos = new FileOutputStream(new File(AppConstant.USER_DATA))) {
            for (String user : listUsers) {
                fos.write(user.getBytes());
                fos.write("\n".getBytes());
            }
        } catch (IOException ex) {
        }
    }
    
    // Tuan Anh bổ sung hàm này để trả về một list user
    public static ArrayList<User> getUserList() {
        ArrayList<User> listUsers = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(AppConstant.USER_DATA), StandardCharsets.UTF_8));) {
            listUsers = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                System.out.println(userInfo[0]);
                listUsers.add(new User(Integer.parseInt(userInfo[0]), userInfo[1], userInfo[2], Integer.parseInt(userInfo[3])));
            }
        } catch (Exception ex) {
        }
        return listUsers;
    }
    // 

    // Tuan Anh sửa lại hàm addUser vì không được nhập code cho user
    public void addUser() {
        //loop until user don't want to create fruit       
        while (true) {

            //String userName = DataInput.checkInputString("Enter user name: ");
            String userName = DataInput.checkInputUsername(userList, "Enter user name: ");
            String password = DataInput.checkPassword("Enter password:");
            int userType = DataInput.checkInputIntLimit("Enter type", Integer.MIN_VALUE, Integer.MAX_VALUE);
            userList.add(new User(userName, password, userType));
            User user = new User(userName, password, userType);
            System.out.println(user.getUserId());
            /*
                Phần này thiếu code save to file nhưng yến đã bổ sung. 
             */
            //check user want to continue or not
            if (!DataInput.checkInputYN()) {
                return;
            }
        }
    }

    //YenNTHHE141078
    public void updateUser() {
        //loop until user don't want to create fruit
        while (true) {
            int userCode = DataInput.checkInputInt("Enter user code: ");
            if (!DataInput.userExisted(userList, userCode)) {
                System.err.println("User code does not exist!");
                return;
            }
            String userName = DataInput.checkInputString("Enter user name: ");
            String password = DataInput.checkInputString("Enter password: ");
            int userType = DataInput.checkInputInt("Enter user type: ");
            //update data by the way delete user then add again
            for (User user : userList) {
                if (user.getUserId() == userCode) {
                    userList.remove(user);
                    userList.add(new User(userCode, userName, password, userType));
                    return;
                }
            }
        }
    }

    //YenNTHHE141078
    public void deleteUser() {
        int userCode = DataInput.checkInputInt("Enter user code: ");
        if (!DataInput.userExisted(userList, userCode)) {
            System.err.println("Id does not exist!");
            return;
        } //delete user with user code
        else {
            for (User user : userList) {
                if (user.getUserId() == userCode) {
                    userList.remove(user);
                    return;
                }
            }
        }
    }
    
    //YenNTHHE141078
    public void reloadUserList() {
        File f = new File(AppConstant.USER_DATA);
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split("\\|");
                //user list must contain the old user in file user.dat
                userList.add(new User(Integer.parseInt(userInfo[0].trim()), userInfo[1].trim(), userInfo[2].trim(), Integer.parseInt(userInfo[3].trim())));
            }

        } catch (IOException ex) {
        }
    }
    
    //YenNTHHE141078
    public void saveToFile() {
        try (FileOutputStream fos = new FileOutputStream(new File(AppConstant.USER_DATA))) {
            for (User users : userList) {
                String user = users.toString();
                fos.write(user.getBytes());
                fos.write("\n".getBytes());
            }
        } catch (IOException ex) {
        }
    }
}
