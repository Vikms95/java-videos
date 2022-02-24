package com.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Calendar;

public class Video{
    private String URL;
    private String title;
    private ArrayList<String> tagList = new ArrayList<String>();
    private String videoOwner;
    private String uploadDate;

    public Video(){

    }
    public Video(String URL, String title, ArrayList<String> tagList, String videoOwner){
        this.URL = URL;
        this.title = title;
        this.videoOwner = videoOwner;
    }

    public void setURL()throws InputMismatchException {
        Scanner inputURL = new Scanner(System.in);
        System.out.println("Input the video URL: ");
        String inputCheck = inputURL.nextLine();
        
        if(inputCheck.isBlank()){
            throw new InputMismatchException("No value provided");
        }else{
            this.URL = inputCheck;
        }

    }   
    
    public void setTitle() throws InputMismatchException {
        Scanner inputTitle = new Scanner(System.in);
        System.out.println("Input the video title: ");
        String inputCheck = inputTitle.nextLine();
        
        if(inputCheck.isBlank()){
            throw new InputMismatchException("No value provided");
        }else{
            this.title = inputCheck;
        }

    }
    
    public void setTagList() throws InputMismatchException {
        Scanner inputTag = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        String tag;
        int loopCheck;

        while(true){

            System.out.println("Add some tags to your video: ");
            tag = inputTag.nextLine();
            
            if(tag.isBlank()){
                throw new InputMismatchException("No value provided");
            }else{
                this.tagList.add(tag);
            }

            System.out.println("Do you want to keep adding tags to your video? (Yes = 1 / No = 0)");
            loopCheck = inputInt.nextInt();

            if(Integer.toString(loopCheck).isBlank()){
                throw new InputMismatchException("No value provided");
            }else{
                if(loopCheck ==0){
                    break;
                }
            }
        }     
    }

    public void setVideoOwner(String videoOwner) {
        this.videoOwner = videoOwner;
    }
 
    public void setUploadTime() {
        
        String uploadDate = java.util.Calendar
                            .getInstance()
                            .getTime()
                            .toString(); 

        this.uploadDate = uploadDate;
    }

    public String getURL() {
        return this.URL;
    }

    public ArrayList<String> getTagList() {
        return tagList;
    }

    public String getVideoOwner() {
        return videoOwner;
    }
    
    
}

