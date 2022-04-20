package DemoSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HastSet_RutThamTrungThuong {
        Set<String>rutTham=new HashSet<String>();

    public HastSet_RutThamTrungThuong() {
    }
    public boolean them(String giaTri){
        return this.rutTham.add(giaTri);
    }

    public void hienThi(){
        System.out.println(Arrays.toString(this.rutTham.toArray()));
    }
    public boolean xoaMotLaPhieu(String giaTri){
        return this.rutTham.remove(giaTri);
    }
    public String rutThamTrungThuong(){
        String ketQua="";
        Random rd=new Random();
        int viTri= rd.nextInt(this.rutTham.size());
         ketQua=(String) this.rutTham.toArray()[viTri];
         return ketQua;
    }
    public boolean kiemTra(String giaTri){
        return this.rutTham.contains(giaTri);
    }
    public void kiemTraSoLaTham(){
        System.out.println(  this.rutTham.size());
    }
    public void delete(){
        this.rutTham.clear();
    }
}
