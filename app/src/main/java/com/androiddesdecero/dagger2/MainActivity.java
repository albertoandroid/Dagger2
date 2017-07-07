package com.androiddesdecero.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.androiddesdecero.dagger2.di.MotorAplication;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    @Named("gasolina")@Inject
    Motor motor;

    @Inject
    Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MotorAplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(MainActivity.this, motor.getTipoMotor(), Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, coche.getMotor(), Toast.LENGTH_SHORT).show();

    }
}
