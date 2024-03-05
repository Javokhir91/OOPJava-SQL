package ru.Rakhmatov.gb;

import java.util.ArrayList;
import java.util.Date;

public class PackAnimals extends Animals{


    public static int Counter;
    public static int idCounter;


    {
        Counter ++;
        id = ++ idCounter;
    }

    static {
        idCounter = 0;
    }

    protected static int getCounter() {
        return Counter;
    }


    public PackAnimals(String name, Date birthday){
        super(name, birthday);
    }

    public PackAnimals(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }


    public String displayInfo() {
        return String.format("PackAnimal %d - %s - Date: %s, Commands - %s", getId(), getName(), getBirthday(), getCommands());
    }
}
