package com.pluralsight;

public class CellPhone {

    private Integer serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public void CellPhoneInfo(){
        serialNumber =0;
        model=("");
        carrier=("");
        phoneNumber=("");
        owner=("");

    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

public void showMe(){
    System.out.println(getOwner()+ "'s phone is calling "+getPhoneNumber());
}

}
