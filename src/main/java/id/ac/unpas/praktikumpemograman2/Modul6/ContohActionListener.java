/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class ContohActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Action Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Heh, pencet dong yang ada!");
        JButton button = new JButton("ini nihhhh!");
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("tombol nye di klik");
            }
        };
        
        button.addActionListener(listener);
        
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
