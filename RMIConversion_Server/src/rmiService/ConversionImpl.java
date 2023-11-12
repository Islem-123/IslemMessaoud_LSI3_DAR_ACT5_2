package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// La classe ConversionImpl étend UnicastRemoteObject pour permettre son utilisation en tant qu'objet distant.
public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    // Le constructeur de la classe ConversionImpl. Il invoque le constructeur de la classe parente UnicastRemoteObject
    // et déclare lancer une RemoteException.
    public ConversionImpl() throws RemoteException {
        super();
    }

    // Implémentation de la méthode convertirMontant définie dans l'interface IConversion.
    // Cette méthode multiplie le montant passé en paramètre 
    @Override
    public double convertirMontant(double mt) {
        return mt * 3.3;
    }
}