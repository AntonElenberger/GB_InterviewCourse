package com.geekbrains.dz2;

import java.io.*;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setHeroClass("Sorcerer");
        hero.setName("Jules");
        hero.setHp(50);
        hero.setLevel(1);
        hero.setMaxHp(50);

        writeToFile(hero);

        Hero systemHero = new Hero();
        try {
            Scanner reader = new Scanner(new File("save.txt"));


            reader.findInLine("class:");
            if (reader.hasNext()) systemHero.setHeroClass(reader.next());
            reader.skip("\nname:");
            reader.findInLine("name:");
            if (reader.hasNext()) systemHero.setName(reader.next());
            reader.skip("\nlevel:");
            reader.findInLine("level:");
            if (reader.hasNext()) systemHero.setLevel(reader.nextInt());
            reader.skip("\nhp:");
            reader.findInLine("hp:");
            if (reader.hasNext()) systemHero.setHp(reader.nextInt());
            reader.skip("\nmaxHp:");
            reader.findInLine("maxHp:");
            if (reader.hasNext()) systemHero.setMaxHp(reader.nextInt());
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Hero hero2 = null;
        if (hero.hashCode() == systemHero.hashCode()) {
            hero2 = new Hero(
                    systemHero.getHeroClass(),
                    systemHero.getName(),
                    systemHero.getLevel(),
                    systemHero.getHp(),
                    systemHero.getMaxHp()
            );
        }


        System.out.println(hero2);
    }

    public static void writeToFile(Object o) {
        try {
            File saveFile = new File("save.txt");
            if(!saveFile.exists()) {
                FileWriter fileWriter = new FileWriter(saveFile);
                fileWriter.write(o.toString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
