package com.company.diem;

public class SinhVienBiz extends SinhVienTechMaster{
    private  double marketting,sales;
    @Override
    public double getDiem() {
        return (2*marketting+sales)/3;
    }

    public SinhVienBiz(String hoten, String cn, double marketting, double sales) {
        super(hoten, cn);
        this.marketting = marketting;
        this.sales = sales;
    }

    public double getMarketting() {
        return marketting;
    }

    public void setMarketting(double marketting) {
        this.marketting = marketting;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
