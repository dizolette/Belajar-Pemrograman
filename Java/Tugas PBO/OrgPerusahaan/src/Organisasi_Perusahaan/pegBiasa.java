package Organisasi_Perusahaan;
 
public class pegBiasa extends pegawai {

    private String nama;
    private String jabatan = "pegawai biasa";
    private int gaji;

    public pegBiasa () {
       
    }
 
    public int getGaji () {
        gaji = super.getBaseGaji();
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

