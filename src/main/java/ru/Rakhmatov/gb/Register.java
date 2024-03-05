package ru.Rakhmatov.gb;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {

//    String register;
    ArrayList<PackAnimals> packAnimals;
    ArrayList<Pets> pets;

    public void addPet(Pets a){
        this.pets.add(a);
    }
    public void addPackAnimals(PackAnimals a) {
        this.packAnimals.add(a);
    }


    public Register() {
    }

    {
        packAnimals = new ArrayList<PackAnimals>();
        pets = new ArrayList<Pets>();
    }


    public void addSkillPackAnimal(String name) {
        Scanner s = new Scanner(System.in);
        for (PackAnimals packAnimal : packAnimals) {
            if (name.equals(packAnimal.getName())) {
                System.out.println("Какой навык вы хотите добавить?");
                String newCommand = s.nextLine();
                packAnimal.commands.add(newCommand);
            }
        }
        // тут же аналогично для Pets
    }

    public void ShowSkill(String name) {
        for (PackAnimals packAnimal : packAnimals) {
            if (name.equals(packAnimal.getName())) {
                System.out.println(packAnimal.getCommands());
            }
        }
        // так же аналогично для packAnimals

    }

    public void ShowAnimals(){
        for (PackAnimals packAnimal : packAnimals) {
            System.out.println(packAnimal.displayInfo());
        }

    }
}
