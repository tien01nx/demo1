package com.company.dahinh;

public class ChuNhat {
    private  double rong, dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public ChuNhat() {
    }

    public  double getChuVi(){
        return (dai+rong)*2;
    }
    public double getDienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Rong: "+rong);
        System.out.println("Dai: "+dai);
        System.out.println("chu vi: "+getChuVi() +"Dien tich: "+getDienTich());
    }


    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
}
