package com.example.telecom.paris.models;

public class Student {
    private final int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [firstName = " + firstName + ", lastName = " + lastName + ", (id = " + id + " ]";
    }

    public int compareToStudent(Student other) {
        if (this.lastName.compareTo(other.lastName) != 0) {
            return this.lastName.compareTo(other.lastName);
        }
        if (this.firstName.compareTo(other.firstName) != 0) {
            return this.lastName.compareTo(other.lastName);
        }
        if (this.id < other.id) {
            return -1;
        } else if (this.id > other.id) {
            return 1;
        } else {
            return 0;
        }
    }
}
