package com.example.telecom.paris.models;

import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class Promotion {
    private ArrayList<Student> studentList;

    public Promotion() {
        studentList = new ArrayList<Student>();
    }

    public int newId() {
        return (studentList.size() == 0 ? 1 : studentList.stream().max(comparing(Student::getId)).get().getId() + 1);
    }

    public void printToConsole() {
        studentList.forEach(name -> {
            System.out.println(name);
        });
    }
    public int add(String firstName, String lastName) {
        int id = newId();
        studentList.add(new Student(id, firstName, lastName));
        return id;
    }
}
