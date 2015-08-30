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
 
 // import library JOoptionPane dari javax.swing
import javax.swing.JOptionPane;
public class CobaOptionPane {
    
	// deklarasi main method dengan access modifier public
    public static void main(String[] args){
        // deklarasi variabel
		String name = "";
		// mendapatkan input dari user untuk mengisi nilai identifier name
        name = JOptionPane.showInputDialog("Masukan Nama Anda: ");
        
		// membuat deklarasi string baru untuk output
        String msg = "Hello, " + name + "!";
		//menampilkan output ke layar
        JOptionPane.showMessageDialog(null, msg);
    }
}
