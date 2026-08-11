package ru.aston.lesson2_4.task1;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Том", 100);
        cats[1] = new Cat("Сом", 300);
        cats[2] = new Cat("Гном", 600);

        Bowl bowl = new Bowl(900);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);
        }

        bowl.addFood(400);
        cats[2].eat(bowl);

        System.out.println("______");

        cats[0].swim(5);
        cats[0].run(5);
        cats[0].run(205);

        System.out.println("______");

        Dog dog1 = new Dog("Джесси");

        dog1.run(20);
        dog1.run(1400);
        dog1.swim(3);
        dog1.swim(300);

        System.out.println("______");

        Cat.infoCats();
        Dog.infoDogs();
        Animal.infoAnimal();
    }
}