/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul6;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class Latihan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 2 Konverter suhu (Event)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        
        JLabel labelC = new JLabel("Celcius");
        JTextField inputC = new JTextField(10);
        JButton tombolkon = new JButton("Konversi");
        JLabel labelF = new JLabel("Fahrenheit");
        JLabel hasil = new JLabel("");
        
        frame.add(labelC);
        frame.add(inputC);
        frame.add(tombolkon);
        frame.add(labelF);
        frame.add(hasil);
        
        tombolkon.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                 double celcius = Double.parseDouble(inputC.getText());
                 double fahrenheit = (celcius * 9 / 5) + 32;
                 hasil.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame,
                            "yang bener ajee! Masukin angka cong.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
