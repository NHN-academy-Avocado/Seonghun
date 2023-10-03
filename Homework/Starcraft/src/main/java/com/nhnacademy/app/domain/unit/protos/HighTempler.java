package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class HighTempler extends Protos implements DefaultAttack, GroundUnit {
    public HighTempler() {
        super(10, 2);
    }
}
