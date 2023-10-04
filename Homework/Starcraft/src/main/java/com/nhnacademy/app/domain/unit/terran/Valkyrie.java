package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class Valkyrie extends Terran implements FlyUnit, AirAttack {
    public Valkyrie() {
        super(4, 12);
    }
}
