/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Server;

import java.rmi.*;
import java.util.List;
import model.*;
/**
 *
 * @author dream
 */
public interface IRMIServerServices extends Remote{
    public boolean addHSX(HangSanXuat hangSanXuat) throws RemoteException;
    public boolean editHSX(HangSanXuat hangSanXuat) throws RemoteException;
    public boolean deleteHSX(HangSanXuat hangSanXuat) throws RemoteException;
    
    public HangSanXuat getHSX(String maHSX) throws RemoteException;
    public List<HangSanXuat> getAllHSX() throws RemoteException;
    public List<XeMay> searchByHSX(String maHSX) throws RemoteException;
    public List<XeMay> searchByHang(String hang) throws RemoteException;
    public List<XeMay> searchByGia(double gia) throws RemoteException;
    public List<XeMay> searchByDanhGia(int danhGia) throws RemoteException;
    public List<XeMay> searchByMultiCondition(String maHSX, double gia, String hang) throws RemoteException;
    
    public boolean addXM(XeMay xeMay) throws RemoteException;
    public boolean editXM(XeMay xeMay) throws RemoteException;
    public boolean deleteXM(XeMay xeMay) throws RemoteException;
}
