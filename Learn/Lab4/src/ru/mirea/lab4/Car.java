package ru.mirea.lab4;

public class Car implements Price {

    private String color;
    private int god;
    private int cena;

    public Car(String color, int god) {
        this.color = color;
        this.god = god;
    }

    public Car(int god) {
        this.color = "Red";
        this.god = god;
    }

    public Car(String color) {
        this.color = color;
        this.god = 1989;
    }

    @Override
    public int GetPrice() {
        if (color == "red" || god > 1990) cena = 9000;
        else if (color == "blue" || god < 2010) cena = 10000;
        else cena = 1000;
        return cena;
    }
}
