/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereser;

/*import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Reser extends JFrame implements ActionListener {
    JTextField trainNumberField, fromField, toField;
    JComboBox<String> classTypeBox;
    JButton reserveButton;
    static ArrayList<Reservation> reservations = new ArrayList<>();
    
    public Reser() {
        setTitle("Reservation Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        trainNumberField = new JTextField(10);
        fromField = new JTextField(10);
        toField = new JTextField(10);
        classTypeBox = new JComboBox<>(new String[]{"First Class", "Second Class", "Sleeper"});
        reserveButton = new JButton("Reserve");
        reserveButton.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Train Number:"));
        panel.add(trainNumberField);
        panel.add(new JLabel("From:"));
        panel.add(fromField);
        panel.add(new JLabel("To:"));
        panel.add(toField);
        panel.add(new JLabel("Class Type:"));
        panel.add(classTypeBox);
        panel.add(reserveButton);
        
        add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String trainNumber = trainNumberField.getText();
        String from = fromField.getText();
        String to = toField.getText();
        String classType = (String) classTypeBox.getSelectedItem();
        
        Reservation reservation = new Reservation(trainNumber, from, to, classType);
        reservations.add(reservation);
        
        JOptionPane.showMessageDialog(this, "Reservation successful");
    }
    
    public static void main(String[] args) {
        new Reser().setVisible(true);
    }
}

class Reservation {
    String trainNumber;
    String from;
    String to;
    String classType;
    
    public Reservation(String trainNumber, String from, String to, String classType) {
        this.trainNumber = trainNumber;
        this.from = from;
        this.to = to;
        this.classType = classType;
    }
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Reser extends JFrame implements ActionListener {
    JTextField trainNumberField, fromField, toField;
    JComboBox<String> classTypeBox;
    JButton reserveButton;
    static ArrayList<Reservation> reservations = new ArrayList<>();
    
    public Reser() {
        setTitle("Reservation Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        trainNumberField = new JTextField(10);
        fromField = new JTextField(10);
        toField = new JTextField(10);
        classTypeBox = new JComboBox<>(new String[]{"First Class", "Second Class", "Sleeper"});
        reserveButton = new JButton("Reserve");
        reserveButton.addActionListener(this);
        
        // Set up panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(230, 230, 250)); // Light lavender background
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Train Number:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(trainNumberField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("From:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(fromField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("To:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(toField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel("Class Type:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(classTypeBox, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(reserveButton, gbc);
        
        add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String trainNumber = trainNumberField.getText();
        String from = fromField.getText();
        String to = toField.getText();
        String classType = (String) classTypeBox.getSelectedItem();
        
        Reservation reservation = new Reservation(trainNumber, from, to, classType);
        reservations.add(reservation);
        
        JOptionPane.showMessageDialog(this, "Reservation successful");
    }
    
    public static void main(String[] args) {
        new Reser().setVisible(true);
    }
}

class Reservation {
    String trainNumber;
    String from;
    String to;
    String classType;
    
    public Reservation(String trainNumber, String from, String to, String classType) {
        this.trainNumber = trainNumber;
        this.from = from;
        this.to = to;
        this.classType = classType;
    }
}


