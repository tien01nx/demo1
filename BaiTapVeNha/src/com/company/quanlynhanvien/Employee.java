package com.company.quanlynhanvien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
//    Khai báo class nhiên viên (Employee) gồm các thông tin :
//
//    id (String, bắt đầu là NV, ví dụ: NV01, NV02)
//    tên (String)
//    ngày sinh (LocalDate)
//    giới tính (Sử dụng enum)
//    lương tháng (double)
    private String  id,name;
    private LocalDate birthday;
    private Gender gender;
    private double salary;


    public Employee() {
    }

    public Employee(String id, String name, LocalDate birthday, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
