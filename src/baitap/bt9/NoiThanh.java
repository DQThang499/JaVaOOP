package baitap.bt9;

public class NoiThanh extends ChuyenXe {
    private String sotuyen;
    private int sokm;
    public NoiThanh(String masochuyen, String taixe,String soxe, double doanhthu,String sotuyen,int sokm){
        super(masochuyen,taixe,soxe,doanhthu);
        this.sotuyen = sotuyen;
        this.sokm = sokm;
    }
    public String getSotuyen(){
        return sotuyen;
    }
    public void setSotuyen(String sotuyen){
        this.sotuyen = sotuyen;
    }
    public int getSokm(){
        return sokm;
    }
    public void setSokm(){
        this.sokm = sokm;
    }
    @Override
    public String toString(){
        return "Noithanh{" +
                "mã số chuyến = '" + masochuyen +'\''+
                ",tài xế = '" + taixe + '\''+
                ",số xe ='" +soxe + '\''+
                ",doanh thu = " + doanhthu +
                ",số tuyến ='" + sotuyen + '\''+
                ", số km ="+ sokm+
                '}';

    }
}
