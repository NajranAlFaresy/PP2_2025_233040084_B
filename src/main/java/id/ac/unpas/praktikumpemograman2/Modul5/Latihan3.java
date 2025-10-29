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
public class Latihan3 {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() { 
            public void run(){
                JFrame frame = new JFrame("jendela gedung a!");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout ());
                
                JLabel label = new JLabel("ini label brooo!");
                JButton button = new JButton("ini bisa di pencet anjayy");
                
                button.addActionListener(e -> {
                    
                    label.setText("Mantapppp!");
                });
                
                frame.add(label);
                frame.add(button);
                
                frame.setVisible(true);
            }
        });
    }
}
