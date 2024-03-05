package ru.Rakhmatov.gb;

import java.util.ArrayList;
import java.util.Date;

public class Program {

    public static void main(String[] args) {


        Camel camel1 = new Camel("Bars", new Date(2020, 12,12), new ArrayList<>());

        Register r = new Register();

        r.addPackAnimals(camel1);

        r.addSkillPackAnimal("Bars");

        r.addPackAnimals(new Camel("java", new Date(2021, 12, 12), new ArrayList<>()));

        r.addSkillPackAnimal("java");


        for (PackAnimals p: r.packAnimals) {
            System.out.println(p.displayInfo());
        }

        r.ShowSkill("java");


        r.ShowAnimals();



    }

}
