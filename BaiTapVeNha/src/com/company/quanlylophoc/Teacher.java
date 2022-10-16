package com.company.quanlylophoc;

import java.time.LocalDate;
import java.util.Scanner;

public class Teacher extends User {
    private  int yearOfExperiences;
    private String speciality;


    public Teacher() {
    }
    public Teacher(String id, String name, String email, String phoneNumber, LocalDate birthday, int n, int yearOfExperiences, String speciality) {
        super(id, name, email, phoneNumber, birthday, n);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("yearOfExperiences: "+yearOfExperiences);
        System.out.println("speciality: "+speciality);
    }

    public int getYearOfExperiences() {
        return yearOfExperiences;
    }

    public void setYearOfExperiences(int yearOfExperiences) {
        this.yearOfExperiences = yearOfExperiences;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "yearOfExperiences=" + yearOfExperiences +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
