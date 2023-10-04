package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Guardian extends Zerg implements FlyUnit, AirAttack {
    public Guardian() {
        super(3, 6);
    }
}
