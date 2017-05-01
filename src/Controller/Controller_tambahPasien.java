/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.tambahPasien;
import hospital.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sabda Yagra Pratama
 */
public class Controller_tambahPasien implements ActionListener {
    Aplikasi app;
    tambahPasien tp;

    public Controller_tambahPasien(Aplikasi app) {
        this.app = app;
        tp = new tambahPasien();
        tp.addListen(this);
        tp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
//        if (o.equals(tp.getTambah())){
//            String disease =tp.getTfPenyakit();
//            String bloodType =tp.getTfGolDarah();
//            String id = tp.getID();
//            String title = tp.getboxTitle(); 
//            String nama = tp.getTfNama();
//            int age = tp.getTfUmur(); 
//            String gender = tp.getBoxJenisKelamin();
//            //System.out.println(disease+" "+ bloodType+" "+ id+" "+ title+" "+ nama+" "+ age+" "+ gender);
//            app.addPasien(disease, bloodType, id, title, nama, age, gender);
//            //app.showDataPasien();
//        }
    }
    
    
    
}
