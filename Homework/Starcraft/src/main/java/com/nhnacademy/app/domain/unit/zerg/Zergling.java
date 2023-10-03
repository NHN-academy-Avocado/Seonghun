package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Zergling extends Zerg implements DefaultAttack, GroundUnit {
    public Zergling() {
        super(2, 2);
    }
}
