package com.company.diem;
 abstract class SinhVienTechMaster {
    private String hoten,cn;
     public abstract double getDiem();

     public SinhVienTechMaster(String hoten, String cn) {
         this.hoten = hoten;
         this.cn = cn;
     }

     public  void getHocLuc(){
    if(getDiem()<5)
        System.out.println("Yeu");
    else if(getDiem()>=5 && getDiem()<6.5)
        System.out.println("Trung binh");
    else if(getDiem()>=6.5 && getDiem()<=7.5)
        System.out.println("Kha");
    else System.out.println("Gioi");


     }
     public void xuat(){
         System.out.println("ho ten: "+hoten);
         System.out.println("nganh: "+cn);

     }

     public String getHoten() {
         return hoten;
     }

     public void setHoten(String hoten) {
         this.hoten = hoten;
     }

     public String getCn() {
         return cn;
     }

     public void setCn(String cn) {
         this.cn = cn;
     }

 }
