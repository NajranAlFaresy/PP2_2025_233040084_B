/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.view;

import id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.controller.MahasiswaController;
import id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.model.Mahasiswa;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class MahasiswaView extends JFrame {

    private JTextField txtNama, txtNIM, txtJurusan, txtCari;
    private JButton btnSimpan, btnEdit, btnHapus, btnClear, btnCari;
    private JTable tableMahasiswa;
    private DefaultTableModel model;
    private MahasiswaController controller = new MahasiswaController();

    public MahasiswaView() {
        setTitle("Aplikasi CRUD Mahasiswa (MVC) - TugasModul10");
        setSize(650, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel Form
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelForm.add(new JLabel("Nama:"));
        txtNama = new JTextField();
        panelForm.add(txtNama);

        panelForm.add(new JLabel("NIM:"));
        txtNIM = new JTextField();
        panelForm.add(txtNIM);

        panelForm.add(new JLabel("Jurusan:"));
        txtJurusan = new JTextField();
        panelForm.add(txtJurusan);

        // Panel Tombol + Cari
        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        btnSimpan = new JButton("Simpan");
        btnEdit = new JButton("Edit");
        btnHapus = new JButton("Hapus");
        btnClear = new JButton("Clear");
        panelTombol.add(btnSimpan);
        panelTombol.add(btnEdit);
        panelTombol.add(btnHapus);
        panelTombol.add(btnClear);

        panelTombol.add(new JLabel("Cari Nama:"));
        txtCari = new JTextField(10);
        btnCari = new JButton("Cari");
        panelTombol.add(txtCari);
        panelTombol.add(btnCari);

        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelForm, BorderLayout.CENTER);
        panelAtas.add(panelTombol, BorderLayout.SOUTH);
        add(panelAtas, BorderLayout.NORTH);

        // Tabel
        model = new DefaultTableModel(new Object[]{"No", "Nama", "NIM", "Jurusan"}, 0);
        tableMahasiswa = new JTable(model);
        add(new JScrollPane(tableMahasiswa), BorderLayout.CENTER);

        // Listener
        btnSimpan.addActionListener(e -> simpanData());
        btnEdit.addActionListener(e -> ubahData());
        btnHapus.addActionListener(e -> hapusData());
        btnClear.addActionListener(e -> kosongkanForm());
        btnCari.addActionListener(e -> cariData());

        tableMahasiswa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tableMahasiswa.getSelectedRow();
                txtNama.setText(model.getValueAt(row, 1).toString());
                txtNIM.setText(model.getValueAt(row, 2).toString());
                txtJurusan.setText(model.getValueAt(row, 3).toString());
            }
        });

        loadData(null);
    }

    private void loadData(String keyword) {
        model.setRowCount(0);
        List<Mahasiswa> list = controller.getAllMahasiswa(keyword);
        int no = 1;
        for (Mahasiswa m : list) {
            model.addRow(new Object[]{no++, m.getNama(), m.getNim(), m.getJurusan()});
        }
    }

    private void simpanData() {
        if (txtNama.getText().trim().isEmpty() || txtNIM.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }
        Mahasiswa m = new Mahasiswa(txtNama.getText(), txtNIM.getText(), txtJurusan.getText());
        controller.tambahMahasiswa(m);
        loadData(null);
        kosongkanForm();
    }

    private void ubahData() {
        Mahasiswa m = new Mahasiswa(txtNama.getText(), txtNIM.getText(), txtJurusan.getText());
        controller.ubahMahasiswa(m);
        loadData(null);
        kosongkanForm();
    }

    private void hapusData() {
        controller.hapusMahasiswa(txtNIM.getText());
        loadData(null);
        kosongkanForm();
    }

    private void cariData() {
        loadData(txtCari.getText().trim());
    }

    private void kosongkanForm() {
        txtNama.setText("");
        txtNIM.setText("");
        txtJurusan.setText("");
        txtCari.setText("");
    }
}

