package com.example.sqlite_task;

public class Student {
    private String name;
    private int rollNumber;
    private boolean isEnroll;

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNumber=" + rollNumber + ", isEnroll=" + isEnroll + '}';
    }

    public Student(String name, int rollNumber, boolean isEnroll) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.isEnroll = isEnroll;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRollNumber() {

        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {

        this.rollNumber = rollNumber;
    }

    public boolean isEnroll() {

        return isEnroll;
    }

    public void setEnroll(boolean enroll) {

        isEnroll = enroll;
    }

}
