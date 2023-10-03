package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Queen extends Zerg implements FlyUnit, DefaultAttack {
    public Queen() {
        super(15, 25);
    }
}
