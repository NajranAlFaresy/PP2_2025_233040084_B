/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul10.TugasModul10.model;

/**
 *
 * @author NAJRAN AL-FARESY
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getJurusan() { return jurusan; }

    public void setNama(String nama) { this.nama = nama; }
    public void setNim(String nim) { this.nim = nim; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
}