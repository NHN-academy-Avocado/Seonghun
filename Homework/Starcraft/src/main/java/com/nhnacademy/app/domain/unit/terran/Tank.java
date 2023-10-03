package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Tank extends Terran implements GroundUnit, DefaultAttack {
    public Tank() {
        super(7, 15);
    }
}
