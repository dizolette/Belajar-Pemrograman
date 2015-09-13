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
public class Constructor {
    
    int panjang = 10;
    
    /* -tanpa parameter
    public Constructor(){
        panjang = 15;
    }
    */ 
    
    //constructor harus sama dengan nama kelas
    //ini kontruktor
    public Constructor(int panjang){
        this.panjang = panjang;
    }
    
    public static void main(String[] args){
        Constructor test = new Constructor(20);
        Constructor test2 = new Constructor(25);
        
        System.out.println(test.panjang);
        System.out.println(test2.panjang);
    }
}
