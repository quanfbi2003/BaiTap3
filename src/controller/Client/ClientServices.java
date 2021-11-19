package controller.Client;

import java.util.List;
import java.rmi.server.*;
import java.rmi.RemoteException;
import model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dream
 */
public class ClientServices extends UnicastRemoteObject {

    private static LookupServices lookupServices;

    public ClientServices() throws RemoteException {
        lookupServices = new LookupServices();
        if (lookupServices.connect()) {
            lookupServices.iRMIServices.addXM(new XeMay("ma", "ten", "Tay ga", 10, 5, new HangSanXuat("Nhat", "Nhat", "Nhat", "Nhat")));
            List<XeMay> listXeMay = lookupServices.iRMIServices.searchByHSX("Nhat");
            for (XeMay i: listXeMay) {
                System.out.println(i.getTen());
            }
        }

    }

}
