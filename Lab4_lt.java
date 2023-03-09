package lab4_lt;

import java.util.ArrayList;
import java.util.Scanner;
public class Lab4_lt {
    private static void nhap(){
        ArrayList<tao> arrtao = new ArrayList<>();
        ArrayList<cam> arrcam = new ArrayList<>();
        int gia,soluong;
        String ngaynhap; 
        String nguongoc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá: ");
        gia = scanner.nextInt();
        System.out.print("Nhập nguồn gốc: ");
        nguongoc = scanner.nextLine();
        System.out.print("Nhập ngày nhập: ");
        ngaynhap = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        soluong = scanner.nextInt();
    }    
private static void xuat() {
        ArrayList<tao> arrtao = new ArrayList<>();
        ArrayList<cam> arrcam = new ArrayList<>();
        System.out.println("-----Thông tin tao-----");
        for (int i = 0; i < arrtao.size(); i++) {
            System.out.println(arrtao.get(i).toString());
        }
         
        System.out.println("-----Thông tin cam-----");
        for (int i = 0; i < arrcam.size(); i++) {
            System.out.println(arrcam.get(i).toString());
        }
    }   

    public static void main(String[] args) {
        nhap();
        xuat();
    }
    
}
