package com.kivi.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTLogin extends Frame {
    private final JTextField tfLogin;
    private final JTextField tfPassword;
    private final String username = "admin";
    private final String password = String.valueOf(1234);

    public AWTLogin() {
        setLayout(new FlowLayout());

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setSize(70,20);
        add(lblLogin);

        tfLogin = new JTextField(10);
        tfLogin.setSize(193,28);
        add(tfLogin);

        JLabel lblPassword = new JLabel("Password");
        lblLogin.setSize(70,20);
        add(lblPassword);

        tfPassword = new JPasswordField(10);
        tfLogin.setSize(193,28);
        add(tfPassword);

        JButton btnEnter = new JButton("Enter");
        add(btnEnter);


        setTitle("AWTLoginPage");
        setSize(400,200);
        setLocation(500, 300);

        setVisible(true);

        btnEnter.addActionListener(listener -> {
            if (tfLogin.getText().equals(username) && String.
                    valueOf(tfPassword.getCursor()).equals(password)){
                JOptionPane.showMessageDialog(null, new JLabel
                        ("the entrance is completed"));
            }else {
                JOptionPane.showMessageDialog(null, new JLabel
                        ("Incorrect username or password!"));
            }
        });


        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
