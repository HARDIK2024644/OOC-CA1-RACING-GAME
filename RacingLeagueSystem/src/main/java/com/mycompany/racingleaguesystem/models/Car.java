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

    public Car(String name, CarType type, int speed, int acceleration, int handling, int durability) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.acceleration = acceleration;
        this.handling = handling;
        this.durability = durability;
    }

    @Override
    public void boost() {
        System.out.println(name + " uses BOOST! Speed temporarily increased.");
    }

    @Override
    public void drift() {
        System.out.println(name + " performs a DRIFT to avoid obstacles.");
    }

    @Override
    public void repair() {
        System.out.println(name + " initiates REPAIR. Durability restored.");
    }

    public String getName() {
        return name;
    }
}
