package ru.aston.lesson2_4.task1;

public class Cat extends Animal {
    static int countCat = 0;
    int needFood;
    boolean isCatFull = false;

    public Cat(String name, int needFood) {
        super(name);
        this.needFood = needFood;
        countCat++;
    }

    @Override
    public void swim(int lengthsOfObstacle) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    @Override
    public void run(int lengthsOfObstacle) {
        if (lengthsOfObstacle <= 200) {
            super.run(lengthsOfObstacle);
        } else {
            System.out.println("Кот " + name + " не может пробежать " + lengthsOfObstacle + " м. (максимум 200 м.)");
        }
    }

    public static void infoCats() {
        System.out.println("Всего создано котов: " + countCat);
    }

    public void eat(Bowl bowl) {
        if (bowl.tryToEat(needFood)) {
            System.out.println("Кот " + name + " поел");
            isCatFull = true;
        } else System.out.println("Кот " + name + " не поел");
    }
}