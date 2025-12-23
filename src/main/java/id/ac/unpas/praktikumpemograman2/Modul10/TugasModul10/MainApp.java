/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10;

import id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.view.MahasiswaView;
import javax.swing.SwingUtilities;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MahasiswaView().setVisible(true);
        });
    }
}