package com.androiddesdecero.dagger2.di;

import android.app.Application;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

public class MotorAplication extends Application{
    
    private MotorComponent motorComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        motorComponent = DaggerMotorComponent.builder().motorModule(new MotorModule()).build();
    }

    public MotorComponent getMotorComponent(){
        return motorComponent;
    }
}
