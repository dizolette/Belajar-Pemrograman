/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisasi_Perusahaan;

/**
 *
 * @author ecko
 */
public class perusahaan {
    
    public void cetak(String nama, String jabatan, double gaji){
        System.out.println("nama        :" + nama);
        System.out.println("jabatan     :" + jabatan);
        System.out.println("gaji        :" + gaji);
        System.out.println("\n");
    }
    
    public static void main(String [] args){
        
        
        perusahaan obj = new perusahaan();
        
        //pegawai peg = new pegawai();
        //peg.setBaseGaji(4000000);
        
        pegBiasa orangB = new pegBiasa();
        orangB.setNama("andi");
        
        obj.cetak(orangB.getNama(),orangB.getJabatan(), orangB.getGaji());
        
        manager manajer = new manager();
        manajer.setNama("albert");
        obj.cetak(manajer.getNama(),manajer.getJabatan(), manajer.getGaji());
        
        sekretaris sekre = new sekretaris();
        sekre.setNama("lydia");
        obj.cetak(sekre.getNama(),sekre.getJabatan(), sekre.getGaji());
        
        programmer progg = new programmer();
        progg.setNama("dono");
        obj.cetak(progg.getNama(),progg.getJabatan(), progg.getGaji());
        
        eksManager eksMan = new eksManager();
        eksMan.setNama("dodit");
        obj.cetak(eksMan.getNama(),eksMan.getJabatan(), eksMan.getGaji());
        
    }
}
