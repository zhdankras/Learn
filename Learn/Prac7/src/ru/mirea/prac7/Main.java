package ru.mirea.prac7;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> gamer1 = new LinkedList<Integer>();
        Queue<Integer> gamer2 = new LinkedList<Integer>();
        gamer1.add(1);
        gamer1.add(3);
        gamer1.add(5);
        gamer1.add(7);
        gamer1.add(9);

        gamer2.add(2);
        gamer2.add(4);
        gamer2.add(2);
        gamer2.add(8);
        gamer2.add(0);
        //((LinkedList<Integer>) gamer1).peekLast() > ((LinkedList<Integer>) gamer2).peekLast()
        System.out.println("1 игрок: " + gamer1 +" "+"2 игрок: " + gamer2);

        while(gamer1 != null || gamer2 != null)
        {
            if(((LinkedList<Integer>) gamer1).peekLast() - ((LinkedList<Integer>) gamer2).peekLast() != 9 &&
            ((LinkedList<Integer>) gamer2).peekLast() - ((LinkedList<Integer>) gamer1).peekLast() != 9)
            {
                if((((LinkedList<Integer>) gamer2).peekLast() < ((LinkedList<Integer>) gamer1).peekLast()))
                {
                    int element_gamer2 = ((LinkedList<Integer>) gamer2).peekLast();
                    int element_gamer1 = ((LinkedList<Integer>) gamer1).peekLast();
                    ((LinkedList<Integer>) gamer2).removeLast();
                    ((LinkedList<Integer>) gamer1).removeLast();
                    ((LinkedList<Integer>) gamer1).addFirst(element_gamer1);
                    ((LinkedList<Integer>) gamer1).addFirst(element_gamer2);
                    System.out.println("1 игрок: " + gamer1 +" "+"2 игрок: " + gamer2 +" First");
                }
                else if(((LinkedList<Integer>) gamer1).peekLast() < ((LinkedList<Integer>) gamer2).peekLast())
                {
                    int element_gamer1 = ((LinkedList<Integer>) gamer1).peekLast();
                    int element_gamer2 = ((LinkedList<Integer>) gamer2).peekLast();
                    ((LinkedList<Integer>) gamer1).removeLast();
                    ((LinkedList<Integer>) gamer2).removeLast();
                    ((LinkedList<Integer>) gamer2).addFirst(element_gamer2);
                    ((LinkedList<Integer>) gamer2).addFirst(element_gamer1);
                    System.out.println("1 игрок: " + gamer1 +" "+"2 игрок: " + gamer2 +" Second");
                }
                else return;
            }
            else if(((LinkedList<Integer>) gamer1).peekLast() - ((LinkedList<Integer>) gamer2).peekLast() == 9)
            {
                int element_gamer1 = ((LinkedList<Integer>) gamer1).peekLast();
                int element_gamer2 = ((LinkedList<Integer>) gamer2).peekLast();
                ((LinkedList<Integer>) gamer1).removeLast();
                ((LinkedList<Integer>) gamer2).removeLast();
                ((LinkedList<Integer>) gamer2).addFirst(element_gamer2);
                ((LinkedList<Integer>) gamer2).addFirst(element_gamer1);
                System.out.println("1 игрок: " + gamer1 +" "+"2 игрок: " + gamer2 +" Second");
            }
            else if(((LinkedList<Integer>) gamer2).peekLast() - ((LinkedList<Integer>) gamer1).peekLast() == 9)
            {
                int element_gamer2 = ((LinkedList<Integer>) gamer2).peekLast();
                int element_gamer1 = ((LinkedList<Integer>) gamer1).peekLast();
                ((LinkedList<Integer>) gamer2).removeLast();
                ((LinkedList<Integer>) gamer1).removeLast();
                ((LinkedList<Integer>) gamer1).addFirst(element_gamer1);
                ((LinkedList<Integer>) gamer1).addFirst(element_gamer2);
                System.out.println("1 игрок: " + gamer1 +" "+"2 игрок: " + gamer2 +" First");
            }
            else return;
        }

    }
}
