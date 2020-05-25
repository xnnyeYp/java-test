package com.yueping.gui;

import javax.swing.*;
import java.awt.*;

class Login {

    public void placeComponents(JPanel panel) {

        /* We will discuss about layouts in the later sections
         * of this tutorial. For now we are setting the layout
         * to null
         */
        panel.setLayout(null);

        // Creating JLabel
        JLabel userLabel = new JLabel("User");
        /* This method specifies the location and size
         * of component. setBounds(x, y, width, height)
         * here (x,y) are cordinates from the top left
         * corner and remaining two arguments are the width
         * and height of the component.
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* Creating text field where user is supposed to
         * enter user name.
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*This is similar to text field but it hides the user
         * entered data and displays dots instead to protect
         * the password like we normally see on login screens.
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JLabel dbLabel = new JLabel("database");
        dbLabel.setBounds(10, 80, 80, 25);
        panel.add(dbLabel);
        JComboBox<String> dbComboBox = new JComboBox<>();
        dbComboBox.addItem("www");
        dbComboBox.addItem("orders");
        dbComboBox.addItem("haoke");
        dbComboBox.setBounds(100, 80, 100, 25);
        panel.add(dbComboBox);

        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(new Rectangle());

        panel.add(loginButton);
    }

}
