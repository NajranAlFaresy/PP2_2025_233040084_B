/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul8;

import id.ac.unpas.praktikumpemograman2.Modul8.controller.PersegiPanjangController;
import id.ac.unpas.praktikumpemograman2.Modul8.model.PersegiPanjangModel;
import id.ac.unpas.praktikumpemograman2.Modul8.view.PersegiPanjangView;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class main {
    public static void main(String[] args) {
        PersegiPanjangModel model = new PersegiPanjangModel();
        PersegiPanjangView view = new PersegiPanjangView();
        PersegiPanjangController controller = new PersegiPanjangController(model, view);

        view.setVisible(true);
    }
}