package com.company.exten;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Person {
    private int id;
    private  String name;
    private String address;
    private int age;

    public Person() {
    }

    public Person(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public void getPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id: ");
        id = sc.nextInt();
        System.out.println("name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("address: ");
        address = sc.nextLine();
        System.out.println("age: ");
        age =sc.nextInt();
    }
    public void showPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id: "+id);

        System.out.println("name: "+name);

        System.out.println("address: "+address);

        System.out.println("age: "+age);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
