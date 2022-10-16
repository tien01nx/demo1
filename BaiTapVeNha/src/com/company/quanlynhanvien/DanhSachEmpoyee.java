package com.company.quanlynhanvien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachEmpoyee {
    ArrayList<Employee> list = new ArrayList<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String strDate = "20-08-2018";
    String strDate2 = "20-08-2002";
    String strDate3 = "20-08-2013";
    String strDate4 = "20-08-2017";
    String strDate5 = "10-08-1976";
    //    In ra top 3 người có lương tháng cao nhất
//
    ArrayList<Employee> listTop3 = new ArrayList<>();

    public void create() {
        list.add(new Employee("NV01", "nguyen van a", LocalDate.parse(strDate, dtf), Gender.NAM, 700000));
        list.add(new Employee("NV02", "nguyen van b", LocalDate.parse(strDate2, dtf), Gender.NU, 560000));
        list.add(new Employee("NV03", "nguyen van c", LocalDate.parse(strDate3, dtf), Gender.NAM, 300000));
        list.add(new Employee("NV04", "nguyen van d", LocalDate.parse(strDate4, dtf), Gender.NU, 500000));
        list.add(new Employee("NV05", "nguyen van e", LocalDate.parse(strDate5, dtf), Gender.NAM, 200000));

    }
//        tim kiem theo id tuyet doi tim chinh xac VD NV01

    public void showAll() {
        for (Employee e : list)
            System.out.println(e.toString());
    }

    public void searchId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id  can tim kiem: ");
        int dem = 0;
        String name = sc.nextLine();
        for (Employee e : list)
            if (e.getId() == name) {
                System.out.println(e.toString());
                dem++;
            }
        if (dem == 0) {
            System.out.println("Khong co trong danh sach");
        }

    }

    // tim kiem theo ten  ví dụ: Nguyễn Văn A -> nhập A hoặc Văn => đều tìm ra được)
    public void searchName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten  can tim kiem: ");
        int dem = 0;
        String name = sc.nextLine();
        for (Employee e : list)
            if (e.getName().contains(name)) {
                System.out.println(e.toString());
                dem++;
            }
        if (dem == 0) {
            System.out.println("Khong co trong danh sach");
        }
    }

    //Đếm số nhân viên nam, nữ
    public void countGender() {
        int a = 0, b = 0;
        for (Employee e : list) {
            if (e.getGender().toString().contains("NAM"))
                a++;
            else
                b++;
        }
        System.out.println("tong so nhan vien gioi tinh nam: " + a);
        System.out.println("tong so nhan vien gioi tinh nu: " + b);


    }

    //    Liệt kê các nhân viên trên 30 tuổi
    public void listAge() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int dem = 0;
        for (Employee e : list){
            if (year - e.getBirthday().getYear() > 30) {
                System.out.println(e.toString());
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("khong co nhan vien nao >30");

    }

    //    Nhập từ bàn phím tháng bất kỳ trong năm; kiểm tra xem trong tháng đó có những nhân viên nào có ngày sinh nhật
    public void searAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang de kiem tra trong thang co sinh nhat nhien vien: ");
        int month = sc.nextInt();
        int dem = 0;
        for (Employee e : list) {
            if (e.getBirthday().getMonthValue() == month) {
                System.out.println(e.toString());
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("khong co sinh nhat nhan vien nao");

    }

    public void showTop3() {
        // tao danh sach list moi khi tim max remo ko bi mat du lieu danh sach list cu
        listTop3.addAll(list);

//        int index =0;
//        for(int i=0;i<3;i++){
//            for(int j=0;j<list.size();j++){
//                if(list.get(index).getSalary()<list.get(j).getSalary())
//                    index =j;
//            }
//            System.out.println(list.get(index));
//            list.remove(index);
//        }

        for (int i = 0; i < 3; i++) {

            Employee employee = listTop3.get(0);
            for (Employee e : listTop3) {
                if (employee.getSalary() < e.getSalary())
                    employee = e;
            }
            System.out.println(employee);
            listTop3.remove(employee);

        }
    }
}
