package ru.mirea.prac1;
import java.lang.*;

public class Book {

    private String title;
    private int number_of_pages;

    public Book(String n, int a) {
        title = n;
        number_of_pages = a;
    }

    public Book(String n) {
        title = n;
        number_of_pages = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", number_of_pages=" + number_of_pages +
                '}';
    }

    public void output() {
        System.out.println(title +' ' + number_of_pages);
    }

}
