package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Mutalisk extends Zerg implements FlyUnit, AirAttack {
    public Mutalisk() {
        super(2, 8);
    }
}
