package com.company.exten;

import java.util.Scanner;

public class Product {
    private String id,name;
    private double price;
    Scanner sc = new Scanner(System.in);
    public  void getinfo(){
        System.out.println("id: ");
        id = sc.nextLine();
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("price: ");
        price = sc.nextDouble();
    }
    public  double thue(double thue){
       return  (price *0.1);
    }
    public void show(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("price: "+price);

    }
}
