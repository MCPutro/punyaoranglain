/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Hideless
 */
public class Dokter extends Orang {
    private String speciality;
    private int salary;

    public Dokter(String speciality, int salary, String id, String title, String nama, int age, String gender) {
        super(id, title, nama, age, gender);
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nama Dokter : " + getGender() + nama;
        //(String speciality, int salary, String id, String title, String nama, int age, String gender) { 
    }
    
}
