package com.codingproject.recyclercardview;

public class DataModel {

    private String mainTitle;
    private int imageFile;

    //CONSTRUCTORS
    public DataModel(String mainTitle, int imageFile) {
        this.mainTitle = mainTitle;
        this.imageFile = imageFile;
    }

    //GETTERS & SETTERS
    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public int getImageFile() {
        return imageFile;
    }

    public void setImageFile(int imageFile) {
        this.imageFile = imageFile;
    }
}
