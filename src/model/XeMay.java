/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author dream
 */
public class XeMay implements Serializable {
    private String ma, ten, hang;
    private double gia;
    private int danhGia;
    private HangSanXuat hangSanXuat;

    public XeMay() {
    }

    public XeMay(String ma, String ten, String hang, double gia, int danhGia, HangSanXuat hangSanXuat) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.danhGia = danhGia;
        this.hangSanXuat = hangSanXuat;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(int danhGia) {
        this.danhGia = danhGia;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    
    
}
