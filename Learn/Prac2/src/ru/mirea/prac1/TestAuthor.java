package ru.mirea.prac1;

public class TestAuthor {

    public static void main(String[] args) {
	    Author a1 = new Author("Andrew", "lart60@yandex.ru", 'M');
	    System.out.println(a1);
	    System.out.println(a1.getName());
	    System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }
}
