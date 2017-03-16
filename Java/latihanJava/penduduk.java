/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanJava;

/**
 *
 * @author ecko
 */
public class penduduk {
    private String nama,ttl,alamat,nama_ortu,pekerjaan;
    private int penghasilan;
    
    public void setNama(String nama){    
        //tambahan
        this.nama = nama;
    }
    
    public void setTTL(String ttl){    
        //tambahan
        this.ttl = ttl;
    }
    
    public void setAlamat(String alamat){    
        //tambahan
        this.alamat = alamat;
    }
    
    public void setOrtu(String nama_ortu){    
        //tambahan
        this.nama_ortu = nama_ortu;
    }
    
    public void setPekerjaan(String pekerjaan){    
        //tambahan
        this.pekerjaan = pekerjaan;
    }
    
    public void setPenghasilan(int penghasilan){    
        //tambahan
        this.penghasilan = penghasilan;
    }
    
    public void printIdentitas(String nama, String ttl, String alamat, String nama_ortu, String pekerjaan){
        System.out.println("Nama Penduduk : " + nama);
        System.out.println("Tempat/Tanggal Lahir : " + ttl);
        System.out.println("Alamat Rumah : " + alamat);
        System.out.println("Nama Orang Tua : " + nama_ortu);
        System.out.println("Pekerjaan : " + pekerjaan);
    }
    
    public void printIdentitas(int penghasilan){
        System.out.println("Penghasilan bersih perbulan Rp." +penghasilan);
    }
    
    public static void main(String[]args){
        penduduk pk_kota = new penduduk();
        pk_kota.printIdentitas("Ruby", "Gorontalo/01 januari 1990", "Jl. Cempaka No.5 Gorontalo", "Wiryana", "Wiraswasta");
        pk_kota.printIdentitas(5000000);
    }
}
