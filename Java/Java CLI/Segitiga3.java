/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package latihan;

/**
 *
 * @author EKO
 */
import java.util.Scanner;
public class Segitiga3 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan tinggi segitiga: ");
        int tinggi = input.nextInt();
        int c,i,j,q, kolom;
        
        kolom = tinggi * 2;
        
        if(kolom % 2 == 0){
            kolom += 1;
        }
        else{
            kolom += 0;
        }
        
        
        
        q = ((kolom + 1)/2) + 1;
        
        //segitiga sama kaki kecil ke besar
        for(i = 1; i <= tinggi; i++){
            for(j = 1; j <= kolom; j++){
                if(i == 1){
                    c = (i + j) - q;
                }
                else{
                    c = (i + j) - ((q+i)-1);
                }
                
                if(-i < c && c < i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        
        
        
        
        //segitiga sama kaki besar ke kecil
        for(i = tinggi; i >= 1; i--){
            for(j = 1; j <= kolom; j++){
                if(i == 1){
                    c = (i + j) - q;
                }
                else{
                    c = (i + j) - ((q+i)-1);
                }
                
                if(-i < c && c < i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
        System.out.println("tingginya :" + tinggi);
        
        
        
        
        //membuat diamond
         //segitiga sama kaki kecil ke besar
        for(i = 1; i <= tinggi; i++){
            for(j = 1; j <= kolom; j++){
                if(i == 1){
                    c = (i + j) - q;
                }
                else{
                    c = (i + j) - ((q+i)-1);
                }
                
                if(-i < c && c < i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
        
        //segitiga sama kaki besar ke kecil
        for(i = (tinggi+1); i >= 1; i--){
            for(j = 1; j <= kolom; j++){
                if(i == 1){
                    c = (i + j) - q;
                }
                else{
                    c = (i + j) - ((q+i)-1);
                }
                
                if(-i < c && c < i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
        System.out.println("tingginya :" + tinggi);
        
        
        
        
        //membuat diamond kosong
         //segitiga sama kaki kecil ke besar
        for(i = 1; i <= tinggi; i++){
            for(j = 1; j <= kolom; j++){
                if(i == 1){
                    c = (i + j) - q;
                }
                else{
                    c = (i + j) - ((q+i)-1);
                }
                
                if(-i < c && c < i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            
            System.out.println("");
        }
        
        //segitiga sama kaki besar ke kecil
        for(i = tinggi; i >= 1; i--){
            for(j = 1; j <= kolom; j++){
                if(i == 1){
                    c = (i + j) - q;
                }
                else{
                    c = (i + j) - ((q+i)-1);
                }
                
                if(-i < c && c < i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            
            System.out.println("");
        }
        System.out.println("tingginya :" + tinggi);
    }
}
