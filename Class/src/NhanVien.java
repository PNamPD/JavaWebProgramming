
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String DiaChi;
    private double tienLuong;
    private int gioLam;
    Scanner in= new Scanner(System.in);
    // moi 1 thuoc tinh se co 2 get set
    // goi ten trong lop
    // contructor khong co tham so
        public void NhanVien(){
            
        }
        
        public void inputInfo(){
        System.out.print("Nhap vao ten nguoi dung: ");
        this.Ten= in.nextLine();
        System.out.print("Tuoi vua nhap: ");
        this.Tuoi= Integer.parseInt(in.nextLine());
        System.out.print("Dia chi nguoi dung: ");
        this.DiaChi= in.nextLine();
        System.out.print("Tien luong: ");
        this.tienLuong= in.nextDouble();
        System.out.print("So gio lam: ");
        this.gioLam= in.nextInt();
    }
        // contructor co tham so
    public void setTen(String name){
        this.Ten=name;
    }
        // tra ve Ten
    public String getTen(){
        return Ten;
    }
    // goi lai Tuoi trong class
    public void setTuoi(int old){
        this.Tuoi=old;
    }
    // tra ve Tuoi
    public int getTuoi(){
        return Tuoi;
    }
    public void setDiaChi(String address){
        this.DiaChi = address;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public void setTienLuong(double money){
        this.tienLuong=money;
    }
    public double getTienLuong(){
        return tienLuong;
    }
    public void setGioLam(int timework){
        this.gioLam=timework;
    }
    public int getGioLam(){
        return gioLam;
    }
    // nhap ten nguoi dung
    

    public void printInfo(){
        System.out.println("Thong tin nguoi dung: 1.Ho va ten: "+this.Ten+" 2. Tuoi: "+this.Tuoi+" ");
        System.out.print(" 3- Dia chi: "+this.DiaChi+" 4- Gio Lam: "+this.gioLam+" 5- Tien Luong: "+this.tienLuong+" !");
    }
    public void tinhLuong(){
        double money;
        int time;
        time=this.gioLam;
        if(time>=200){
            money=this.tienLuong+(this.tienLuong*0.2);
        }
        else if(time>100 && time<200){
            money= this.tienLuong + (this.tienLuong*0.1);
        }
        else money= this.tienLuong;
        System.out.println("Tien luong va thuong cua "+this.Ten+" = "+money+"!");
    }
}