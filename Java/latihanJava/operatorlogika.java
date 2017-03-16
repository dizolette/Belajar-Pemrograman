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
public class operatorlogika {
    public static void main(String[] args){
        int y = 40;
        int z = 80;
        boolean tes1=(y>40) && (z<100);
        System.out.println("Hasil tes1:"+ tes1);
        boolean tes2=(y>40 ) || (z<100);
        System.out.println("Hasil tes1:"+ tes2);
    }
}
