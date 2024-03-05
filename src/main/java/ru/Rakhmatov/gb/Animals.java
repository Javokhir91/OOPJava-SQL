package ru.Rakhmatov.gb;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Animals {
    protected String name;
    protected Date birthday;
    protected ArrayList<String> commands;
    public int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Date getBirthday() {
        return birthday;
    }


    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }


    public Animals(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Animals(String name, Date birthday, ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }


}
