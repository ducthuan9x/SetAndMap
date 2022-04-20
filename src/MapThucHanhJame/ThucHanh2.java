package MapThucHanhJame;

public class ThucHanh2 implements Comparable<ThucHanh2>{
    private String name,address;
    private int age;

    public ThucHanh2() {
    }

    public ThucHanh2(String name,  int age,String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ThucHanh2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(ThucHanh2 o) {
        return this.getName().compareTo(o.getName());
    }
}
