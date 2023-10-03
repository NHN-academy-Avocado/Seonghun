package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Zealot extends Protos implements DefaultAttack, GroundUnit {
    public Zealot() {
        super(5, 20);
    }
}
