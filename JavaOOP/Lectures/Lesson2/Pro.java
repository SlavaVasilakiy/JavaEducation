package Lesson2;

import java.util.ArrayList;

public class Pro {
    public static void main(String[] args) {

    }
}

class People {
    ArrayList<Human> human = new ArrayList<Human>();
}

class Human {
    String name;
    ArrayList<Human> parents = new ArrayList<Human>();
    ArrayList<Human> children = new ArrayList<Human>();
    ArrayList<Human> relatives = new ArrayList<Human>();
}