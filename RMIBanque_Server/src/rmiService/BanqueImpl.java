package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Vector;

import metier.Compte;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {

    private Vector<Compte> comptes;
    private int nb; //nombre de comptes dans la banque
    public BanqueImpl() throws java.rmi.RemoteException {
    super();
    comptes=new Vector<Compte>();
    nb=0;
    }
    public String creerCompte(Compte c) throws RemoteException{
    Compte c1 =new Compte(c.getCode(),c.getSolde(),new Date());
    comptes.add(c);
    nb++;
    return c1.toString()+" est crée\n";
    }
    public String getInfoCompte(int code)throws java.rmi.RemoteException {
    	int i=0;
    	while(i<nb && comptes.get(i).getCode()!=code )
    	i++;
    	if(i<nb)
    	return comptes.get(i).toString();
    	else
    	return "Il n y a pas de compte avec le code saisie\n";
    	}
    public Vector<Compte> getComptes()throws RemoteException{
    	return comptes;
    	}
     
}
