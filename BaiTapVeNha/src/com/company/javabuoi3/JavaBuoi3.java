package com.company.javabuoi3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaBuoi3 {


    Scanner sc = new Scanner(System.in);

    // Giải phương trình bậc nhất
    // ax +b =0
    public void giaiPTB1() {
        System.out.println("Phương trình bậc nhất a*x + b =0");
        double a, b;
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        if (a == 0 && b == 0)
            System.out.println("Phương trình vô số nghiệm");
        else if (a == 0 && b != 0)
            System.out.println("Phương trình vô nghiệm");
        else
        System.out.println("Nghiệm của phương trình là: " + (-b / a));
    }

    // Giải phương trình bậc 2
    //    Phương trình bậc 2 có dạng: a*x^2 + b*x +c = 0
    public void giaiPTB2() {
        System.out.println("Phương trình bậc 2 có dạng ax^2 +bx +c =0");
        double a, b, c, detal = 0;

        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập c: ");
        c = sc.nextDouble();
        if (a != 0) {
            detal = b * b - 4 * a * c;

            if (detal > 0) {
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + (-b - Math.sqrt(detal)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm phân biệt: x2 = " + (-b + Math.sqrt(detal)) / (2*a));
            } else if (detal == 0)
                System.out.println("Phương trình có nghiệm duy nhất: x= " + -b / a);
            else

                System.out.println("Phương trình vô nghiệm");
        } else
            System.out.println("Phương trình bậc nhất có nghiệm x= " + -c / b);

    }

    //      Tính tiền điện
    public void tinhTienDien() {
        System.out.println("Nhập số điện đã sử dụng là:");
        double electricity, sum;
        electricity = sc.nextDouble();
        if (electricity >= 0 || electricity <= 50)
            System.out.println("Số tiền điện cần thanh toán là: " + electricity * 1.678);
        else if (electricity >= 51 && electricity <= 100)
            System.out.println("Số tiền điện cần thanh toán là: " + 50 * 1.678 + (electricity - 50) * 1.734);
        else if (electricity >= 101 && electricity <= 200)
            System.out.println("Số tiền điện cần thanh toán là: " + 50 * 1.678 + 50 * 1.734 + (electricity - 100) * 2.014);
        else if (electricity >= 201 && electricity <= 300)
            System.out.println("Số tiền điện cần thanh toán là: " + 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (electricity - 200) * 2.536);
    }

    // Nhập hãng oto in ra các hãng xe của loại đó
    public void car() {
        System.out.println("Nhập một hãng ô tô: ");

        String name = sc.nextLine();
        switch (name) {
            case "Honda":
                System.out.println("Honda City");
                System.out.println("Honda Jazz");
                System.out.println("Honda Civic");
                System.out.println("Honda Accord");
                break;
            case "BMW":
                System.out.println("BMW 320i");
                System.out.println("BMW X7");
                System.out.println("BMW 520i");
                break;
            case "Mercedes":
                System.out.println("S 450 Luxury");
                System.out.println("GLC 300 4MATIC");
                System.out.println("AMG GT 53 4MATIC+");
                System.out.println("G 63 AMG");
                break;
            default:
                System.out.println("Vui lòng nhập các hãng xe Honda, BMW, Mercedes ");
        }
    }


    //    Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
    public void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương n, tính tổng tất cả các số chẵn 0 -n ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0)
                sum = sum + i;
        System.out.println("Tổng tất cả các số chăn là: " + sum);
    }

    //máy tính cầm tay
    public void calculator() {

        String calculator;
        System.out.println("Nhập hai số a và b:");
        System.out.println("Nhập a: ");
        double a = Double.parseDouble(sc.nextLine());
        ;
        System.out.println("Nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Thực hiên phép tính + - = / * %");
        calculator = sc.nextLine();


        switch (calculator) {
            case "+":
                System.out.println(a + " + " + b + " = " + a + b);
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + "*" + b + " = " + a * b);
                break;
            case "/":
                System.out.println(a + "/" + b + " = " + a / b);
                break;
            case "%":
                System.out.println(a + "%" + b + " = " + a % b);
                break;

            default:
                System.out.println("hihih");
        }
    }

    // nhập tên tuổi địa chỉ sinh viên
    public void student() {
        String name, address;
        int age;
        String contin;

        do {
            System.out.println("Nhập tên sinh viên: ");
            name = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            address = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            age = Integer.parseInt(sc.nextLine());
            System.out.println("Bạn có muốn tiếp tục không ? Y/N");
            contin = sc.nextLine();
            if (contin.equalsIgnoreCase("N"))
                System.exit(0);
        } while (contin.equalsIgnoreCase("Y"));
    }


    // tính tổng 0- n và là số chẵn
    public void suma() {
        System.out.println("Nhap n: ");
        int n, sum = 0;
        n = sc.nextInt();
        System.out.println("Tinh tong 0-n do while");
        do {
            if (n % 2 == 0)
                sum = sum + n;
            n--;
        } while (n != 0);

        System.out.println("SUM " + sum);
//        System.out.println("Tinh tong 0-n  while");
//        while(n>0){
//            sum = sum+n;
//            n--;
//        }
//        System.out.println("SUM "+sum);
    }

    // nhập xuất mảng 1 chiều
    public void mang() {
        int size;
        System.out.println("Nhập độ dài của mảng: ");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mang sau nhap la: ");
        for (int i = 0; i < size; i++) {
            System.out.print(+ array[i] +"\t");
        }

    }

    // thay đổi giá trị  phần tử chẵn của mạng lên 1 đơn vị
    public void bt2Mang() {
        int size;
        System.out.println("Nhập độ dài của mảng: ");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println("\nThay đổi các phần tử là số chẵn trong mảng tăng lên 1 đơn vị");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0)
                array[i] = array[i] + 1;
            System.out.print(array[i] + " ");

        }
    }

    // tính tổng ma trận chia hết cho 3
    public void mang2Chieu() {
        double sum = 0, sumHet = 0;
        int m, n;  //số dòng, số cột
        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            m = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = sc.nextInt();
        } while (m < 1 || n < 1);

        int[][] array = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }


        System.out.println("Ma trận :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }


        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum = sum + array[i][j];
        System.out.println("Tổng ma trận vừa vào là: " + sum);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (array[i][j] % 3 == 0)
                    sumHet = sumHet + array[i][j];
        System.out.println("Tổng các giá trị chia hết cho 3 là: " + sumHet);

    }

    // TÍnh tổng 2 ma trận
    public void sumMatrix() {
        double sum = 0, sumHet = 0;
        int m, n, row, col;  //số dòng, số cột
        do {
            System.out.println("Nhập vào số dòng của ma trận A:");
            m = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận A:");
            n = sc.nextInt();
            System.out.println("Nhập vào số dòng của ma trận B:");
            row = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận B:");
            col = sc.nextInt();
            if (m != row && n != col)
                System.out.println("Không thể thực hiện 2 ma trận");
        } while (m < 1 || n < 1);

        int[][] a = new int[m][n];
        int[][] b = new int[row][col];
        int[][] c = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhập các phần tử cho ma trận B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];

        System.out.println("Tổng ma trận :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("\n");
        }


    }


}
