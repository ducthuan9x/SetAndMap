package DemoSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HastSet_RutThamTrungThuong rutThamTrungThuong=new HastSet_RutThamTrungThuong();
        Scanner scanner=new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("--------------------");
            System.out.println("MENU");
            System.out.println("1:  thêm lá phiếu");
            System.out.println("2:  hiển thị lá thăm");
            System.out.println("3:  xoá 1 lá phiếu");
            System.out.println("4:  bốc thăm trúng thưởng");
            System.out.println("5:  kiểm tra lá phiếu có trong hòm thăm ko");
            System.out.println("6 :  kiểm tra số lượng lá thăm");
            System.out.println("7:  xoá tất cả lá phiếu");
            System.out.println("0: thoát khỏi menu");


            System.out.println("nhập menu");
            choice = scanner.nextInt();
            scanner.nextLine();

            if(choice==1){
//      thêm lá thăm
                System.out.println("nhập giá trị lá thăm");
                String giaTri=scanner.nextLine();
                System.out.println(rutThamTrungThuong.them(giaTri));
            }
            else if(choice==2){
//      hiển thị
                rutThamTrungThuong.hienThi();
            }
            else if(choice==3){
//      xoá 1 lá thăm
                System.out.println("nhập giá trị lá thăm");
                String giaTri=scanner.nextLine();
                rutThamTrungThuong.xoaMotLaPhieu(giaTri);
            }
            else if(choice==4){
//      boccs thăm trúng thưởng

                System.out.println( rutThamTrungThuong.rutThamTrungThuong());
            }
            else if(choice==5){
//      kiểm tra lá phiếu có bên trong ko
                System.out.println("nhập giá trị lá thăm");
                String giaTri=scanner.nextLine();

                System.out.println(  rutThamTrungThuong.kiemTra(giaTri));
            }
            else if(choice==6){
//      kiểm tra số lượng lá thăm
                rutThamTrungThuong.kiemTraSoLaTham();
            }
            else if(choice==7){
//      xoá tất cả
                rutThamTrungThuong.delete();
            }
        }while (choice!=0);
    }
}
