package com.kivi.model;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
    private int sum = 0;
    private final TextField tfInput;
    private final TextField tfSum;

    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));

        Label lblInput = new Label("Enter an integer:");
        add(lblInput);

        tfInput = new TextField();
        add(tfInput);

        Label lblSum = new Label("The accumulated sum is:");
        add(lblSum);

        tfSum = new TextField("0");
        tfSum.setEditable(false);
        add(tfSum);

        tfInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int number = Integer.parseInt(tfInput.getText());
                sum += number;
                tfInput.setText("");
                tfSum.setText(String.valueOf(sum));
            }
        });

        setTitle("AWT Accumulator");
        setSize(400, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
