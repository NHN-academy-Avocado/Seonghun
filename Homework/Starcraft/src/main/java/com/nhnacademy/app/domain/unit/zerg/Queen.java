package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Queen extends Zerg implements FlyUnit, AirAttack {
    public Queen() {
        super(15, 25);
    }
}
