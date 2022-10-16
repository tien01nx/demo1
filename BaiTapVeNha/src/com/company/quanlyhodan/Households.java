package com.company.quanlyhodan;

public class Households extends Person{
   private int soNguoi;
   private int soNha;

   public Households() {
   }

   public Households(String name, String birthday, String job, int soNguoi, int soNha) {
      super(name, birthday, job);
      this.soNguoi = soNguoi;
      this.soNha = soNha;
   }

   @Override
   public String toString() {
      return "Households{"+ super.toString()+
              "soNguoi=" + soNguoi +
              ", soNha=" + soNha +
              '}' +"\n";
   }

   public int getSoNguoi() {
      return soNguoi;
   }

   public void setSoNguoi(int soNguoi) {
      this.soNguoi = soNguoi;
   }

   public int getSoNha() {
      return soNha;
   }

   public void setSoNha(int soNha) {
      this.soNha = soNha;
   }
}
