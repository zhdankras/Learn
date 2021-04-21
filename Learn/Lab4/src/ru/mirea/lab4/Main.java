package ru.mirea.lab4;

public class Main {

    public static void main(String[] args) {
	    Price obj1 = new Car("Red", 2005);
	    Price obj2 = new Car("Blue", 2011);
	    Price obj3 = new Car(2012);
	    Price obj4 = new Car("Green");
	    System.out.println(obj1.GetPrice());
		System.out.println(obj2.GetPrice());
		System.out.println(obj3.GetPrice());
		System.out.println(obj4.GetPrice());

		Price obj5 = new House(2, "Brus");
		Price obj6 = new House();
		((House) obj6).setKol_vo_etazh(1);
		((House) obj6).setMaterial("Kirpich");
		System.out.println(obj5.GetPrice());
		System.out.print(obj6.GetPrice());
    }
}
