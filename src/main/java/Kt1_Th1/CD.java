/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Kt1_Th1;

/**
 *
 * @author ADMIN
 */
public class CD {
     public String maso;
     public String tenCD;
     public double giaban;
     public String casi;
     public int namphathanh;

    public CD(String maso, String tenCD, String casi,double giaban, int namphathanh) {
        this.maso = maso;
        this.tenCD = tenCD;
        this.giaban=giaban;
        this.casi = casi;
        this.namphathanh = namphathanh;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }

    @Override
    public String toString() {
        return "CD{" + "maso=" + maso + ", tenCD=" + tenCD + ", giaban=" + giaban + ", casi=" + casi + ", namphathanh=" + namphathanh + '}';
    }
}
