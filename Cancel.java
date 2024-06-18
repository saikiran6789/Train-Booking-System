/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereser;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Cancel extends JFrame implements ActionListener {
    JTextField pnrField;
    JButton cancelButton;
    ArrayList<Reservation> reservations;
    
    public Cancel(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
        
        setTitle("Cancellation Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        pnrField = new JTextField(15);
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("PNR:"));
        panel.add(pnrField);
        panel.add(cancelButton);
        
        add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String pnr = pnrField.getText();
        Iterator<Reservation> iterator = reservations.iterator();
        
        boolean found = false;
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.trainNumber.equals(pnr)) {
                iterator.remove();
                found = true;
                break;
            }
        }
        
        if (found) {
            JOptionPane.showMessageDialog(this, "Cancellation successful");
        } else {
            JOptionPane.showMessageDialog(this, "PNR not found");
        }
    }
    
    public static void main(String[] args) {
        new Cancel(Reser.reservations).setVisible(true);
    }
}

