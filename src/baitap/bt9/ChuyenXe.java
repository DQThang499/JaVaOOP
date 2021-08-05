package baitap.bt9;

public class ChuyenXe {
    protected String masochuyen;
    protected String taixe;
    protected String soxe;
    protected double doanhthu;
    public ChuyenXe(String masochuyen, String taixe,String soxe, double doanhthu){
        this.masochuyen = masochuyen;
        this.taixe = taixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }
    public String getMasochuyen(){
        return masochuyen;
    }
    public void setMasochuyen(String masochuyen){
        this.masochuyen = masochuyen;
    }
    public String getTaixe(){
        return taixe;
    }
    public void setTaixe(String taixe){
        this.taixe = taixe;
    }
    public String getSoxe(){
        return soxe;
    }
    public void setSoxe(String soxe){
        this.soxe = soxe;
    }
    public double getDoanhthu(){
        return doanhthu;
    }
    public void setDoanhthu() {
        this.doanhthu = doanhthu;
    }
}
