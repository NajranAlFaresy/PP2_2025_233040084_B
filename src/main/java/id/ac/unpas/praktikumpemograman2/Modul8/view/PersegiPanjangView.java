/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul8.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class PersegiPanjangView extends JFrame {

    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);

    private JLabel lblHasilLuas = new JLabel("-");
    private JLabel lblHasilKeliling = new JLabel("-");

    private JButton btnHasil = new JButton("Hasil");
    private JButton btnReset = new JButton("Reset");

    public PersegiPanjangView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 260);
        this.setLayout(new GridLayout(6, 2, 10, 10));
        this.setTitle("MVC Kalkulator Persegi Panjang");

        this.add(new JLabel("Panjang:"));
        this.add(txtPanjang);

        this.add(new JLabel("Lebar:"));
        this.add(txtLebar);

        this.add(new JLabel("Luas:"));
        this.add(lblHasilLuas);

        this.add(new JLabel("Keliling:"));
        this.add(lblHasilKeliling);

        this.add(btnHasil);
        this.add(btnReset);
    }

    public double getPanjang() {
        return Double.parseDouble(txtPanjang.getText());
    }

    public double getLebar() {
        return Double.parseDouble(txtLebar.getText());
    }

    public void setLuas(double hasil) {
        lblHasilLuas.setText(String.valueOf(hasil));
    }

    public void setKeliling(double hasil) {
        lblHasilKeliling.setText(String.valueOf(hasil));
    }

    public void resetInput() {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblHasilLuas.setText("-");
        lblHasilKeliling.setText("-");
    }

    public void tampilkanPesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void addHasilListener(ActionListener listener) {
        btnHasil.addActionListener(listener);
    }

    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }
}