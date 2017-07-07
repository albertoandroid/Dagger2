package com.androiddesdecero.dagger2;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

public class Coche {

    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public String getMotor(){
        return ("Coche con "+motor.getTipoMotor());
    }

}
