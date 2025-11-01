/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.racingleaguesystem.models;
import com.mycompany.racingleaguesystem.enums.CarType;
import com.mycompany.racingleaguesystem.interfaces.Actionable;



/**
 *
 * @author hardi
 */
public class Car implements Actionable {
    private final String name;
    private CarType type;
    private int speed, acceleration, handling, durability;
    
    //Giving specified modes of car which will run the car
    public Car(String name, CarType type, int speed, int acceleration, int handling, int durability) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.acceleration = acceleration;
        this.handling = handling;
        this.durability = durability;
    }
    //This will help car to get extra speed and get some extra boost 
    @Override
    public void boost() {
        System.out.println(name + " uses BOOST! Speed temporarily increased.");
    }
    //This will help car to drift while turning 
    @Override
    public void drift() {
        System.out.println(name + " performs a DRIFT to avoid obstacles.");
    }
    //This will help car for repairing in situation if car got into any repairing problem
    @Override
    public void repair() {
        System.out.println(name + " initiates REPAIR. Durability restored.");
    }
    
    public String getName() {
        return name;
    }
}
