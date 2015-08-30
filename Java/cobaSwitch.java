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
 
 // import library JOptionPane dari Javax.swing
import javax.swing.*;
public class cobaSwitch {
    
	// deklarasi main method
    public static void main(String[] args){
        
		// deklarasi variabel
        String a, msg;
		// menanyakan user untuk mengisi nilai a
        a = JOptionPane.showInputDialog("Masukan Nilai: ");
        // konversi nilai a dari tipe data String ke tipe data integer
		int x = Integer.valueOf(a);
        
		// operasi kondisi switch , dimana jika x memenuhi case selector
		switch(x){
            // break; digunakan untuk memberhentikan proses jika sudah memenuhi salah satu case tersebut
            case 0:
                msg = "Your Grade: failed";
                JOptionPane.showMessageDialog(null, msg);
                break;
                
            case 5:
                msg = "Your Grade: Great!";
                JOptionPane.showMessageDialog(null, msg);
                break;
                
            case 10:
                msg = "Your Grade: Excellent!";
                JOptionPane.showMessageDialog(null, msg);
                break;
                
            default:
                msg = "Error!";
                JOptionPane.showMessageDialog(null, msg);
        }
    }
    
}
