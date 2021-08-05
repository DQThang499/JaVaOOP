package baitap.bt9;

public class NgoaiThanh extends ChuyenXe {
    private String noiden;
    private int songaydiduoc;
    public NgoaiThanh(String masochuyen, String taixe,String soxe, double doanhthu,String noiden,int songaydiduoc){
        super(masochuyen,taixe,soxe,doanhthu);
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
    }
    public String getNoiden(){
        return noiden;
    }
    public void setNoiden(String noiden){
        this.noiden = noiden;
    }
    public int getSongaydiduoc(){
        return songaydiduoc;
    }
    public void setSongaydiduoc(int songaydiduoc){
        this.songaydiduoc = songaydiduoc;
    }
    @Override
    public String toString(){
        return "Ngoại Thành {"+
                ",mã số chuyến ='" + masochuyen +'\''+
                ",tài xế = '" + taixe + '\''+
                ",số xe ='" + soxe + '\''+
                ",doanh thu ="+ doanhthu +
                ",nơi đến ='" + noiden + '\''+
                ",số ngày đi được =" + songaydiduoc +
                '}';
    }

}
