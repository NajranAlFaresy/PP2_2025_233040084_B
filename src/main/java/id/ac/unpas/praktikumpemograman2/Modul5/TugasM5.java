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
public class TugasM5 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Ini ngerjain Tugas M5 cong!");
                
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                
                JLabel label = new JLabel("Labelnyee diatas yee (NORT)");
                JButton buttonwest = new JButton("WEST");
                JButton buttoncenter = new JButton("CENTER");
                JButton buttoneast = new JButton("EAST");
                JButton buttonsouth = new JButton("ini di bawah yee tombolnye (SOUTH)");
                
                buttonwest.addActionListener(e -> {
                    label.setText("WEST-nye di pencet tuh");
                });
                buttoncenter.addActionListener(e -> {
                    label.setText("CENTER-nye di pencet tuh");
                });
                buttoneast.addActionListener(e -> {
                    label.setText("EAST-nye di pencet tuh");
                });
                buttonsouth.addActionListener(e -> {
                    label.setText("SOUTH-nye di pencet tuh");
                });
                
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonwest, BorderLayout.WEST);
                frame.add(buttoncenter, BorderLayout.CENTER);
                frame.add(buttoneast, BorderLayout.EAST);
                frame.add(buttonsouth, BorderLayout.SOUTH);
                
                frame.setVisible(true);
            }
        });
    }
    
}
