package com.zzx.assistent.ui.main;



public class FruitDO {

    private String name;
    private int imageId;

    public FruitDO(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "FruitDO{" +
                "name='" + name + '\'' +
                ", imageId=" + imageId +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
