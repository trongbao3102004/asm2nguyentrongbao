/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linkedlist;

/**
 *
 * @author ASUS
 */
public class Student {

    private int id;
    private String name;
    private double mark;

    public Student(int id, String name, double mark) {
        if (id <= 0) {
            throw new RuntimeException("ID must be a positive integer");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new RuntimeException("Name must contain only letters");
        }
        if (name.length() > 25) {
            throw new RuntimeException("Name must not exceed 25 characters");
        }
        if (mark < 0 || mark > 10) {
            throw new RuntimeException("Mark must be between 0 and 10");
        }
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getRank() {
        if (mark >= 0 && mark < 5.0) {
            return "Fail";
        } else if (mark >= 5.0 && mark < 6.5) {
            return "Medium";
        } else if (mark >= 6.5 && mark < 7.5) {
            return "Good";
        } else if (mark >= 7.5 && mark < 9.0) {
            return "Very Good";
        } else if (mark >= 9.0 && mark <= 10.0) {
            return "Excellent";
        } else {
            return "Invalid Mark";
        }
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', mark=" + mark + ", rank='" + getRank() + "'}";
    }
}
