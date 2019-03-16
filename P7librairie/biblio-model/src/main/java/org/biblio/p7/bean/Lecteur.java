package org.biblio.p7.bean;

import java.util.Date;


public class Lecteur {
    private int iD;
    private String identifiant;
    private String nom;
    private String prenom;
    private String motDePasse;
    private Date dateInscription;
    private Date dateDeNaissance;
    //private List<Coordonnees> coordonneesList;
//	public Emprunt unnamed_Emprunt_;
//	public ArrayList<Emprunt> emprunt = new ArrayList<Emprunt>();

//TODO VOIR SI INTERET DE PASSER LISTE DE COORDONNEES


    public Lecteur(int iD) {
        this.iD = iD;
    }

    public Lecteur() {
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }


    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

	/*public List<Coordonnees> getCoordonneesList() {
		return coordonneesList;
	}

	public void setCoordonneesList(List<Coordonnees> coordonneesList) {
		this.coordonneesList = coordonneesList;
	}
*/

    /**
     * public Coordonnees getCoordonnees() {
     * return coordonnees;
     * }
     * <p>
     * public void setCoordonnees(Coordonnees coordonnees) {
     * this.coordonnees = coordonnees;
     * }
     */

    @Override
    public String toString() {
        return "Lecteur{" +
                "iD=" + iD +
                ", identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", dateInscription=" + dateInscription +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }
}