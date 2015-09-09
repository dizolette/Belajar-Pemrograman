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
public class KotakKosong {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan tinggi kotak: ");
        int tinggi = input.nextInt();
        
        int i,j;
        for(i = 0; i <= (tinggi -1); i++){
            for(j = 0; j<= (tinggi -1); j++){
                if(i == 0 || i == (tinggi -1) || j == 0 || j == (tinggi -1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
