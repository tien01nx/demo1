package com.company.exten;

import java.util.Scanner;

public class Employee  extends Person{
    private double experience;
    private  String placeWork;

    public Employee() {
    }

    public Employee(int id, String name, String address, int age, double experience, String placeWork) {
        super(id, name, address, age);
        this.experience = experience;
        this.placeWork = placeWork;
    }
    public  void getEmployee(){
        Scanner sc = new Scanner(System.in);
        super.getPerson();
        System.out.println("experience: ");
        experience = sc.nextDouble();
        System.out.println("placeWork: ");
        sc.nextLine();
        placeWork =sc.nextLine();
    }
    public  void showEmployee(){
        super.showPerson();
        System.out.println("experience: "+experience);
        System.out.println("placeWork: "+placeWork);
    }
}
