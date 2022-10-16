package com.company.javabuoi2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaBuoi2 {
    public void String_Convert_Date() {
        Scanner sc = new Scanner(System.in);
        String date;
        System.out.println("String sang LocalDatetime");
        System.out.println("Nhập theo định dạng yyyy-MM-dd HH:mm");
        date = sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, format);
        System.out.println("Sau khi chuyển dữ liệu: " + dateTime);

    }

    public void Getdatetime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Ngày hiện tại: " + localDateTime);
        System.out.println("Thời gian của 3 ngày sau: " + localDateTime.plusDays(3));
    }

    public void Count() {
        String name = "Hello every one";
        int dem = 0;

//        Ký tự e xuất hiện bao nhiêu lần và có index là bao nhiêu
        System.out.println("Các vị trí có ký tự e ");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                System.out.print(" " + (i + 1));
                dem++;
            }
        }
        System.out.println("\nKý tự e xuất hiện: " + dem);
    }

    public void Multiplication() {


        Scanner sc = new Scanner(System.in);
        int n = 0;
        String  name;
        do {
            System.out.println("Nhập số nguyên dương 0<n<9 ");
            n = Integer.parseInt(sc.nextLine());
            if(n==0){
                System.exit(0);
            }
            while (n < 0 || n > 9) {
                System.out.println("Moi ban nhap lai");
                n = sc.nextInt();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "x" + i + "= " + n * i);
            }
            System.out.println("Do you want to continues?(Y/N)");

            name =sc.nextLine();
            if(name.equalsIgnoreCase("N"))
                System.exit(0);
        }while (name.equalsIgnoreCase("Y"));

    }
}

