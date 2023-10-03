package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Wraith extends Terran implements FlyUnit, DefaultAttack {
    public Wraith() {
        super(3, 10);
    }
}
