package com.yueping.gui;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

    public static void main(String[] args){
/*//        SwingControlDemo swingControlDemo = new SwingControlDemo();
//        swingControlDemo.showEventDemo();

        // Creating instance of JFrame
        JFrame frame = new JFrame("My First Swing Example");
        // Setting the width and height of frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        *//* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific
         * positions in a JFrame. Inside panels we can add text
         * fields, buttons and other components.
         *//*
//        JPanel panel = new JPanel();
        // adding panel to frame
        PopupComponent popupComponent = new PopupComponent();
        frame.add(popupComponent.getPanel());
        *//* calling user defined method for adding components
         * to the panel.
         *//*
//       Login login = new Login();
//       login.placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);*/

        Connection connection = null;
        try {
            Class.forName("org.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://172.21.139.13:3307/www", "chaikuprod", "testchaiku");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
