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
import javax.swing.JOptionPane;
public class Perancis {
    
    public static void main(String[] args){
        String nama="", jk="", ket = "";
        int umur, total;
          
        total = 1;
        while(total <=5){
            
            nama = JOptionPane.showInputDialog("masukan nama anda: ");
            jk = JOptionPane.showInputDialog("Jenis Kelamin (P/L): ");
            umur = Integer.valueOf(JOptionPane.showInputDialog("masukan umur anda: "));
            
            if(umur > 17){
                //bandingin string pakai equals() -> ini bandingin isi dari variabel
                // kalau == bandingin reference nya(alamat objeknya)
                if(jk.equalsIgnoreCase("p")){
                    ket = "Selamat, anda lulus!";
                    JOptionPane.showMessageDialog(null, ket);
                    total = total + 1;
                }
                else{
                    ket = "maaf, anda bukan perempuan.";
                    JOptionPane.showMessageDialog(null, ket);
                }
            }
            else{
                ket = "maaf, anda terlalu muda.";
                JOptionPane.showMessageDialog(null, ket);
            }
            
            System.out.println("Nama: " + nama);
            System.out.println("keterangan: " + ket);
            System.out.println("");
        }
    }
}
