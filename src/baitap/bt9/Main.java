package baitap.bt9;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        while(true){
            System.out.println("ứng dụng kiểm soát tuyến xe ");
            System.out.println("nhập 1: thêm thông tin chuyến xe ");
            System.out.println("nhập 2: xóa chuyến xe");
            System.out.println("nhập 3: tìm kiếm chuyến xe dựa trên mã số chuyến");
            System.out.println("nhập 4: hiển thị danh sách đã nhập");
            System.out.println("nhập 5: thành tiền dựa theo tính theo doanh thu ");
            System.out.println("nhập 6: thoát chương trình ");
            String line = scanner.nextLine();
            switch (line){
                case "1":{
                    System.out.println("nhập a : chyến xe nội thành");
                    System.out.println("nhập b : chuyến xe ngoại thành");
                    String type = scanner.nextLine();
                    switch (type ) {
                        case "a":{
                            System.out.print("nhập vào mã số chuyến : ");
                            String masochuyen = scanner.nextLine();
                            System.out.print("nhập vào tên tài xế : ");
                            String taixe = scanner.nextLine();
                            System.out.print("nhập vào số xe : ");
                            String soxe = scanner.nextLine();
                            System.out.print("nhập doanh thu : ");
                            double doanhthu = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("nhập số tuyến :");
                            String sotuyen = scanner.nextLine();
                            System.out.print("nhập số km : ");
                            int sokm = scanner.nextInt();
                            ChuyenXe noithanh = new NoiThanh(masochuyen,taixe,soxe,doanhthu,sotuyen,sokm);
                            quanLy.add(noithanh);
                            System.out.println(noithanh.toString());
                            break;
                        }
                        case "b": {
                            System.out.print("nhập vào mã số chuyến : ");
                            String masochuyen = scanner.nextLine();
                            System.out.print("nhập vào tên tài xế : ");
                            String taixe = scanner.nextLine();
                            System.out.print("nhập vào số xe : ");
                            String soxe = scanner.nextLine();
                            System.out.print("nhập doanh thu : ");
                            double doanhthu = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("nhập nơi đến :");
                            String noiden = scanner.nextLine();
                            System.out.print("nhập số ngày đi được :");
                            int songaydiduoc = scanner.nextInt();
                            ChuyenXe ngoaithanh = new NgoaiThanh(masochuyen,taixe,soxe,doanhthu,noiden,songaydiduoc);
                            quanLy.add(ngoaithanh);
                            System.out.println(ngoaithanh.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.print("nhập mã số chuyến xe cần xóa :");
                    String masochuyen = scanner.nextLine();
                    System.out.println(quanLy.delete(masochuyen)? "Success" : "Fail");
                }
                break;
                case "3":{
                    System.out.println("nhập mã số chuyến xe cần tìm kiếm :");
                    String masochuyen = scanner.nextLine();
                    quanLy.search(masochuyen).forEach(chuyenXe ->{System.out.println(chuyenXe.toString());
                    });
                    break;
                }
                case "4":{
                    quanLy.show();
                    break;
                }
                case "5":{
                    System.out.println("nhập mã số chuyến :");
                    String masochuyen = scanner.nextLine();
                    System.out.println("doanh thu :" + quanLy.calculator(masochuyen));
                    break;
                }
                case "6":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
