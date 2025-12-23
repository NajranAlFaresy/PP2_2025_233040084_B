/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.controller;

import id.ac.unpas.praktikumpemograman2.Modul10.KoneksiDB; // ← pakai koneksi dari latihan
import id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.model.Mahasiswa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author NAJRAN AL-FARESY
 */
public class MahasiswaController {
    
    // CREATE
    public void tambahMahasiswa(Mahasiswa mhs) {
        try {
            Connection conn = KoneksiDB.configDB();

            // Cek NIM duplikat
            String cekSql = "SELECT COUNT(*) AS jumlah FROM mahasiswa WHERE nim = ?";
            PreparedStatement cekPst = conn.prepareStatement(cekSql);
            cekPst.setString(1, mhs.getNim());
            ResultSet rs = cekPst.executeQuery();
            if (rs.next() && rs.getInt("jumlah") > 0) {
                JOptionPane.showMessageDialog(null, "NIM sudah terdaftar!");
                return;
            }

            String sql = "INSERT INTO mahasiswa (nama, nim, jurusan) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, mhs.getNama());
            pst.setString(2, mhs.getNim());
            pst.setString(3, mhs.getJurusan());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan: " + e.getMessage());
        }
    }

    // UPDATE
    public void ubahMahasiswa(Mahasiswa mhs) {
        try {
            Connection conn = KoneksiDB.configDB();
            String sql = "UPDATE mahasiswa SET nama = ?, jurusan = ? WHERE nim = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, mhs.getNama());
            pst.setString(2, mhs.getJurusan());
            pst.setString(3, mhs.getNim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal ubah: " + e.getMessage());
        }
    }

    // DELETE
    public void hapusMahasiswa(String nim) {
        try {
            Connection conn = KoneksiDB.configDB();
            String sql = "DELETE FROM mahasiswa WHERE nim = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nim);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal hapus: " + e.getMessage());
        }
    }

    // READ
    public List<Mahasiswa> getAllMahasiswa(String keyword) {
        List<Mahasiswa> data = new ArrayList<>();
        try {
            Connection conn = KoneksiDB.configDB();
            String sql = "SELECT * FROM mahasiswa";
            if (keyword != null && !keyword.isEmpty()) {
                sql += " WHERE nama LIKE ?";
            }
            PreparedStatement pst = conn.prepareStatement(sql);
            if (keyword != null && !keyword.isEmpty()) {
                pst.setString(1, "%" + keyword + "%");
            }
            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Mahasiswa mhs = new Mahasiswa(
                    res.getString("nama"),
                    res.getString("nim"),
                    res.getString("jurusan")
                );
                data.add(mhs);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal load data: " + e.getMessage());
        }
        return data;
    }
}
