package ru.mirea.lab1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] a;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество элементов в массиве: ");
		n = in.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите a[" + i + "] = ");
			a[i] = in.nextInt();
		}
		// Вывод элементов массива
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
		}
		// Сумма элементов массива через цикл for
		int  t = 0;
		for (int i = 0; i < n; i++) {
			t+=a[i];
		}
		System.out.print(t);
		// Сумма элементов массива через цикл while
		int i = 0, x = 0;
		while(i < n)
		{
			x+=a[i];
			i++;
		}
		System.out.print(x);
		// Сумма элементов массива через цикл do while
		int count = 0, p = 0;
		do {
			count+=a[p];
			p++;
		} while(p < n);
		System.out.print(count);
	}
}
