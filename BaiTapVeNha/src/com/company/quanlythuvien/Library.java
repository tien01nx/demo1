package com.company.quanlythuvien;

import java.util.Scanner;

public class Library {
    private  String maSach;
    private  String tenSach;
    private String nhaXB;
    private  int namXB;
    private  int soLuong;
    Scanner sc = new Scanner(System.in);

    public Library() {
    }

    public Library(String maSach, String tenSach, String nhaXB, int namXB, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
        this.soLuong = soLuong;
    }

    public  void getinfo(){
        System.out.println("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nha xuat ban: ");
        nhaXB = sc.nextLine();
        System.out.println("Nam xuat ban: ");
        namXB = sc.nextInt();
        System.out.println("So luong");
        soLuong = sc.nextInt();
    }
    public  void show(){
        System.out.println("Ma sach: "+maSach);
        System.out.println("Ten sach: "+tenSach);
        System.out.println("Nha xuat ban: "+nhaXB);
        System.out.println("Nam xuat ban: "+namXB);
        System.out.println("So luong: "+soLuong);
    }

    @Override
    public String toString() {
        return "Library{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", nhaXB='" + nhaXB + '\'' +
                ", namXB=" + namXB +
                ", soLuong=" + soLuong +
                ", sc=" + sc +
                '}';
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
