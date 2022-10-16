package com.company.opp;

import java.security.PrivateKey;
import java.util.Scanner;

public class Student {
        private  String id;
        private String ten;
        private double diemLyThuyet;
        private  double diemThucHanh;
        private String truong;
        Scanner sc = new Scanner(System.in);


    public void getinfo(){
                System.out.println("Nhap id: ");
                id = sc.nextLine();
                System.out.println("Nhap ten: ");
                ten = sc.nextLine();
                System.out.println("Diem ly thuyet: ");
                diemLyThuyet = sc.nextDouble();
                System.out.println("Diem thuc hanh: ");
                diemThucHanh  = sc.nextDouble();
                System.out.println("Truong: ");
                sc.nextLine();
                truong = sc.nextLine();
        }
        public double tinhDiemTB(double diemLyThuyet,double diemThucHanh){
                return  (diemLyThuyet+diemThucHanh/2);
        }
        public void show(){
                System.out.println("Id: "+id);
                System.out.println("Ten: "+ten);
                System.out.println("Diem ly thuyet: "+diemLyThuyet);
                System.out.println("Diem thuc hanh: "+diemThucHanh);
                System.out.println("Truong: "+ truong);
                System.out.println("Diem trung binh: "+tinhDiemTB(diemLyThuyet,diemThucHanh));
        }

}
