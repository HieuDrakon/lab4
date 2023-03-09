package lab4_lt;

import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
public class hoaqua {
    private int gia;
    private String nguongoc;
    private int soluong;
    private int ngaynhap;
    Scanner scanner = new Scanner(System.in);
    public hoaqua(){
        super();
    }
     public hoaqua(int gia, String nguongoc,int soluong, int ngaynhap){
        this.gia=gia;
        this.nguongoc=nguongoc;
        this.soluong=soluong;
        this.ngaynhap=ngaynhap;
    }
     public float getGia() {
        return gia;
    }
     public float setGia(int gia) {
        this.gia=gia;
        return 0;
    }
     public String getNguongoc() {
        return nguongoc;
    }
     public char setNguongoc(String nguongoc) {
        this.nguongoc=nguongoc;
        return 0;
    }
     public int getSoluong() {
        return soluong;
    }
     public int setsoluong(int soluong) {
        this.soluong=soluong;
        return 0;
    }
     public int getNgaynhap() {
        return ngaynhap;
    }
     public int setNgaynhap(int ngaynhap) {
        this.ngaynhap=ngaynhap;
        return 0;
    }
     public String toString() {
        return "giá " + this.gia + "nguồn gốc " + this.nguongoc+"số lượng"+this.soluong+"ngaynhap"+this.ngaynhap ;
                }
}

