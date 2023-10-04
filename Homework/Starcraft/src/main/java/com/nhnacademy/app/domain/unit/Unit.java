package com.nhnacademy.app.domain.unit;


public class Unit {
    private final int power;
    private int shield;

    public Unit(int power, int shield) {
        this.power = power;
        this.shield = shield;
    }

    public void attack(Unit enemy) {
        enemy.hurt(this.power);
    }

    public void hurt(int i) {

        this.shield -= i;
        if (this.shield < 1) {
            die();
        }
    }

    public void die() {
        System.out.println(this.getClass().getSimpleName() + "파괴!!");
    }


    public int getShield() {
        return this.shield;
    }
}

