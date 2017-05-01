/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import hospital.Aplikasi;
import hospital.Dokter;
//import hospital.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hideless
 */
public class db {
    private Connection connection;
    public void setConnection(){
        try{
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/hospital";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Not Connected");
        }
    }
    
    public void saveDokter(Dokter d){
        try{
            Statement stmt = connection.createStatement();
            String query = "INSERT INTO dokter (ID, Title, Name, Age, Gender, Speciality, Salary) VALUES "
                    + "('"+d.getId()
                    +"','" +d.getTitle()
                    +"','" +d.getNama()
                    +"'," +d.getAge()
                    +"'," +d.getGender()
                    +"'," +d.getSpeciality()
                    +"'," +d.getSalary()
                    +")";
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Berhasil Simpan ke Database!");
            //stmt.close();
            //System.out.println("Berhasil Simpan ke DB");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Gagal Simpan ke DB");
        }
    }
    
//    public Aplikasi loadLogin(String id){
//        try{
//            Statement stmt = connection.createStatement();
//            String query = "select * from login where id='" + id + "'";
//            ResultSet rs = stmt.executeQuery(query);
//            Aplikasi p = null;
//            while (rs.next()){
//                String nama = rs.getString(2);
//                p = new login
//            }
//            return p;
//        }
//        catch (Exception e){
//            System.out.println("Terjadi Error Load Person");
//            return null;
//        }
//    }
}
