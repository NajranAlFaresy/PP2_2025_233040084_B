/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul8.controller;

import id.ac.unpas.praktikumpemograman2.Modul8.model.PersegiPanjangModel;
import id.ac.unpas.praktikumpemograman2.Modul8.view.PersegiPanjangView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class PersegiPanjangController {

    private PersegiPanjangModel model;
    private PersegiPanjangView view;

    public PersegiPanjangController(PersegiPanjangModel model, PersegiPanjangView view) {
        this.model = model;
        this.view = view;

        this.view.addHasilListener(new HasilListener());
        this.view.addResetListener(new ResetListener());
    }

    class HasilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double p = view.getPanjang();
                double l = view.getLebar();

                model.setPanjang(p);
                model.setLebar(l);

                model.hitungLuas();
                model.hitungKeliling();

                view.setLuas(model.getLuas());
                view.setKeliling(model.getKeliling());

            } catch (NumberFormatException ex) {
                view.tampilkanPesanError("Masukkan angka yang valid!");
            }
        }
    }

    class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.resetInput();
        }
    }
}