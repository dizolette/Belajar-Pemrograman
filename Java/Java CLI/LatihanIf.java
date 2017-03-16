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
public class LatihanIf {
    
    public static void main(String[] args){
        
        //If, Else, else if
        int x, y, z;
        x = 10;
        y = 2;
        z = x + y;
        
        if(z == 12){
            System.out.println("Nilainya adalah 12"); //jika 12 masuk kesini
        }
        else if(z < 12){
            System.out.println("Nilainya kurang dari 12"); //jika kurang dari 12 kesini
        }
		else {
			System.out.println("Nilainya lebih besar dari 12"); // jika lebih dari 12 kesini
		}
    }
    
    
}
