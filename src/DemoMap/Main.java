package DemoMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MapTuDien mapTest=new MapTuDien();
        Scanner scanner=new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("--------------------");
            System.out.println("MENU");
            System.out.println("1:  thêm từ điển");
            System.out.println("2:  hiển thị từ điển");
            System.out.println("3:  xoá từ điển");
            System.out.println("4:  tra từ điển");
            System.out.println("5 :  lấy số lượng từ điển");
            System.out.println("0: thoát khỏi menu");
            System.out.println("nhập menu");
            choice=scanner.nextInt();
            scanner.nextLine();
            if(choice==1){
//           thêm từ điển

                System.out.println("nhập từ khoá");
                String tuKhoa=scanner.nextLine();
                System.out.println("nhập ý nghĩa");
                String yNghia=scanner.nextLine();
                mapTest.add(tuKhoa,yNghia);
                mapTest.display();
            }
            if(choice==2){
//           hiển thị
                mapTest.display();
            }
            if (choice==3){
//          xoá từ điển

                System.out.println("nhập từ khoá");
                String tuKhoa=scanner.nextLine();
                mapTest.delete(tuKhoa);
            }
            if(choice==4){
//          tra từ điển
                System.out.println("nhập từ khoá");
                String tuKhoa=scanner.nextLine();
                System.out.println("ý nghĩ từ khoá là : "+  mapTest.traTu(tuKhoa));
            }
            if(choice==5){
//                lấy số lượng
                mapTest.laySoLuong();
            }

        }while (choice!=0);
    }
}
