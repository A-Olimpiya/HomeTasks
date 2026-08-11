package ru.aston.lesson2_4.task1;

public class Animal {
     String name;
    static int countAnimals = 0;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public void swim(int lengthsOfObstacle) {
        System.out.println(name + " проплыл " + lengthsOfObstacle + " метров");
    }
    public void run(int lengthsOfObstacle){
        System.out.println(name + " пробежал " + lengthsOfObstacle + " метров");
    }

    public static void infoAnimal(){
        System.out.println("Всего создано животных: " + countAnimals);
    }
}
