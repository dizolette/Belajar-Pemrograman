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
public class PerancisScanner {
    
    public static void main(String[] args){
        
        String nama="", jk="", ket = "";
        int umur, total;
          
        total = 1;
        while(total <=5){
             Scanner input = new Scanner(System.in);
            
            System.out.print("masukan nama: ");
            nama = input.nextLine();
            
            System.out.print("Jenis Kelamin(P/L): ");
            jk = input.nextLine();
            
            System.out.print("masukan Umur: ");
            umur = input.nextInt();
            
            if(umur > 17){
                //bandingin string pakai equals() -> ini bandingin isi dari variabel
                // kalau == bandingin reference nya(alamat objeknya)
                if(jk.equalsIgnoreCase("p")){
                    ket = "Selamat, anda lulus!";
                    total = total + 1;
                }
                else{
                    ket = "maaf, anda bukan perempuan.";
                }
            }
            else{
                ket = "maaf, anda terlalu muda.";
            }
            
            System.out.println("");
            System.out.println("Nama: " + nama);
            System.out.println("keterangan: " + ket);
            System.out.println("");
        }
    }
}
