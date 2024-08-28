/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kt1_Th1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChayChuongtrinh {

    public static void main(String[] args) {
        QuanLyCD quanLyCD = new QuanLyCD();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("1. Xuat danh sach CD");
            System.out.println("2. Xuat CD phat hanh truoc nam 2020");
            System.out.println("3. Tim CD co ten chua chu 'tinh'");
            System.out.println("4. Sap xep CD theo gia giam dan");
            System.out.println("5. Xoa CD theo ma so");
            System.out.println("6. Sua gia ban CD theo ma so");
            System.out.println("7. Tinh tong tri gia cac CD");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();  

            switch (luaChon) {
                case 1:
                    quanLyCD.xuatDanhSachCD();
                    break;
                case 2:
                    quanLyCD.cdTruocNam2020();
                    break;
                case 3:
                    quanLyCD.cdTenChuaTinh();
                    break;
                case 4:
                    quanLyCD.sapXepTheoGia();
                    quanLyCD.xuatDanhSachCD(); 
                    break;
                case 5:
                    System.out.print("Nhap ma so CD can xoa: ");
                    String maSoXoa = scanner.nextLine();
                    if (quanLyCD.xoaCD(maSoXoa)) {
                        System.out.println("Xoa CD thanh cong.");
                    } else {
                        System.out.println("Khong tim thay CD voi ma so " + maSoXoa);
                    }
                    break;
                case 6:
                    System.out.print("Nhap ma so CD can sua gia: ");
                    String maSoSua = scanner.nextLine();
                    System.out.print("Nhap gia ban moi: ");
                    double giaMoi = scanner.nextDouble();
                    if (quanLyCD.suaGiaCD(maSoSua, giaMoi)) {
                        System.out.println("Sua gia CD thanh cong.");
                    } else {
                        System.out.println("Khong tim thay CD voi ma so " + maSoSua);
                    }
                    break;
                case 7:
                    System.out.println("Tong tri gia cac CD: " + quanLyCD.tinhTongTriGia());
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
            System.out.println();
        } while (luaChon != 0);

        scanner.close();
    }
    
}
