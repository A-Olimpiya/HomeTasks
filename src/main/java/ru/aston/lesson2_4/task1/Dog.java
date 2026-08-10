package ru.aston.lesson2_4.task1;

public class Dog extends Animal {
    static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public void swim(int lengthsOfObstacle) {
        if (lengthsOfObstacle <= 10) {
            super.swim(lengthsOfObstacle);
        } else System.out.println(name + " не может проплыть " + lengthsOfObstacle + " м. (максимум 10 м.)");
    }

    @Override
    public void run(int lengthsOfObstacle) {
        if (lengthsOfObstacle <= 500) {
            super.run(lengthsOfObstacle);
        } else System.out.println(name + " не может пробежать " + lengthsOfObstacle + " м. (максимум 500 м.)");
    }

    public static void infoDogs() {
        System.out.println("Всего создано собак: " + countDogs);
    }
}
