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
public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n, int u){
        nama = n;
        umur = u;
    } 
    
    void tampilAktor(){
        System.out.println("Namaku : " + nama);
        System.out.println("Umurku : " + umur + " tahun");
    }
    
    public static void main(String[]args){
        Aktor a;
        System.out.println("");
        a = new Aktor("Dedy Mizwar", 50);
        a.tampilAktor();
        System.out.println("===============");
        System.out.println("");
        a = new Aktor("Rano Karno", 45);
        a.tampilAktor();
        System.out.println("===============");
    }
}
