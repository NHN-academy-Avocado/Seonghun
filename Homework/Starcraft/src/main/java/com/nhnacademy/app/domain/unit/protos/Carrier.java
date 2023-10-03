package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Carrier extends Protos implements FlyUnit, DefaultAttack {
    public Carrier() {
        super(25, 40);
    }
}
