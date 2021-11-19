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
public class HangSanXuat implements Serializable {
    private String ma, ten, nuoc, moTa;

    public HangSanXuat() {
    }

    public HangSanXuat(String ma, String ten, String nuoc, String moTa) {
        this.ma = ma;
        this.ten = ten;
        this.nuoc = nuoc;
        this.moTa = moTa;
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

    public String getNuoc() {
        return nuoc;
    }

    public void setNuoc(String nuoc) {
        this.nuoc = nuoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
