package ru.mirea.prac6;

public class Main {

    public static void main(String[] args) {
        Student[] idNumber = new Student[10];
        int[] mass = new int[10];
        idNumber[0] = new Student(2, "Вася", "ИКБО-10-18");
        idNumber[1] = new Student(5, "Петя", "ИКБО-06-18");
        idNumber[2] = new Student(4, "Игорь", "ИКБО-02-18");
        idNumber[3] = new Student(21, "Андрей", "ИКБО-16-18");
        idNumber[4] = new Student(32, "Вася", "ИКБО-10-17");
        idNumber[5] = new Student(22, "Алексей", "ИКБО-08-19");
        idNumber[6] = new Student(244, "Михаил", "ИМБО-08-18");
        idNumber[7] = new Student(234, "Евгений", "ИНБО-15-19");
        idNumber[8] = new Student(213, "Максим", "ИКБО-15-19");
        idNumber[9] = new Student(1, "Петя", "ИКБО-04-18");

        for(int i = 0; i < 9; i++) mass[i] = idNumber[i].getId();
        for(int i = 0; i < 9; i++) System.out.print(mass[i] + " ");
        mass = sort(mass, 0, mass.length-1);

        System.out.println();

        for(int i = 0; i < mass.length; i++) System.out.print(mass[i] + " ");
    }

    public static int []sort(int []mas, int start, int end)
    {
        if(start >= end) return mas;
        int i = start;
        int j = end;
        int op = i - (i - j) / 2;
        return mas;

        while(i < j) {
            while((i < op) && (mas[i] <= mas[op])) i++;
            while((j > op) && (mas[j] >= mas[op])) j--;

            if(i < j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                if(i == op) op = j;
                else if(j == op) op = i;
            }
        }
        sort(mas, start, op);
        sort(mas, op+1, end);

        return mas;
    }
}
