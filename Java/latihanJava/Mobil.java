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
public class Mobil {
    String warna;
    int jumlah_pintu;
    float isi_tangki;
    
    public void Maju(int maju){
        int majukedepan=0;
        majukedepan = majukedepan + maju;
        System.out.println("mobil maju sejauh " + maju + " meter");
    }
    
    public void Mundur(int mundur){
        int mundurbelakang=0;
        mundurbelakang = mundurbelakang + mundur;
        System.out.println("Mobil mundur sejauh " + mundur + " meter");
    } 
    
    public static void main(String[]args){
        Mobil BMW = new Mobil();
        BMW.Maju(75);
        BMW.Mundur(5);
        
    }
}


