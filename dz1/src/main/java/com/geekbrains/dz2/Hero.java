package com.geekbrains.dz2;

import java.io.Serializable;

public class Hero implements Serializable {
    public static final Long serialVersionUID = 1L;

    private String heroClass;
    private String name;
    private int level;
    private int hp;
    private int maxHp;

    public Hero(String heroClass, String name, int level, int hp, int maxHp) {
        this.heroClass = heroClass;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    public Hero() {
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    @Override
    public String toString() {
        return "class: " + heroClass +
                "\nname: " + name +
                "\nlevel: " + level +
                "\nhp: " + hp +
                "\nmaxHp: " +maxHp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        if (level != hero.level) return false;
        if (hp != hero.hp) return false;
        if (maxHp != hero.maxHp) return false;
        if (!heroClass.equals(hero.heroClass)) return false;
        return name.equals(hero.name);
    }

    @Override
    public int hashCode() {
        int result = heroClass.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + level;
        result = 31 * result + hp;
        result = 31 * result + maxHp;
        return result;
    }
}
