package com.androiddesdecero.dagger2.di;

import com.androiddesdecero.dagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 7/7/17.
 */

@PerActivity
@Singleton
@Component(modules={MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
