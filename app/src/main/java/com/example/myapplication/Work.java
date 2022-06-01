package com.example.myapplication;

public class Work {
    private int imageID;
    private String name;
    private String content;

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Work(int imageID, String name, String price) {
        this.imageID = imageID;
        this.name = name;
        this.content = price;
    }
}
