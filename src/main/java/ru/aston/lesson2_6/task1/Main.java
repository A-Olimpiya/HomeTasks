package ru.aston.lesson2_6.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Чех Иван", "ПН-11", 1, Arrays.asList(5, 2, 3, 4, 5)));
        students.add(new Student("Иванов Олег", "ПН-11", 1, Arrays.asList(5, 5, 5, 5, 5)));
        students.add(new Student("Матроскин Александр", "П3-11", 3, Arrays.asList(2, 1, 2, 3, 5)));
        students.add(new Student("Шариков Вадим", "ПН-31", 3, Arrays.asList(4, 4, 5, 5, 5)));
        students.add(new Student("Ким Мин Со", "ПН-21", 2, Arrays.asList(1, 1, 1, 1, 1)));

        System.out.println(students);
        for (Student student : students) {
            System.out.println("У студента  " + student.getName() + " средний балл " + student.getAverage());
        }
        Student student = students.get(0);

        student.removeStudentAverageLessThree(students);
        student.nextCourse(students);

        Set<Student> studentSet = new HashSet<>(students);
        student.printStudents(studentSet, 1);
        student.printStudents(studentSet, 2);
    }
}