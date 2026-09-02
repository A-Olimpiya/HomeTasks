package ru.aston.lesson2_6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks;

    public Student(String name, String groupe, int course, List<Integer> marks) {
        this.name = name;
        this.group = groupe;
        this.course = course;
        this.marks = new ArrayList<>(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\nимя студента " + name + ", группа " + group + ", курс " + course + ", оценки " + marks;
    }

    public double getAverage() {
        int sum = 0;
        for (Integer mark : marks) {
            sum = sum + mark;
        }
        return (double) sum / marks.size();
    }

    public void removeStudentAverageLessThree(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getAverage() < 3) {
                System.out.println("Удаляем студента: " + student.getName() + " потому что его средний балл " + student.getAverage());
                students.remove(i);
                i--;
            }
        }
    }

    public void nextCourse(List<Student> students) {
        for (Student student : students) {
            if (student.getAverage() >= 3) {
                int oldCourse = student.getCourse();
                student.setCourse(oldCourse + 1);
                System.out.println("Переводим студента: " + student.getName() + " с курса " + oldCourse + " на следующий курс " + student.getCourse() + " потому что его средний балл " + student.getAverage());
            }
        }
    }

    public void printStudents(Set<Student> students, int course) {
        int count = 0;
        System.out.println("На " + course + " курсе обучаются студенты:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("на " + course + " курсе студентов нет");
        }
    }
}