/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dang Phat
 */
public class User {
    // Tuan Anh khai bao them bien count
    private static int count = 0;
    private int userId;
    private String userName;
    private String password;
    private int type;

    public User() {
        
    }
    
    // Tuan Anh update lại constuctor vì code automatic number
    public User(String userName, String password, int type) {
        this.userId = count++;
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    
    
    public User(int userId, String userName, String password, int type) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.type = type;
    }
    
    public int getCount(){
        return count;
    }
    
    // Tuan Anh add hàm này để mỗi lần đọc file .dat update được code của user đang là bao nhiêu    
    public void setCount(int cnt){
        count = cnt;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", password=" + password + ", type=" + type + '}';
    }

    
    
    
    
}
