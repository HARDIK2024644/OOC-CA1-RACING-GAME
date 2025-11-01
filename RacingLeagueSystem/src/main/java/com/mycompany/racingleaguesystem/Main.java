/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.racingleaguesystem;

import com.mycompany.racingleaguesystem.enums.CarType;
import com.mycompany.racingleaguesystem.models.Car;
import com.mycompany.racingleaguesystem.models.Race;

/**
 *
 * @author hardi
 */


public class Main {
    public static void main(String[] args) {
        // Created 8 cars with full parameters
        Car car1 = new Car("Honda", CarType.SPORTS, 90, 85, 80, 70);
        Car car2 = new Car("Toyota", CarType.SUV, 70, 60, 75, 90);
        Car car3 = new Car("BMW", CarType.TRUCK, 60, 50, 65, 95);
        Car car4 = new Car("Ford", CarType.ELECTRIC, 80, 90, 85, 60);
        Car car5 = new Car("Mazda", CarType.SPORTS, 88, 82, 78, 72);
        Car car6 = new Car("Nissan", CarType.TRUCK, 65, 55, 60, 92);
        Car car7 = new Car("Ferrari", CarType.ELECTRIC, 75, 88, 80, 65);
        Car car8 = new Car("Jeep", CarType.SUV, 72, 62, 70, 85);

        // Create races as in this case we have 2 races 
        Race race1 = new Race("Desert Dash");
        Race race2 = new Race("Urban Sprint");
         race1.addCar(car1);
        race1.addCar(car2);
        race1.addCar(car3);
        race1.addCar(car4);
        race1.addCar(car5);
        race1.addCar(car6);

        race2.addCar(car3);
        race2.addCar(car4);
        race2.addCar(car5);
        race2.addCar(car6);
        race2.addCar(car7);
        race2.addCar(car8);

        // Start races
        race1.startRace();
        race2.startRace();
    }
}

