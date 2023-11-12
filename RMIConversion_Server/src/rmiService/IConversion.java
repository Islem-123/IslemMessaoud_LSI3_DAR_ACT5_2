package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

//L'interface IConversion étend l'interface Remote
//indiquant qu'elle sera utilisée pour des appels distants,notamment dans le cadre de RMI.
public interface IConversion extends Remote {

 // La méthode convertirMontant prend un montant en paramètre et retourne un montant converti.
 // Elle déclare lancer une RemoteException, une exception générale liée aux opérations RMI.
 public double convertirMontant(double mt) throws RemoteException;
}
