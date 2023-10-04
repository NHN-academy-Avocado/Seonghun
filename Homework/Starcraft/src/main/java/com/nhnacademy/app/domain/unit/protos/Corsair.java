package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Corsair extends Protos implements AirAttack, FlyUnit {
    public Corsair() {
        super(4, 12);
    }
}
