package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Wraith extends Terran implements FlyUnit, AirAttack {
    public Wraith() {
        super(3, 10);
    }
}
