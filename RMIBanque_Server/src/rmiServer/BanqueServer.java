package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BanqueServer {

    public static void main(String[] args) {
        try {
            // Création du registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Création de l'implémentation du service Banque
            rmiService.IBanque banqueService = new rmiService.BanqueImpl();

            // Liaison du service avec le registre
            registry.rebind("BanqueService", banqueService);

            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur RMI : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
