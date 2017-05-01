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
public abstract class Orang {
    protected String id;
    protected String title;
    protected String nama;
    protected int age;
    protected String gender;

    public Orang(String id, String title, String nama, int age, String gender) {
        this.id = id;
        this.title = title;
        this.nama = nama;
        this.age = age;
        this.setGender(gender);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Laki-Laki")){
            this.gender = " Mr. ";
        }
        else if (gender.equals("Perempuan")){
            this.gender = " Mrs. ";
        }
        
    }
    
    public abstract String toString();
    
}
