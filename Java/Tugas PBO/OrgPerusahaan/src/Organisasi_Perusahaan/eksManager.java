package Organisasi_Perusahaan;


 
public class eksManager extends manager {

     
    private String nama;
    private String jabatan = "eksekutif manager";   
    private double gaji;
    
    public eksManager () {
    }
    
    public double getGaji () {
        gaji = 1.5 * (super.getBaseGaji());
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

