package ru.mirea.prac1;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", 600);
        Book b2 = new Book("Цветы для Элджернона");
        b2.setNumber_of_pages(300);
        b1.output();
        System.out.print(b2);
    }
}
