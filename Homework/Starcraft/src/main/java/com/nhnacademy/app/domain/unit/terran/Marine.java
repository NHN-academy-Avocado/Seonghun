package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Marine extends Terran implements GroundUnit, DefaultAttack {
    public Marine() {
        super(3, 10);
    }
}
