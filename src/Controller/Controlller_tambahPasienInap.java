/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.tambahPasien;
import View.tambahPasienInap;
import hospital.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sabda Yagra Pratama
 */
public class Controlller_tambahPasienInap implements ActionListener {

    Aplikasi app;
    tambahPasienInap pi;

    public Controlller_tambahPasienInap(Aplikasi app) {
        this.pi = pi;
        pi = new tambahPasienInap();
//        pi.addListen(this);
        pi.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
//        if (o.equals(pi.getTambah())) {
//            String disease = pi.getPenyakit();
//            String nama = pi.getNamaPasien();
//            String floor = pi.getBoxLantai();
//            String name = pi.getNamaDokter();
//            int nomorKamar = pi.getNoKamar();
//            String kelas = pi.getBoxKelas();
//            app.addPasien(disease, floor, name, name, nama, nomorKamar, kelas);
//            app.addRuangan(kelas, nomorKamar, nomorKamar);
//            app.addDokter(kelas, nomorKamar, name, name, nama, nomorKamar, kelas);
//
//        }
    }

}
