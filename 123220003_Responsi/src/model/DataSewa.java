package model;

public class DataSewa {
    private String np; // nama penyewa
    private String nb; // nama buku
    private String jb; // jenis buku
    private String nt; // nomor telepon
    private Double dp; // durasi penitipan
    private Double tb; // total biaya
    
    public String getNP() {
        return np;
    }
    
    public void setNP(String np) {
        this.np = np;
    }
    
    public String getNB() {
        return nb;
    }
    
    public void setNB(String nb) {
        this.nb = nb;
    }
    
    public String getJB() {
        return jb;
    }
    
    public void setJB(String jb) {
        this.jb = jb;
    }
    
    public String getNT() {
        return nt;
    }
    
    public void setNT(String nt) {
        this.nt = nt;
    }
    
    public Double getDP() {
        return dp;
    }
    
    public void setDP(Double dp) {
        this.dp = dp;
    }
    
    public void setTB(Double tb) {
        this.tb = tb;
    }
    
    public static Double htb() {
        double tb;
        tb = 0;
        if (tb <= 2.0) {
            tb = 10000;
        } else {
            tb = 2 * 10000 + (tb + 1) * 5000;
        }
        return tb;
    }
}
