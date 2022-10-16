package com.company.quanlysanpham;

import com.company.quanlynhanvien.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class ListProduct {
    ArrayList<Product> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void hoanDoi(double a, double b){
        double temp = a;
        a = b;
        b = temp;
    }
    public void create() {
        list.add(new Product("id01", "bim bim", "an khong ngon khong tinh tien", 2, 6000, "g"));
        list.add(new Product("id02", "nuoc ngot", "nuoc tang luc", 50, 10000, "ml"));
        list.add(new Product("id03", "thuoc ke", "dung de do do dai", 10, 3000, "g"));
        list.add(new Product("id04", "may tinh", "luot wev", 20, 1500000, "kg"));
        list.add(new Product("id05", "dien thoai", "nghe goi", 20, 1000000, "g"));
        list.add(new Product("id06", "chuot may tinh", "co day", 2, 60000, "g"));

    }

    public void show() {
        for (Product p : list)
            System.out.println(p.toString());
    }

    public void searchName() {
        System.out.println("Nhap ten san pham can tim kiem: ");
        String name = sc.nextLine();
        int dem = 0;
        for (Product p : list) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p.toString());
                dem++;
            }

        }
        if (dem == 0) {
            System.out.println("Khong co trong danh sach");
        }
    }

    public void searchId() {
        System.out.println("Nhap id san pham can tim kiem: ");
        String id = sc.nextLine();
        int dem = 0;

        for (Product p : list) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println(p.toString());
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("khong co id trong danh sach");
        } else {
            System.out.println("moi ban lua chon 1: xoa san pham 2. cap nhat so luong 3. ket thuc");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    list.removeIf(p -> p.getId().contains(id));
                    System.out.println("Xoa thanh cong");
                    System.out.println("danh sach sau khi cap nhat la");
                    show();
                }
                case 2 -> {
                    System.out.println("nhap so luong muon cap nhat: ");
                    double sl = sc.nextDouble();
                    for (Product p : list) {
                       if(p.getId().contains(id))
                           p.setPrice(sl);
                    }
                    System.out.println("danh sach sau khi cap nhat la");
                    show();
                }
                default -> System.out.println("ban chon sai vui long chon lai: ");
            }
        }

    }

    //4 - Tìm các sản phẩn có số lượng dưới 5
    public void searchAmount() {
        System.out.println("tim san pham co so luong duoi 5:");
        int dem = 0;
        for (Product p : list) {
            if (p.getAmount() < 5) {
                System.out.println(p.toString());
                dem++;
            }

        }
        if (dem == 0) {
            System.out.println("khong co san pham nao co so luong <5");
        }

    }

    public void searchPrice() {
        System.out.println("tim san pham theo muc gia 1. duoi 50.000 2. tu 50.000 den 100.000 3. 100.000 tro len ");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                for (Product p : list)
                    if (p.getPrice() < 50000)
                        System.out.println(p.toString());

            }
            case 2 -> {
                for (Product p : list)
                    if (p.getPrice() >= 50000 && p.getPrice() <= 100000)
                        System.out.println(p.toString());

            }
            case 3 -> {
                for (Product p : list)
                    if (p.getPrice() > 100000)
                        System.out.println(p.toString());
            }
            case 4 -> System.exit(0);
            default -> System.out.println("ban cho sai vui long chon lai");
        }
    }
}
