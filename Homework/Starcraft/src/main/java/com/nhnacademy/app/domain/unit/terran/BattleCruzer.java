package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class BattleCruzer extends Terran implements FlyUnit, DefaultAttack {
    public BattleCruzer() {
        super(20, 30);
    }
}
