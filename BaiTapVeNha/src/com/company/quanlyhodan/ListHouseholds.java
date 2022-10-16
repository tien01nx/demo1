package com.company.quanlyhodan;

import java.util.ArrayList;

public class ListHouseholds {
    ArrayList<Households> list = new ArrayList<>();

    public void create(){
        list.add(new Households("hihi","2020","cntt",3,5));
        list.add(new Households("hihi2","2012","cntt",3,6));
        list.add(new Households("hihi3","2019","cntt",3,8));
    }
    public void show(){

        System.out.println(list.toString());
    }
}
