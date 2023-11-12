
package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // Utilisation de Naming.lookup pour rechercher l'objet distant enregistré avec l'URL spécifiée.
            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/objetDistant");

            // Appels de la méthode convertirMontant sur l'objet distant avec des montants spécifiques.
            // Affichage des résultats.
            System.out.println("Montant converti (150.00) : " + stub.convertirMontant(150.00));
            System.out.println("Montant converti (100.00) : " + stub.convertirMontant(100.00));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
