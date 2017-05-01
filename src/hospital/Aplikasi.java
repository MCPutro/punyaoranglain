/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import Database.db;
import java.util.ArrayList;

/**
 *
 * @author Hideless
 */
public class Aplikasi {
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<>();
    private db DB;
        
    public Aplikasi(){
        DB = new db();
        DB.setConnection();
    }
    
//    public void saveDokter(String speciality, int salary){
//        Dokter d = new Dokter (String speciality, int salary);
//        DB.saveDokter(d);
//    }
    
    public void addDokter(String speciality, int salary, String id, String title, String nama, int age, String gender){
        //Dokter d = this.daftarDokter.add(new Dokter(speciality, salary, id, title, nama, age, gender));
//        if (getDokter != null) {
//            throw new IllegalArgumentException("username telah dipakai");
//        }
        Dokter d = new Dokter(speciality, salary, id, title, nama, age, gender);
        daftarDokter.add(d);
        DB.saveDokter(d);
    }
    
    public void showDataDokter(){
        for (Dokter dokter:daftarDokter){
            System.out.println("Nama Dokter : " + dokter.getGender() + dokter.getNama());
        }
    }
    
    public void deleteDataDokter(int i){
        daftarDokter.remove(i);
    }
    
    public void addPasien(String disease, String bloodType, String id, String title, String nama, int age, String gender){
        this.daftarPasien.add(new Pasien(disease, bloodType, id, title, nama, age, gender));
    }
    
    public void showDataPasien(){
        for (Pasien pasien:daftarPasien){
            System.out.println(pasien.getGender() + " Nama Pasien : " + pasien.getNama() + ", Umur : " + pasien.getAge() + ", Penyakit" + pasien.getDisease());
        }
    }
    
    public void deleteDataPasien(int i){
        daftarPasien.remove(i);
    }
    
    public void addRuangan(String kelas, int nomorKamar, int floor ){
        Ruangan r = new Ruangan(kelas, nomorKamar, floor);
        this.daftarRuangan.add(r);
    }
    
    public void showDataRuangan(){
        for (Ruangan ruangan: daftarRuangan){
            System.out.println("Kelas : "+ ruangan.getClass() + ", Lantai : " + ruangan.getFloor() + ", Nomor : " + ruangan.getNomorKamar());
        }
    }
    
    public void deleteDataRuangan(int i){
        daftarRuangan.remove(i);
    }
    
    public void PasienInap(int idxruangan,int idxdok,int idxpsn){
        this.daftarRuangan.get(idxruangan).tambahPasienInap(daftarPasien.get(idxpsn), daftarDokter.get(idxdok));
        
    }
    
    public void ngesetDokter(int idxdktr1, int idxruangan, int idxpsn1){
        Dokter d= this.daftarDokter.get(idxdktr1);
        this.daftarRuangan.get(idxruangan).getPasienInap(idxpsn1).setDokter(d);
    }
    
}