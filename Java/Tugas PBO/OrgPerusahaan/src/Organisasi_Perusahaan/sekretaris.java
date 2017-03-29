package Organisasi_Perusahaan;



public class sekretaris extends pegawai {

    
    private String nama;

    
    private String jabatan = "sekretaris";

     
    private int gaji;
    
    private int upah_lem = 50000;

     
    public sekretaris () {
    }

    
    public int getGaji () {
        gaji = super.getBaseGaji()+ upah_lem;
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


}

