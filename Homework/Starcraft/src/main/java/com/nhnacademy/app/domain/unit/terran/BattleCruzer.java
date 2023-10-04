package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.AirAttack;

public class BattleCruzer extends Terran implements FlyUnit, AirAttack {
    public BattleCruzer() {
        super(20, 30);
    }
}
