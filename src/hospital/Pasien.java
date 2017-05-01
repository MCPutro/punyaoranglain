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
public class Pasien extends Orang{
    private String disease;
    private String bloodType;

    public Pasien(String disease, String bloodType, String id, String title, String nama, int age, String gender) {
        super(id, title, nama, age, gender);
        this.disease = disease;
        this.bloodType = bloodType;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Orang{" + "ID=" + id + ", title=" + title + ", nama=" + nama + ", age=" + age + ", gender=" + gender + '}';
    }
}
