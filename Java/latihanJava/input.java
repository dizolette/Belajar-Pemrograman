/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanJava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author ecko
 */
public class input {
    public static void main (String[]args){
        BufferedReader InputData= new BufferedReader(new InputStreamReader(System.in));
        String nama = "" ;
        System.out.print("Masukkan nama anda:");
        
        try{
            nama = InputData.readLine();
        }
        catch (IOException e){
            System.out.println("Error");
        }
        
        System.out.println("Hallo nama saya " +nama);
    }
}
