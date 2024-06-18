/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlinereser;
import javax.swing.*;
import java.awt.event.*;

public class Onlinereser extends JFrame implements ActionListener {
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;
    
    public Onlinereser() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        userField = new JTextField(15);
        passField = new JPasswordField(15);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(userField);
        panel.add(new JLabel("Password:"));
        panel.add(passField);
        panel.add(loginButton);
        
        add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());
        
        if (authenticate(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful");
            new Reser().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials");
        }
    }
    
    private boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("password"); 
    }
    
    public static void main(String[] args) {
        new Onlinereser().setVisible(true);
    }
}



