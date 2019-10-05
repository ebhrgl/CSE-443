/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
/**
 * Server rmi
 * @author Asus
 */
public class ServerRMI extends UnicastRemoteObject{
    
    public ServerRMI() throws RemoteException{
        super();
    }
 
    public static void main(String []args){
        try{
             Registry rmi = LocateRegistry.createRegistry(1099);
             //Create Graph object and rebind
             rmi.rebind("server", new BulutCizge());
             System.out.println("Server connected and ready.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
