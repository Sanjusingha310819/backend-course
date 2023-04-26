package org.stackroute.domain;

public class Cab {

    private int cabId;
    private String vehicleRegistrationPlateNo;
    private String vehicleType;

    public Cab(){}

    public Cab(int cabId, String vehicleRegistrationPlateNo, String vehicleType) {
        this.cabId = cabId;
        this.vehicleRegistrationPlateNo = vehicleRegistrationPlateNo;
        this.vehicleType = vehicleType;
    }

    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public String getVehicleRegistrationPlateNo() {
        return vehicleRegistrationPlateNo;
    }

    public void setVehicleRegistrationPlateNo(String vehicleRegistrationPlateNo) {
        this.vehicleRegistrationPlateNo = vehicleRegistrationPlateNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabId=" + cabId +
                ", vehicleRegistrationPlateNo='" + vehicleRegistrationPlateNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
