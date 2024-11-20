package com.kivi.model;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame {
    private int counter = 0;
    private final TextField tfCounter;

    public AWTCounter() {
        setLayout(new FlowLayout());

        Label lblCounter = new Label("Counter:");
        add(lblCounter);

        tfCounter = new TextField("0", 10);
        tfCounter.setEditable(false);
        add(tfCounter);

        Button btnCount = new Button("Count");
        add(btnCount);

        Button btnDecrement = new Button("Decrement");
        add(btnDecrement);

        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                counter++; // Увеличиваем счётчик
                tfCounter.setText(String.valueOf(counter));
            }
        });

        btnDecrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                counter--; // Уменьшаем счётчик
                tfCounter.setText(String.valueOf(counter));
            }
        });

        setTitle("AWT Counter");
        setSize(300, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AWTCounter();
    }
}

