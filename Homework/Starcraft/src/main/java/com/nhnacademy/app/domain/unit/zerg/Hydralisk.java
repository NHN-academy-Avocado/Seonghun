package com.nhnacademy.app.domain.unit.zerg;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.Spit;

public class Hydralisk extends Zerg implements GroundUnit, Spit {
    public Hydralisk() {
        super(3, 7);
    }
}
