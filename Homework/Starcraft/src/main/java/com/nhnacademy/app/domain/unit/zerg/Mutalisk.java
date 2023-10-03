package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Mutalisk extends Zerg implements FlyUnit, DefaultAttack {
    public Mutalisk() {
        super(2, 8);
    }
}
