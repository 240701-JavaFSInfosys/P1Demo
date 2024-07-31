package com.revature.models.DTOs;

//Remember what a DTO is? Data Transfer Object
//This Class will be used to model incoming Car data (int for User instead of a User object, no carId)
public class IncomingCarDTO {

    private String make;
    private String model;
    private boolean isFourWheelDrive;
    private int userId;

    //boilerplate-----------

    public IncomingCarDTO() {
    }

    public IncomingCarDTO(String make, String model, boolean isFourWheelDrive, int userId) {
        this.make = make;
        this.model = model;
        this.isFourWheelDrive = isFourWheelDrive;
        this.userId = userId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "IncomingCarDTO{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isFourWheelDrive=" + isFourWheelDrive +
                ", userId=" + userId +
                '}';
    }
}
