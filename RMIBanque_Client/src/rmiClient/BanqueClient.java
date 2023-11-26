package rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

import metier.Compte;
import rmiService.IBanque;

public class BanqueClient {
	public static void main(String[] args) {
	     try {
	            // Accès au registre RMI sur le même port utilisé par le serveur (1099 dans cet exemple)
	            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

	            // Récupération du service Banque en utilisant le nom associé lors de la liaison
	            IBanque banqueService = (IBanque) registry.lookup("BanqueService");
                Compte c1 =new Compte(25, 10.5, new Date());
                Compte c2 =new Compte(35, 11.5, new Date());
	            // Utilisation du service Banque
            
	            System.out.println("la création de compte : " + banqueService.creerCompte(c1));
	            System.out.println("le code de compte "+banqueService.getInfoCompte(25));

	        } 
	     catch (Exception e) {
	    	 e.printStackTrace();
	     }
	}

}
