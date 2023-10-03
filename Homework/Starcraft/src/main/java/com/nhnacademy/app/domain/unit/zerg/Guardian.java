package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Guardian extends Zerg implements FlyUnit, DefaultAttack {
    public Guardian() {
        super(3, 6);
    }
}
