/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul2_2;

/**
 *
 * @author client
 */
public class Employe extends Person {
        private String noKaryawan;

    public Employe(String nonKaryawan, String nama,int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    
    public void info ()
    {
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
        
    
}
