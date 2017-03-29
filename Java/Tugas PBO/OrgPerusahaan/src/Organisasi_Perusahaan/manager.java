package Organisasi_Perusahaan;


 
public class manager extends pegawai {

   
    private String nama; 
    private String jabatan = "manager";  
    private double gaji;   
    private double bonus;

     
    public manager () {
    }
    
    public double getGaji () {
        gaji = (super.getBaseGaji())*2 + bonus;
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

