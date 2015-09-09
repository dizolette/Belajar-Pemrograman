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
public class Segitiga2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int baris, n;
        
        System.out.print("masukan banyak baris: ");
        baris = input.nextInt();
        
        //gede ke kecil
        for(int i = 1; i<= baris;i++){
            for(int j = 0; j <= baris;j++){
                if(j >= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        //kecil ke gede
        for(int i = baris; i>= 1;i--){
            for(int j = 1; j <= (baris + 1) ;j++){
                if(j <= i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println("");
        }
    }
}
