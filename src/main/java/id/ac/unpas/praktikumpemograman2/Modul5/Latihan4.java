/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul5;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author NAJRAN AL-FARESY
 */
public class Latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("contoh BorderLayout nih!");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frame.setLayout(new BorderLayout());
                 
                JLabel label = new JLabel ("Label ada di atas yee (NORTH)");
                JButton button = new JButton ("Tombolnye di bawahhh! (SOUTH)");
                
                button.addActionListener(e -> {
                    label.setText("Tombol SOUTH-nye di pijit tuh");
                });
                
                frame.add(label, BorderLayout.NORTH);
                frame.add(button, BorderLayout.SOUTH);
                
                frame.setVisible(true);
            }
        });
    }
}
