package com.company.quanlyhodan;

public class Person {
    private  String name,birthday,job;

    public Person() {
    }

    public Person(String name, String birthday, String job) {
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", job='" + job + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
