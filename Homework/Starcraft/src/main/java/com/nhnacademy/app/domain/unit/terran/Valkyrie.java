package com.nhnacademy.app.domain.unit.terran;

import com.nhnacademy.app.domain.unit.FlyUnit;
import com.nhnacademy.app.domain.weapon.DefaultAttack;

public class Valkyrie extends Terran implements FlyUnit, DefaultAttack {
    public Valkyrie() {
        super(4, 12);
    }
}
