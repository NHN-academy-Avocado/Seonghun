package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Carrier extends Protos implements FlyUnit, AirAttack {
    public Carrier() {
        super(25, 40);
    }
}
