package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Corsair extends Protos implements DefaultAttack, FlyUnit {
    public Corsair() {
        super(4, 12);
    }
}
