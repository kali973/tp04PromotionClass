package com.example.telecom.paris.models;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Comparator.comparing;

public class Promotion {
    private ArrayList<Student> studentList;

    public Promotion() {
        studentList = new ArrayList<Student>();
    }

    public int newId() {
        return (studentList.size() == 0 ? 0 : studentList.stream().max(comparing(Student::getId)).get().getId() + 1);
    }

    public void printToConsole() {
        for (Student studentList : studentList) {
            System.out.println(studentList);
        }
        ;
    }

    public int add(String firstName, String lastName) {
        int id = newId();
        studentList.add(new Student(id, firstName, lastName));
        return id;
    }

    private void swapStudentList(int idStudent, int idOtherStudent) {
        Collections.swap(studentList, idStudent, idOtherStudent);
    }

    public void selectionSort() {
        Collections.sort(studentList, (a, b) -> b.compareToStudent(a));
    }
}
