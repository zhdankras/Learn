package ru.mirea.lab6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Game extends JFrame{

    JPanel p = new JPanel();
    JTextField text = new JTextField();
    JButton button = new JButton("OK");
    JLabel label =  new JLabel("Введите число(0-20): ");
    JLabel label2 = new JLabel();
    int a = 0; // Начальное значение диапазона
    int b = 20; // Конечное значение диапазона
    int random_number; // Рандомное число
    int t = 3; // Количество попыток
    int number; // Число пользователя
    int razn_number; // Разница между random_number и number

    public Game() {
        super("Угадай число!");
        setVisible(true);
        setSize(700, 50);

        add(p);
        p.setLayout(new GridLayout(1,1));

        p.add(label);
        p.add(text);
        p.add(button);
        p.add(label2);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t--;
                label2.setText("У вас осталось: " + t +" попыток");
                random_number = a + (int) (Math.random() * b);
                JDialog dialog = new JDialog();
                dialog.setSize(350, 100);
                JLabel label3 = new JLabel();
                number = Integer.parseInt(text.getText());

                if(t > -1) {
                    if(random_number > number)
                    {
                        dialog.setVisible(true);
                        razn_number = random_number - number;
                        label3.setText("Вы не угадали! " + "Ваше число меньше заданного на " + razn_number);
                        dialog.add(label3);
                    }
                    else if(number > random_number)
                    {
                        dialog.setVisible(true);
                        razn_number = number - random_number;
                        label3.setText("Вы не угадали! " + "Ваше число больше заданного на " + razn_number);
                        dialog.add(label3);
                    }
                    else
                    {
                        dialog.setVisible(true);
                        label3.setText("Вы угадали!");
                        dialog.add(label3);
                        setVisible(false);
                    }
                }
               // else setVisible(false);
                if (number > 20 || t == 0) setVisible(false);
            }
        });
    }

}
