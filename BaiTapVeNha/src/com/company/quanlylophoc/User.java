package com.company.quanlylophoc;

import java.time.LocalDate;

public class User {
    private  String id,name,email,phoneNumber;
    private LocalDate birthday;
    private Gender gender;
    protected int  n=0;
    public User() {
    }

    public User(String id, String name, String email, String phoneNumber, LocalDate birthday, int n) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.n = n;
    }

    public void printInfo(){
        Teacher teacher = new Teacher();
        System.out.println("--------------");
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("email: "+email);
        System.out.println("phone number: "+phoneNumber);
        System.out.println("localdate: "+birthday);
        if(n==1)
            System.out.println("gioi tinh: nam");
        else if(n==2)
            System.out.println("gioi tinh: nu");
        else
            System.out.println("chon sai gioi tinh");

    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", n=" + n +" ,";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


}
