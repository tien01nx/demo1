package com.company.quanlythuvien;

public class SchoolBook extends Library {
    private int soTrang;
    private int tinhTrang;
    private int soLuongMuon;

    public SchoolBook() {

    }

    public SchoolBook(String maSach, String tenSach, String nhaXB, int namXB, int soLuong, int soTrang, int tinhTrang, int soLuongMuon) {
        super(maSach, tenSach, nhaXB, namXB, soLuong);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
    }

    public void getinfo(){
        super.getinfo();
        System.out.println("So trang: ");
        soTrang = sc.nextInt();
        System.out.println("Tinh trang: ");
        tinhTrang = sc.nextInt();
        System.out.println("So luong muon: ");
        soLuongMuon = sc.nextInt();
    }
    public  void show(){
        super.show();
        System.out.println("So trang: "+soTrang);
        System.out.println("Tinh trang: "+tinhTrang);
        System.out.println("So luong muon: "+soLuongMuon);
    }


}


