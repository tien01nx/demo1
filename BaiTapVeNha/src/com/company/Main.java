package com.company;
import com.company.dahinh.ChuNhat;
import com.company.dahinh.Vuong;
import com.company.diem.SinhVienBiz;
import com.company.diem.SinhVienIT;
import com.company.quanlyhodan.ListHouseholds;
import com.company.quanlynhanvien.DanhSachEmpoyee;
import com.company.quanlynhanvien.Employee;
import com.company.quanlysach.Book;
import com.company.quanlysanpham.ListProduct;

import java.util.*;

public class Main {

//    private static Object Teacher;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here

        ListHouseholds households = new ListHouseholds();
        households.create();
        households.show();

    }
}

//        ChuNhat cn = new ChuNhat(5,8);
//        Vuong v = new Vuong(5,5);
//        SinhVienBiz sv1 = new SinhVienBiz("hihi","con ga",5,8);
//        SinhVienIT sv2 = new SinhVienIT("hihi2","conga2",10,9,8);
//        sv1.xuat();
//        sv1.getHocLuc();
//
//        System.out.println("___________");
//        sv2.xuat();
//        sv2.getHocLuc();
//
//    }
//}
//        ListProduct product = new ListProduct();
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        do {
//
//            System.out.println("\n-----------------Menu-----------------");
//            System.out.println("1. hien danh sach san pham ");
//            System.out.println("2. tim san pham theo ten  ");
//            System.out.println("3. tim san pham theo id");
//            System.out.println("4. tim san pham co so luong <5 ");
//            System.out.println("5. tim san pham theo muc gia ");
//            System.out.println("6. ket thuc");
//            n = sc.nextInt();
//            switch (n) {
//                case 1 -> {
//                    product.create();
//                    product.show();
//
//                }
//
//                case 2 -> product.searchName();
//                case 3 -> product.searchId();
//                case 4 -> product.searchAmount();
//                case 5 -> {
//                   product.searchPrice();
//                }
//                case 6 -> {
//                    System.exit(0);
//                }
//
//
//                default -> System.out.println("ban nhap sai vui long chon lai");
//            }
//        } while (n != 0);
//
//    }
//}


















//        DanhSachEmpoyee e = new DanhSachEmpoyee();
//
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        do {
//
//            System.out.println("\n-----------------Menu-----------------");
//            System.out.println("1. tim nhan vien theo id chinh xac ");
//            System.out.println("2. tim nhan vien theo ten  ");
//            System.out.println("3. dem so nhan vien nam, nu");
//            System.out.println("4. liet ke nhan vien tren 30 tuoi ");
//            System.out.println("5. nhap tu ban phim thang xem nhan vien sinh nhat thang do ");
//            System.out.println("6. hien ra top 3 nguoi co muc luong cao nhat");
//            System.out.println("7. ket thuc");
//            n = sc.nextInt();
//            switch (n) {
//                case 1 -> {
//                    e.create();
//                    e.showAll();
//                }
//
//                case 2 -> e.searchId();
//                case 3 -> e.countGender();
//                case 4 -> e.listAge();
//                case 5 -> {
//                   e.searAge();
//                }
//                case 6 -> {
//                   e.showTop3();
//                }
//
//                case 7 -> System.exit(0);
//                default -> System.out.println("ban nhap sai vui long chon lai");
//            }
//        } while (n != 0);
//
//    }
//}

















//        int n;
//        do {
//
//            System.out.println("\n-----------------Menu-----------------");
//            System.out.println("1. hien danh sach sach ");
//            System.out.println("2. tim kiem sach theo ten ");
//            System.out.println("3. tim sach theo the loai");
//            System.out.println("4. liet ke sach xuat ban trong nam");
//            System.out.println("5. Sap xep theo so trang");
//            System.out.println("6. Sap xep theo nam xuat ban");
//            System.out.println("7. ket thuc");
//            n = sc.nextInt();
//            switch (n) {
//                case 1 -> {
//
//                    book.create();
//                    book.showInfo();
//                }
//
//                case 2 -> book.searchName();
//                case 3 -> book.searchCategory();
//                case 4 -> book.showYear();
//                case 5 ->{
//                    book.sortPageNumber();
//                    book.showInfo();
//                }
//                case 6 ->{
//                    book.sortYear();
//                    book.showInfo();
//                }
//
//                case 7 -> System.exit(0);
//                default -> System.out.println("ban nhap sai vui long chon lai");
//            }
//        } while (n != 0);
//    }
//}



//        DanhSachUser user = new DanhSachUser();
//        Scanner sc = new Scanner(System.in);
//        int n;
//        do {
//
//            System.out.println("\n-----------------Menu-----------------");
//            System.out.println("1. hien thong tin sinh vien, giao vien ");
//            System.out.println("2. tim kiem theo keyword ");
//            System.out.println("3. sap xep theo ten tang dan a-z");
//            System.out.println("4. sap xep tuoi giam dan");
//            System.out.println("5. ket thuc chuong trinh");
//            n = sc.nextInt();
//            switch (n) {
//                case 1 -> {
//
//                    user.creatList();
//                    user.show();
//                }
//
//                case 2 -> user.searchName();
//                case 3 -> {
//                    user.sortName();
//                    System.out.println("danh sach sau khi sap xep la:");
//                    user.show();
//                }
//                case 4 -> {
//                    user.sortage();
//                    System.out.println("danh sach sau khi sap xep la:");
//                    user.show();
//                }
//                case 5 -> System.exit(0);
//                default -> System.out.println("ban nhap sai vui long chon lai");
//            }
//        } while (n != 0);
//    }
//}


//

//        Film film = new Film();
//        Movie movie = new Movie();
//
//        DanhSachMovieAndSeries danhSachMovie = new DanhSachMovieAndSeries();
//        Series series = new Series();
//        Scanner sc = new Scanner(System.in);
//        JavaBuoi3 jv3 = new JavaBuoi3();
//        Student student = new Student();
//        int n;
//        do {
//
//            System.out.println("\n-----------------Menu-----------------");
////            System.out.println("1. Giải phương trình bậc nhất");
////            System.out.println("2. Giải phương trình bậc 2");
////            System.out.println("3. Tính tiền điện");
////            System.out.println("4. Kết thúc");
//            System.out.println("5. nhap danh sach movie");
//            System.out.println("6. hien danh sach movie");
//            System.out.println("7. hien danh sach series");
//            System.out.println("8. hien danh sach series");
//            System.out.println("9. Tim kiem theo tieu de Movie and Series");
//            System.out.println("Nhập lựa chọn: ");
//            n = sc.nextInt();
//            switch (n) {
////                case 1 -> jv3.giaiPTB1();
////                case 2 -> jv3.giaiPTB2();
////                case 3 -> jv3.tinhTienDien();
////                case 4 -> System.exit(0);
//                case 5 -> {
//                  danhSachMovie.getListMovie();
//                    break;
//                }
//                case 6 -> {
//                    danhSachMovie.showListMovie();
//                    break;
//                }
//                case 7 -> {
//
//                    danhSachMovie.getListSeries();
//                    break;
//                }
//                case 8 -> {
//
//                    danhSachMovie.showListSeries();
//                    break;
//                }
//
////                case 10 -> {
////                    System.out.println("Nhap tieu de can tim kiem: ");
//////                    sc.nextLine();
//////                    String tieude = sc.nextLine();
//////                    danhSachMovie.timKiemTD(tieude);
////                    danhSachMovie.xepHang();
////                    break;
////                }
////                case 11 -> {
////
////                  jv3.bt2Mang();
////                }
////                case 12 -> {
////
////                   student.show();
////                    break;
////                }
//                default -> System.out.println("Bạn chọn sai vui lòng chọn lại: ");
//            }
//
//
//        } while (n != 0);


