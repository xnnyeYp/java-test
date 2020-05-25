package com.yueping.gui;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PopupComponent {

    public JComboBox<String> dbBox;

    public JComboBox<String> tableBox;

    private JPanel center = new JPanel();

    public PopupComponent() {
        center.setLayout(new FlowLayout(FlowLayout.LEADING,0,5));
        JPanel dbPanel = new JPanel();
        dbPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));
        JLabel dbLabel = new JLabel("db:    ");
        dbLabel.setSize(100, 25);
        dbPanel.add(dbLabel);

        dbBox = new JComboBox<>();
        dbBox.addItem("www");
        dbBox.addItem("orders");
        dbBox.addItem("haoke");
        dbBox.setSize(200, 25);
        dbPanel.add(dbBox);

        center.add(dbPanel);

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));

        JLabel tableLabel = new JLabel("table:");
        tableLabel.setSize(100, 25);
        tablePanel.add(tableLabel);

        tableBox = new JComboBox<>();
        tableBox.setSize(200, 25);
        tableBox.addItem("order_info");
        tablePanel.add(tableBox);

        center.add(tablePanel);

        JPanel genPanel = new JPanel();
        genPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));
        JButton genButton = new JButton("generate");
        genButton.setSize(300, 25);
        genPanel.add(genButton);

        center.add(genPanel);
    }

    public JPanel getPanel() {
        return center;
    }

}
