package Organisasi_Perusahaan;


 
public class programmer extends pegawai {

    
    private String nama;

    
    private String jabatan = "programmer";

    private int upah_lem= 50000;
    private int gaji;

     
    public programmer () {
    }

    public int getGaji () {
        gaji = super.getBaseGaji() + upah_lem;
        return gaji;
    }

    
    public void setGaji (int val) {
        this.gaji = val;
    }

   
    public String getJabatan () {
        return jabatan;
    }

   
    public String getNama () {
        return nama;
    }

   
    public void setNama (String val) {
        this.nama = val;
    }

   
    public int getBaseGaji () {
        return 0;
    }

    
    public void setBaseGaji (int val) {
    }

}

