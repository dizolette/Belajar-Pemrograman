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
//parent class
public class Binatang {
    int umur;
    String warna;
    
    // method get = return
    int get_umur(){
        return umur;
    }
    
    //method set = void
    void set_umur(int umur){
        this.umur = umur;
    }
}

//inheritance class subclass extends parentclass
class karnivora extends Binatang {
    
    public static void main(String[] args){
        
        //membuat objek baru dari kelas karnivora
        karnivora k = new karnivora();
        k.set_umur(18);
        
        // k.umur memanggil atribut
        System.out.println(k.umur);
    }
    
}