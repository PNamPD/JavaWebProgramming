/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_8;

/**
 *
 * @author ASUS
 */
// thuc thi
 class HinhBinhHanh extends daGiac{
    // o day
    // khai bao cac thuoc tinh
     protected int chieuCao;
     protected int canhDay;
     protected int canhBen;

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getCanhDay() {
        return canhDay;
    }

    public void setCanhDay(int canhDay) {
        this.canhDay = canhDay;
    }

    public int getCanhBen() {
        return canhBen;
    }

    public void setCanhBen(int canhBen) {
        this.canhBen = canhBen;
    }
     
    @Override
    public void tinhChiVi() {
        int chuVi;
        chuVi= (canhDay+canhBen)*2;
        System.out.println("Chu vi: "+chuVi);
    }
    @Override
    public void tinhDienTich(){
        float dienTich;
        dienTich= (chieuCao*canhDay)/2;
        System.out.println("Dien tich: "+dienTich);
    }
    
    
}
