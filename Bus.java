package main.java;

/**
 * Created by collinm on 6/4/17.
 */
public class Bus {
    private int passengers;
    private String vehicle;
    private String carrier;

    public Bus(String carrier, String vehicle, int passengers) {
        this.carrier = carrier;
        this.vehicle = vehicle;
        this.passengers = passengers;
    }

    public boolean isGreaterThan(Bus thatOne) {
        return this.getPassengers() > thatOne.getPassengers();
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
