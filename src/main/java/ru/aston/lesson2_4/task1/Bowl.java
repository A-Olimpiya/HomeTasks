package ru.aston.lesson2_4.task1;

public class Bowl {
    private int nowFoodInBowl;

    public Bowl(int food) {
        this.nowFoodInBowl = food;
    }

    public boolean tryToEat(int food) {
        if (food <= nowFoodInBowl) {
            nowFoodInBowl = nowFoodInBowl - food;
            return true;
        } else return false;
    }

    public void addFood(int food) {
        nowFoodInBowl += food;
        System.out.println("Добавлено " + food + " еды. Теперь в миске " + nowFoodInBowl + " еды.");
    }
}