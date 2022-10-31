package com.codingproject.recyclercardview;

public class FamilyMemCardModel {

    private String familyName;
    private int imageFile;

    public FamilyMemCardModel(String familyName, int imageFile) {
        this.familyName = familyName;
        this.imageFile = imageFile;
    }

    //GETTERS & SETTERS

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getImageFile() {
        return imageFile;
    }

    public void setImageFile(int imageFile) {
        this.imageFile = imageFile;
    }
}
