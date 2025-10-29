/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul5;

import javax.swing.*;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class Latihan2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable () { 
            public void run() {
                JFrame frame = new JFrame("Jendela nii!");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                
                JLabel label = new JLabel("nah ini label!");
                frame.add(label);
                frame.setVisible(true);
            }
        });
    }
    
}
