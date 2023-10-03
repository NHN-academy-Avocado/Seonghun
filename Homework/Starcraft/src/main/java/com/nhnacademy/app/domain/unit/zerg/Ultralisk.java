package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Ultralisk extends Zerg implements GroundUnit, DefaultAttack {
    public Ultralisk() {
        super(5, 15);
    }
}
