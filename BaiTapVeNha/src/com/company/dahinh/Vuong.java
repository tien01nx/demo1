package com.company.dahinh;

import java.util.Scanner;

public class Vuong  extends ChuNhat{

    public Vuong(double rong, double dai) {
        super(rong, dai);
    }

    public Vuong() {
    }

    @Override
    public void xuat() {
        System.out.println("Dien tich hinh vuong: "+super.getDienTich());
        System.out.println("Chu vi hinh vuong: "+super.getChuVi());
    }


}
