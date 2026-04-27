/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author FiTo
 */
public class Motor {
    //constructor pakai parameter
    String merk;
    String warna;
    int tahunProduksi;
    public Motor(String merkMotor, String warnaMotor, int tahunProduksiMotor){
    merk = merkMotor;
    warna = warnaMotor;
    tahunProduksi = tahunProduksiMotor;
    }
    
    public void info(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahunProduksi);
    }
    
     
    String kategoriMotor(){
    if (tahunProduksi >= 2015){
        return "Motor Baru";
    } else if (tahunProduksi >= 2000){
        return "Motor Menengah";
    }else{
        return "Motor Lama";
    }
    }
}
