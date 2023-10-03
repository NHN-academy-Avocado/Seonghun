package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Scout extends Protos implements DefaultAttack, FlyUnit {
    public Scout() {
        super(5, 10);
    }
}
