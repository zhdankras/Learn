package ru.mirea.prac6;

public class Student {

    private int id;
    private String name;
    private String Gruppa;

    public Student(int id, String name, String Gruppa) {
        this.id = id;
        this.name = name;
        this.Gruppa = Gruppa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
