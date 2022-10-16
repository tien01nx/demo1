package com.company.quanlysach;

import com.company.quanlylophoc.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Book {
    //    mã sách, tên sách, tác giả, thể loại, nhà xuất bản, năm xuất bản, số trang
    Category category;
    String publishingCompany;
    private String id, name, author;
    private int year;
    private int page_number;
    ArrayList<Book> list = new ArrayList<>();
    public Book() {

    }

    public Book(String id, String name, String author, Category category, String publishingCompany, int year,int page_number) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.year = year;
        this.publishingCompany = publishingCompany;
        this.page_number = page_number;
    }

    //        truyen tham so vao list
    public void create() {
        list.add(new Book("1", "giai tich 1", "nguyen van a", Category.CHINHTRI, "dan tr", 2016,45));
        list.add(new Book("2", "toan ", "nguyen van b", Category.GIAOTRINH, "dan tr", 2017,345));
        list.add(new Book("3", "phan tich thiet ke", "nguyen van c", Category.KHOAHOC, "dan tr", 2005,213));
        list.add(new Book("4", "an ninh bao mat", "nguyen van d", Category.CHINHTRI, "dan tr", 2022,80));

    }
//    hien thong tin tung nguoi
    public void show() {
        System.out.println("\n-----------------------");
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("author: " + author);
        System.out.println("category: " + getCategory());
        System.out.println("publishingCompany: " + publishingCompany);
        System.out.println("year: " + year);
        System.out.println("page number: "+page_number);
    }

    //    hien danh sach sach
    public void showInfo() {
        for (Book b : list)
            b.show();

    }

    //    tim sach theo name
    public void searchName() {

        Scanner sc = new Scanner(System.in);
        int dem = 0;
        System.out.println("ten sach can tim kiem: \n");
        String name = sc.nextLine();
        for (Book b : list) {
            if (b.getName().contains(name)) {
                b.show();
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("sach tim kiem khong co");

    }

    //    tim kiem theo loai sach
    public void searchCategory() {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        System.out.println("nhap the loai sach can tim kiem 1: chinh tri 2: khoc hoc 3: giao trinh \n");
        int n = sc.nextInt();
        String name;
        if (n == 1)
            name = "CHINHTRI";
        else if (n == 2)
            name = "KHOAHOC";
        else name = "GIAOTRINH";

        for (Book b : list) {
            if (b.getCategory().toString().equals(name)) {
                b.show();
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("the loai tim kiem khong co");
    }

    //    Liệt kê các sách xuất bản trong năm nay
    public void showYear() {
        System.out.println("\ndanh sach sach xuat ban trong nam nay");
        int dem = 0;
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        for (Book b : list) {
            if (b.getYear() == year) {
                b.show();
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("khong co sach xuat ban trong nam nay");

    }

    // sap xep theo so trang
    public void sortPageNumber(){
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPage_number() > o2.getPage_number()) {
                    return 1;
                } else {
                    if (o1.getPage_number() == o2.getPage_number()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

    public void hoanDoi(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    // sap xep theo so trang tang dan
    public void sortYear(){

        for(int i =0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).getYear() >list.get(j).getYear())
                    hoanDoi(list.get(i).getYear(),list.get(j).getYear());
            }
        }
//        Collections.sort(list, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                if (o1.getYear() > o2.getYear()) {
//                    return 1;
//                } else {
//                    if (o1.getYear() == o2.getYear()) {
//                        return 0;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        });

    }


    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
