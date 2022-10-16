package com.company.diem;

public class SinhVienIT extends SinhVienTechMaster {
    private double java,html,css;


    @Override
    public double getDiem() {
        return (2*java +html+css)/4;
    }

    @Override
    public void getHocLuc() {
        super.getHocLuc();
    }

    @Override
    public void xuat() {
        super.xuat();
    }


    public SinhVienIT(String hoten, String cn, double java, double html, double css) {
        super(hoten, cn);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }
}
