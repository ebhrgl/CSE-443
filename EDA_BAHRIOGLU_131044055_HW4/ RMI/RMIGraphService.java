package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIGraphService extends Remote {
    public String minimumSpanning(BulutCizge graph) throws RemoteException;
    public String Incidencematrix(BulutCizge graph) throws RemoteException;
}