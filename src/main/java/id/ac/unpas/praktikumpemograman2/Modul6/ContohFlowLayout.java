/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul6;

import javax.swing.*;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class ContohFlowLayout {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Contoh FLowLayOut");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel ();
        
        panel.add(new JButton("Tombol one"));
        panel.add(new JButton("Tombol two"));
        panel.add(new JButton("Tombol tiga"));
        panel.add(new JButton("Empat panjanggggggg"));
        panel.add(new JButton("Tombol 5"));
        
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
