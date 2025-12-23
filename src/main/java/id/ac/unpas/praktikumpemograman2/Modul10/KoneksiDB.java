/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.praktikumpemograman2.Modul10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NAJRAN AL-FARESY
 */
public class KoneksiDB {

    private static Connection mysqlconfig;

    public static Connection configDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/kampus_db";
            String user = "root";
            String pass = ""; // kosong kalau XAMPP/Laragon default

            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            return mysqlconfig;

        } catch (Exception e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
    }
}

