package DemoMap;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTuDien {
    Map<String,String>duLieu =new TreeMap<String,String>();

    public MapTuDien() {}

    public String add(String tuKhoa , String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }
    public void display(){
        Set<String>tapHopTu=this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTu.toArray()));
    }
    public String delete(String tuKhoa){
        return this.duLieu.remove(tuKhoa);
    }
    public String traTu(String tuKhoa){
        String yNghia=this.duLieu.get(tuKhoa);
        return yNghia;
    }
    public int laySoLuong(){
        return this.duLieu.size();
    }
}
