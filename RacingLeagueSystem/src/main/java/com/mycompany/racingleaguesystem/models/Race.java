/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.racingleaguesystem.models;

import java.util.ArrayList;

/**
 *
 * @author hardi
 */
public class Race {
    private final String name;
    private final ArrayList<Car> cars;

    public Race(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        if (cars.size() < 6) {
            cars.add(car);
        } else {
            System.out.println("Race " + name + " already has 6 cars.");
        }
    }

    public void startRace() {
        System.out.println("Race " + name + " is starting!");
        for (Car car : cars) {
            car.boost();
            car.drift();
            car.repair();
        }
    }
}

