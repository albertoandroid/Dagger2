package com.androiddesdecero.dagger2;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

public class Motor {

    private String tipoMotor;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor(){
        return ("Motor: "+tipoMotor);
    }

}
