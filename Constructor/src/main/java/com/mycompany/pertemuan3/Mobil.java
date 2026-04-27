/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author FiTo
 */
public class Mobil {
    String merk, warna;
    int tahunProduksi;
    //contoh constructor tanpa parameter
    public Mobil(){
    merk = "Avanza";
    warna = "Silver";
    tahunProduksi = 1980;
    }
    
    //Method tampa nilai balik
    void tampilData(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun" + tahunProduksi);
    }
    
    //Method dengan nilai balik
    String kategoriMobil(){
    if (tahunProduksi >= 2015){
        return "Mobil Baru";
    } else if (tahunProduksi >= 2000){
        return "Mobil Menengah";
    }else{
        return "Mobil Lama";
    }
    }
}
