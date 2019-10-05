/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;



import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Client Rmi
 * @author hkt
 */
public class ClientRMI {
    public RMIGraphService connectServer(){
        RMIGraphService rmi = null;
        try{
             //Connect to Server
             Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
             rmi= (RMIGraphService) reg.lookup("server");
             System.out.println("Connected to Server");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return rmi;
    }
}
