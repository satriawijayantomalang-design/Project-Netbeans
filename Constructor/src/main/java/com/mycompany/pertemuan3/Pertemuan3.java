/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan3;

/**
 *
 * @author FiTo
 */
public class Pertemuan3 {

    public static void main(String[] args) {
        System.out.println("Info Mobil");
        Mobil mobilku = new Mobil();
        mobilku.tampilData();
        System.out.println("Kategori" + mobilku.kategoriMobil());
        
        System.out.println("=======================");
        System.out.println("Info Motor");
        Motor m1 = new Motor("MioJ", "Hitam", 2013);
        Motor m2 = new Motor("MX King", "Merah", 2023);
        m1.info();
        System.out.println("Kategori: " + m1.kategoriMotor());
        System.out.println();
        m2.info();
        System.out.println("Kategori: " + m2.kategoriMotor());
        
    
    }
}
