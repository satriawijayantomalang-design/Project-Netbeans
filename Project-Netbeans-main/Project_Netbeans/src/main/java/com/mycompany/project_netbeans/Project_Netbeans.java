package com.mycompany.project_netbeans;
import akademis.Mata_kuliah;

public class Project_Netbeans {

    public static void main(String[] args) {
        System.out.println("Data Diri");
        System.out.println("Npm : " + Mahasiswa.Npm);
        System.out.println("Nama Lengkap : " + Mahasiswa.namaLengkap);
        System.out.println("IPK : " + Mahasiswa.getIpk());
        System.out.println("Semester : " + Mahasiswa.semester);
        System.out.println("Kode MK : " + Mata_kuliah.kode_mk);
        System.out.println("Nama MK : " + Mata_kuliah.nama_mk);
    }
}
