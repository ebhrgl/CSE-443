package RMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class BulutCizge extends UnicastRemoteObject implements RMIGraphService {
    private  String mst;
    public BulutCizge() throws RemoteException{

    }

    @Override
    public String minimumSpanning(BulutCizge graph) throws RemoteException
    {
        // starting time
        long startTime = System.currentTimeMillis();
        // start of function
        mst = "minimum spanning tree olusturuldu.";
        // end of function
        long endTime = System.currentTimeMillis();
        // ending time
        System.out.println((float)(endTime - startTime)/1000000);
        return mst;
}


    @Override
    public String Incidencematrix(BulutCizge graph) throws RemoteException {
        // starting time
        long startTime = System.currentTimeMillis();
        // start of function
        mst = "Incidence matrix olusturuldu.";
        // end of function
        long endTime = System.currentTimeMillis();
        // ending time
        System.out.println((float)(endTime - startTime)/1000000);
        return mst;
    }

}