/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ql_sinhvien;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
class Nguoi{
    private int maDinhDanh;
    private String gioiTinh;

    public Nguoi(int maDinhDanh, String gioiTinh) {
        this.maDinhDanh = maDinhDanh;
        this.gioiTinh = gioiTinh;
    }

    public Nguoi() {
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
    
    
    void inputNguoi(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap Ma Dinh Danh:");
        maDinhDanh = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap Gioi Tinh:");
        gioiTinh = sc.nextLine();
    }
    void outputNguoi(){
        System.out.println("Ma Dinh Danh:"+ maDinhDanh);
        System.out.println("Gioi Tinh:"+ gioiTinh);
    }
}

class SinhVien extends Nguoi{
    private String hoTen;
    private int namSinh;

    public SinhVien(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public SinhVien(int a, int b, int c, int d, int e, int f) {
    }
    
    void inputSV(){
        Scanner sc = new Scanner(System.in);

        inputNguoi();
        System.out.println("Nhap Ho Ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        namSinh = Integer.parseInt(sc.nextLine());
    }
    void outputSV(){
        outputNguoi();
        System.out.println("Ho Ten:"+ hoTen);
        System.out.println("Nam Sinh:"+ namSinh);
    }
}
public class QL_SinhVien {
    private int n ;
    SinhVien sv[];
    
    void inputQLSV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Sinh Vien:");
        n = Integer.parseInt(sc.nextLine());
        
        sv = new SinhVien[n];
        
        for(int i =0; i<n;i++){
            System.out.println("===Nhap SV Thu"+(i+1)+"======");
            sv[i] = new SinhVien();
            sv[i].inputSV();
        }
    }
    
    void outputQLSV(){
        for(int i =0; i< n; i++){
            System.out.println("======:Hien SV Thu "+(i+1)+":=====");
            sv[i].outputSV();
        }
    }
    
    void Search(){
        String temp;
        System.out.println("===========SEARCH============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gioi tinh can tim:");
        temp = sc.nextLine();
        
        for(int i =0; i< n; i++){
            if(temp.equals(sv[i].getGioiTinh())){
                System.out.println("===========LIST============");
                sv[i].outputSV();
            }
        }
    }
    public static void main(String[] args) {
        QL_SinhVien ql = new QL_SinhVien();
        ql.inputQLSV();
        ql.outputQLSV();
        ql.Search();
    }
}
