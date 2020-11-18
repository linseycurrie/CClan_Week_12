package Actors;

import Vehicle.Car;

import java.util.ArrayList;

public abstract class Actors {

    private String name;
    private double balance;
    private ArrayList<Car> cars;

    public Actors(String name, double balance, ArrayList<Car> cars) {
        this.name = name;
        this.balance = balance;
        this.cars = cars;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getCarsName(Car car) {
        if (this.cars.contains(car)) {
            return car.getName();
        } else {
            return "error";
        }
    }

    public int getCarsSize() {
        return cars.size();
    }

    public boolean buyCar(Customer customer, Car car) {
        if (customer.getBalance() - car.getPrice() > 0){
            return true;
        }
        else
        {
            return false;
    }
}

}
