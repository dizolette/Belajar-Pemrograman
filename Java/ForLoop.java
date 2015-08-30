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
public class ForLoop {
    
    public static void main(String[] args) {
        
        int i, j;
        for(i = 10; i > 0; i--) {
            for(j = 1; j < i; j++ ) {
                System.out.print("*");   
            }
            System.out.println("");
        }
    }
}
