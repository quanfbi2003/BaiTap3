/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Server;

import controller.DAO.DbUtils;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author dream
 */
public class ServerServices extends UnicastRemoteObject implements IRMIServerServices {

    private List<HangSanXuat> listHangSanXuat;
    private List<XeMay> listXeMay;

    public ServerServices() throws RemoteException {
        listHangSanXuat = new ArrayList<>();
        listXeMay = new ArrayList<>();
        DbUtils.readFileXM(listXeMay);
        DbUtils.readFileHSX(listHangSanXuat);
    }

    @Override
    public boolean addHSX(HangSanXuat hangSanXuat) throws RemoteException {
        listHangSanXuat.add(hangSanXuat);
        DbUtils.writeFileHSX(listHangSanXuat);
        return true;
    }

    @Override
    public boolean editHSX(HangSanXuat hangSanXuat) throws RemoteException {
        for (int i = 0; i < listHangSanXuat.size(); i++) {
            if (listHangSanXuat.get(i).getMa().equalsIgnoreCase(hangSanXuat.getMa())) {
                listHangSanXuat.set(i, hangSanXuat);
                DbUtils.writeFileHSX(listHangSanXuat);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteHSX(HangSanXuat hangSanXuat) throws RemoteException {
        for (int i = 0; i < listHangSanXuat.size(); i++) {
            if (listHangSanXuat.get(i).getMa().equalsIgnoreCase(hangSanXuat.getMa())) {
                listHangSanXuat.remove(i);
                DbUtils.writeFileHSX(listHangSanXuat);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addXM(XeMay xeMay) throws RemoteException {
        listXeMay.add(xeMay);
        DbUtils.writeFileXM(listXeMay);
        return true;
    }

    @Override
    public boolean editXM(XeMay xeMay) throws RemoteException {
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getMa().equalsIgnoreCase(xeMay.getMa())) {
                listXeMay.set(i, xeMay);
                DbUtils.writeFileXM(listXeMay);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteXM(XeMay xeMay) throws RemoteException {
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getMa().equalsIgnoreCase(xeMay.getMa())) {
                listXeMay.remove(i);
                DbUtils.writeFileXM(listXeMay);
                return true;
            }
        }
        return false;
    }

    @Override
    public HangSanXuat getHSX(String maHSX) throws RemoteException {
        for (int i = 0; i < listHangSanXuat.size(); i++) {
            if (listHangSanXuat.get(i).getMa().equalsIgnoreCase(maHSX)) {
                return listHangSanXuat.get(i);
            }
        }
        return null;
    }

    @Override
    public List<XeMay> searchByHSX(String maHSX) throws RemoteException {
        List<XeMay> listXeMays = new ArrayList<>();
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getHangSanXuat().getMa().equalsIgnoreCase(maHSX)) {
                listXeMays.add(listXeMay.get(i));
            }
        }
        return listXeMays;
    }

    @Override
    public List<XeMay> searchByHang(String hang) throws RemoteException {
        List<XeMay> listXeMays = new ArrayList<>();
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getHang().equalsIgnoreCase(hang)) {
                listXeMays.add(listXeMay.get(i));
            }
        }
        return listXeMays;
    }

    @Override
    public List<XeMay> searchByGia(double gia) throws RemoteException {
        List<XeMay> listXeMays = new ArrayList<>();
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getGia() == gia) {
                listXeMays.add(listXeMay.get(i));
            }
        }
        return listXeMays;
    }

    @Override
    public List<XeMay> searchByDanhGia(int danhGia) throws RemoteException {
        List<XeMay> listXeMays = new ArrayList<>();
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getDanhGia() == danhGia) {
                listXeMays.add(listXeMay.get(i));
            }
        }
        return listXeMays;
    }

    @Override
    public List<HangSanXuat> getAllHSX() throws RemoteException {
        return listHangSanXuat;
    }

    @Override
    public List<XeMay> searchByMultiCondition(String maHSX, double gia, String hang) throws RemoteException {
        List<XeMay> listXeMays = new ArrayList<>();
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getHangSanXuat().getMa().equalsIgnoreCase(maHSX) 
                    && listXeMay.get(i).getGia() < gia
                    && listXeMay.get(i).getHang().equalsIgnoreCase(hang)) {
                listXeMays.add(listXeMay.get(i));
            }
        }
        return listXeMays;
    }
}
