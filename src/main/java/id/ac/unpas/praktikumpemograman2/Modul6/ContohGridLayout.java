/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul6;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class ContohGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 baris, 2 kolom, 5px h-gap, 5px v-gap
        
        frame.add(new JLabel("Label 1 :"));
        frame.add(new JTextField());
        frame.add(new JLabel("Label 2"));
        frame.add(new JPasswordField());
        frame.add(new JButton("LOGIN"));
        frame.add(new JButton("BATAL"));
        
        frame.setVisible(true);
    }
}
