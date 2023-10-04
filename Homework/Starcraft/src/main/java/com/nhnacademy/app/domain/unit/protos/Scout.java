package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Scout extends Protos implements AirAttack, FlyUnit {
    public Scout() {
        super(5, 10);
    }
}
