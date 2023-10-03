package com.nhnacademy.app.domain.unit.protos;

import com.nhnacademy.app.domain.unit.GroundUnit;
import com.nhnacademy.app.domain.weapon.Laser;

public class Dragoon extends Protos implements Laser, GroundUnit {
    public Dragoon() {
        super(3, 15);
    }
}
