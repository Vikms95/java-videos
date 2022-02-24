package com.example;

import java.util.ArrayList;

public class User extends Video{
    
    private String name;
    private String surName;
    private String password;
    private String registerDate;
    private ArrayList<Video> userVideoList = new ArrayList<Video>();
    
    // CONSTRUCTORS
    
   
    public User(){
    }

    public User(String name, String surName, String password, String registerDate){
        this.setName(name);
        this.setSurName(surName);
        this.setPassword(password);
        this.setRegisterDate(registerDate);
        
    }
    
    // SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    //GETTERS
    public ArrayList<Video> getUserVideoList() {
        return userVideoList;
    }
    public String getName() {
        return this.name;
    }
   
    
    public void createVideo() {

        Video obj = new Video();

        obj.setURL();
        obj.setTitle();
        obj.setTagList();
        obj.setUploadTime();
        obj.setVideoOwner(this.name);
        userVideoList.add(obj);
    }
    
    public void setDate() {
    }
}




