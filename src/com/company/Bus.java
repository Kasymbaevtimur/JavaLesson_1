package com.company;

public class Truck {
    private int id;
    private String name;
    private Driver driver;
    private State state;

    public static Truck TruckData(int id, String name, Driver driver, State state) {
        Truck truck= new Truck();
        truck.id = id;
        truck.name = name;
        truck.driver = driver;
        truck.state = state;
        return truck;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver='" + driver + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
