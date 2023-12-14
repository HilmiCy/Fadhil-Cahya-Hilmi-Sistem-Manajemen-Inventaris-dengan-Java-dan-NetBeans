/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClassDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 
 */
public class ClassDatabase {
    private static Connection koneksi;
    public static Connection getkoneksi() {
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/fadhil";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t){
                System.out.println("Error membuat koneksi");
            }
        }
            return koneksi;
    }
}
