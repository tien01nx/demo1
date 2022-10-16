package com.company.quanlylophoc;

import java.time.LocalDate;

public class Student  extends  User{
    private boolean isOnline;
    private  String background;


    public Student() {
    }

    public Student(String id, String name, String email, String phoneNumber, LocalDate birthday, int n, boolean isOnline, String background) {
        super(id, name, email, phoneNumber, birthday, n);
        this.isOnline = isOnline;
        this.background = background;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if(isOnline)
            System.out.println("truc tuyen");
        else{
            System.out.println("offline");
        }
        System.out.println("chuyen mon: " +background);
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() +
                "isOnline=" + isOnline +
                ", background='" + background + '\'' +
                '}';
    }
}
