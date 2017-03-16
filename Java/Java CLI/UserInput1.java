import javax.swing.JOptionPane; //import JOptionPane dari package javax.swing
public class UserInput1{

	public static void main(String[] args){
		
		/* 
		ada beberapa cara untuk mendapatkan input dari user.
		1. menggunakan library java bufferedReader
		2. menggunakan JOptionPane
		3. dll
		*/
		
		/*
		- pada kodingan kali ini akan menggunakan JOptionPane(java swing GUI)
		- kita harus menambahkan package dimana JOptionPane berada
		- tambahkan package di atas kodingan anda . (import)
		*/
	
		String name = "",umur = "", msg; //deklarasi variabel
		name = JOptionPane.showInputDialog("Masukan Nama Anda: "); //memunculkan input dialog untuk identifier name
		umur = JOptionPane.showInputDialog("Masukan Umur Anda: "); //memunculkan input dialog untuk identifier umur
		msg = "Hello, " + name + " Selamat Datang ! \n" + "Umur anda " + umur + " tahun" ; //hasil gabungan data dari input user
		JOptionPane.showMessageDialog(null, msg); // menampilkan hasilnya melalui message box
	}



}