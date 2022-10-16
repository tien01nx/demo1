package com.company.quanlylophoc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachUser {
    Scanner sc = new Scanner(System.in);
    ArrayList<Teacher> listTea = new ArrayList<>();
    ArrayList<Student> listStu = new ArrayList<>();

    ArrayList<User> list = new ArrayList<>();
    //        format dinh dang ngay thang nam
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String strDate= "20-08-2018";
    String strDate2= "20-08-2002";
    String strDate3= "20-08-2013";
    String strDate4= "20-08-2017";
// tao danh sach
    public void creatList(){
        listTea.add(new Teacher("1","nguyen manh hung","hung@gmail.com","0989876781", LocalDate.parse(strDate,dtf),1,2018,"my sql"));
        listTea.add(new Teacher("2","nguyen van dong","dong111@gmail.com","098985471",LocalDate.parse(strDate2,dtf),2,2012,"slq"));
        listStu.add(new Student("3","nguyen van tien","tien111@gmail.com","0989471181",LocalDate.parse(strDate3,dtf),2,true,"java core"));
        listStu.add(new Student("4","nguyen van manh","manh111@gmail.com","0989847781",LocalDate.parse(strDate4,dtf),1,false,"spring boot"));
        listStu.add(new Student("5","nguyen van linh","linh111@gmail.com","0984574781",LocalDate.parse(strDate,dtf),1,true,"css"));
        listStu.add(new Student("6","nguyen thi diu","diu111@gmail.com","0989854281",LocalDate.parse(strDate3,dtf),2,false,"html"));
        listStu.add(new Student("7","tran quynh trang","hung111@gmail.com","098154781",LocalDate.parse(strDate3,dtf),2,true,"javascript"));
        listStu.add(new Student("8","nguyen thi thu phuong","phuong111@gmail.com","0988954781",LocalDate.parse(strDate3,dtf),21,false,"mvc"));

        list.addAll(listStu);
        list.addAll(listTea);

    }
//    hien danh sach sinh vien giang vien
    public void show(){
        for(User user :list)
            user.printInfo();

    }
//    tim kiem theo keyword name email phone
    public void searchName(){
        String keyword  ="";
        System.out.println("nhap keyword  can tim kiem");
        keyword = sc.nextLine();
        int dem=0;
        for (User user : list) {
            if (user.getName().contains(keyword ) || user.getEmail().contains(keyword ) || user.getPhoneNumber().contains(keyword)) {
                    user.printInfo();
                dem++;

            }
        }
        if (dem == 0) {
            System.out.println("khong co trong he thong");
        }
    }
//    sap xep theo name a-z
    public void sortName(){
//        sap xep ten tang dan theo a-z
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (o1.getName().compareTo(o2.getName()));

            }
        });
    }
//    sap xep theo age tang dan
    public void sortAge(){
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getBirthday().getYear() > o2.getBirthday().getYear()) {
                    return 1;
                } else {
                    if (o1.getBirthday().getYear() == o2.getBirthday().getYear()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }



}
