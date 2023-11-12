package rmiServer;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmiService.ConversionImpl;
public class ConversionServer {
    // Méthode principale qui sera exécutée lors du lancement du serveur RMI.
    public static void main(String[] args) {
        try {
            // Création et démarrage du registre RMI sur le port 1099.
            LocateRegistry.createRegistry(1099);

            // Création d'une instance de l'implémentation du service de conversion.
            ConversionImpl conversionService = new ConversionImpl();

            // Affichage de la représentation textuelle de l'objet distant (ConversionImpl).
            System.out.println(conversionService.toString());

            // Liaison de l'objet distant avec l'URL rmi://localhost:1099/objetDistant.
            // L'objet distant est accessible à travers cet URL.
            Naming.rebind("rmi://localhost:1099/objetDistant", conversionService);

            // Affichage d'un message indiquant que le serveur est prêt à recevoir des appels distants.
            System.out.println("Serveur RMI prêt à recevoir des appels distants sur rmi://localhost:1099/objetDistant.");
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}






























/*package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

//tw bch nbaath lil annuaire //fiha execution , baathen objet b rebind 
public class ConversionServer {

	public static void main(String[] args) {
//ihel annuaire w baad yaaml publication de l'objet distint (3ibara chthel annuaire locateregistry w fi wstha methode registre)
		try {*//*
			LocateRegistry.createRegistry(1099);
			//skeleton (OD = objet distant)
			ConversionImpl  OD = new ConversionImpl();
			System.out.println(OD.toString());
			//publicationde la ref de l'objet distant dans l'annuaire 
			Naming.rebind("rmi://localhost:1099/objetDistant", OD);//objetdistant reference , localhost:1099 hiya adresse ip, rmi hiya standard
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/

//}
