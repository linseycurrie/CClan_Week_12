package Actors;

import Vehicle.Car;

import java.util.ArrayList;

public class Customer extends Actors{

    public Customer(String name, double balance, ArrayList<Car> cars) {
        super(name, balance, cars);
    }
}
