package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.Missile;

public class Goliath extends Terran implements GroundUnit, Missile {
    public Goliath() {
        super(5, 15);
    }
}
