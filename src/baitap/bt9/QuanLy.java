package baitap.bt9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {
    private List<ChuyenXe> chuyenXes;
    public QuanLy(){
        this.chuyenXes = new ArrayList<>();
    }
    public void add(ChuyenXe chuyenXe){
        this.chuyenXes.add(chuyenXe);
    }
    public boolean delete(String masochuyen)
    {
        ChuyenXe chuyenXe = this.chuyenXes.stream().filter(chuyenXe1 -> chuyenXe1.getMasochuyen().equals(masochuyen))
                .findFirst().orElse(null);
        if (chuyenXe== null){
            return false;
        }
        else
            this.chuyenXes.remove(chuyenXe);
        return true;
    }
    public List<ChuyenXe> search(String masochuyen){
        return this.chuyenXes.stream().filter(chuyenXe -> chuyenXe.getMasochuyen().contains(masochuyen))
                .collect(Collectors.toList());
    }
    public void show(){
        this.chuyenXes.forEach(chuyenXe -> System.out.println(chuyenXe.toString()));
    }
    public double calculator(String masochuyen){
        ChuyenXe chuyenXe = this.chuyenXes.stream().filter(cx -> cx.getMasochuyen().equals(masochuyen))
                .findFirst().orElse(null);
        if (chuyenXe ==null){
            return 0;
        }
        return (chuyenXe.getDoanhthu());
    }
}
