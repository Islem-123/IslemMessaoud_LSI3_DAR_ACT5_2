package metier;
import java.io.Serializable;
import java.util.Date;
//La classe Compte représente un compte bancaire avec un code, un solde et une date de création.
public class Compte implements Serializable{
    private static final long serialVersionUID = 1L; // Définir le même serialVersionUID

	    // Attributs privés de la classe Compte
	    private int code;
	    private double solde;
	    // Cette annotation indique que la variable dateCreation ne doit pas être incluse dans la sérialisation XML
	    private Date datecreation;
	    // Constructeur par défaut sans paramètres
	    public Compte() {}
	    // Constructeur avec paramètres pour initialiser les attributs lors de la création d'un objet Compte
	    public Compte(int code, double solde, Date datecreation) {
	        this.code = code;
	        this.solde = solde;
	        this.datecreation = datecreation; }
	    // Méthode getter pour obtenir le code du compte
	    public int getCode() {
	        return code;}
	    // Méthode setter pour définir le code du compte
	    public void setCode(int code) {
	        this.code = code;}
	    // Méthode getter pour obtenir le solde du compte
	    public double getSolde() {
	        return solde; }
	    // Méthode setter pour définir le solde du compte
	    public void setSolde(double solde) {
	        this.solde = solde; }
	    // Méthode getter pour obtenir la date de création du compte
	    public Date getDatecreation() {
	        return datecreation; }
	    // Méthode setter pour définir la date de création du compte
	    public void setDatecreat(Date datecreation) {
	        this.datecreation = datecreation; }
	    @Override
		public String toString() {
			return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + datecreation + "]";
		}}



