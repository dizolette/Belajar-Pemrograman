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
public class SegitigaSamaKaki {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan banyak baris segitiga: ");
        int in = input.nextInt();
        int i,j;
                
        for(i = 1; i <= in; i++){
            for(j = 1; j <= (in - i);j++){
                System.out.print(" ");
            }
            for(j = 1; j < 2 * i; j++){
                System.out.print("*");
            }
            for(j = 1; j <= (in - i);j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        
    }
}
