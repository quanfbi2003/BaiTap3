/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Client;

import java.rmi.RemoteException;
/**
 *
 * @author dream
 */
public class StartClient {
    
    public StartClient() throws RemoteException {
        new ClientServices();
    }
    
    public static void main(String[] args) {
        new Thread(new Runnable() { 
            public void run() {
                try {
                    new StartClient();
                } catch (RemoteException ex) {
                }
            }
        }).start();
    }
}
