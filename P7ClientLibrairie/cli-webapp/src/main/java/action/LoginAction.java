package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.biblio.p7.service.*;
import org.biblio.p7.service.AuthentificationService;
import org.biblio.p7.service.AuthentificationService_Service;
import org.biblio.p7.service.Coordonnees;
import org.biblio.p7.service.Lecteur;
import org.biblio.p7.service.RecherchercoordonneeResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {



    AuthentificationService_Service authentificationService_service=new AuthentificationService_Service();
    AuthentificationService por=authentificationService_service.getAuthentificationServicePort();

    //param en Entrée
    Integer iD;
    String identifiant;
    String motDePasse;
    String motDePasse2;
    Integer idutilisateur;
    String nom;
    String prenom;
    XMLGregorianCalendar dateInscription;
    XMLGregorianCalendar dateNaissance;
    String num_Cni;
    String rue;
    String CodePostale;
    String Ville;
    String Telephone;
    String email;

    String dtp;

    //param en Sortie
    private Map<String, Object> session;
    private List<Lecteur> lecteurs;
    private Lecteur lecteur;
    private Coordonnees coordonnees;


    //GETTER AND SETTER

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }



    public List<Lecteur> getLecteurs() {
        return lecteurs;
    }

    public void setLecteurs(List<Lecteur> lecteurs) {
        this.lecteurs = lecteurs;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
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

    public XMLGregorianCalendar getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(XMLGregorianCalendar dateInscription) {
        this.dateInscription = dateInscription;
    }

    public XMLGregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(XMLGregorianCalendar dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public String getNum_Cni() {
        return num_Cni;
    }

    public void setNum_Cni(String num_Cni) {
        this.num_Cni = num_Cni;
    }

    public String getMotDePasse2() {
        return motDePasse2;
    }

    public void setMotDePasse2(String motDePasse2) {
        this.motDePasse2 = motDePasse2;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostale() {
        return CodePostale;
    }

    public void setCodePostale(String codePostale) {
        CodePostale = codePostale;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtp() {
        return dtp;
    }

    public void setDtp(String dtp) {
        this.dtp = dtp;
    }

    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(Coordonnees coordonnees) {
        this.coordonnees = coordonnees;
    }
//METHODE


    //Authentification de l'utilisateur
    public String doLogin() {
        System.out.println("dans la methode ");
        String vresult = ActionSupport.INPUT;
        // TODO regler la methode car on rentre avec une valeur vide voir peut etre db condition

        if (!StringUtils.isAllEmpty(identifiant, motDePasse)) {

            System.out.println("je suis dans la condition " + identifiant + "et le mot de passe " + motDePasse);

            try {



                System.out.println();
                System.out.println("voir l'encodage--------------------------------------------------------------------- "+motDePasse.toString());

                lecteur = por.controlerLecteur(identifiant, motDePasse);

                if (lecteur != null) {

                    System.out.println("---------------------------"+"identifié comme "+ identifiant.toString());
                    this.session.put("user", lecteur);

                    return vresult;
                }

            }
            catch(Exception e){
                this.addActionError("mt de pass invalide");
            }
//            System.out.println("----le lecteur---"+lecteur+"---------------------val de lecteur"+lecteur.getIdentifiant()+ "----------"+lecteur.getMotDePasse());
            //   this.session.put("user",lecteur);
            vresult=ActionSupport.SUCCESS;

        }
        return vresult;
    }

    //METHODE AFFICHANT LA LISTE DES UTILISATEURS
    public String doList() {

        lecteurs = por.rechercherlesLecteurs();

        return ActionSupport.SUCCESS;
    }

    public String doLogout(){
        System.out.println("on supprime l'utilisateur courznt");
        this.session.remove("user");
        return ActionSupport.SUCCESS;
    }


    //METHODE CREANT UN NOUVEL UTILISATEUR

    public String doCreate(){
        Lecteur lecteur=new Lecteur();
        String vresult = ActionSupport.INPUT;

        //condition validant l'ajout de formulaire

        if (this.identifiant !=null) {

            if (this.motDePasse == null||this.motDePasse.hashCode()!=this.motDePasse2.hashCode()) {
                this.addActionError("erreur");
                System.out.println("saisie mot de passe invalide "+motDePasse.hashCode() + "    "+motDePasse2.hashCode());
            } else
            {

                System.out.println("ok");
            }



            if (!this.hasErrors())
            {
                try
                {

                    lecteur.setIdentifiant(identifiant);
                    lecteur.setMotDePasse(motDePasse);
                    lecteur.setNom(nom);
                    lecteur.setPrenom(prenom);
                    lecteur.setDateDeNaissance(dateNaissance);
                    por.ajouterLecteur(lecteur);
                    vresult = ActionSupport.SUCCESS;
                    this.addActionMessage("premier etape pour   "+identifiant);
                } catch (Exception e)
                {

                    vresult = ActionSupport.ERROR;
                }

            }
        }

        return vresult;
    };


    //Methode pour le détail d'un utilisateur

    public String doDetail(){
        //gestion des erreurs si id du topo null
        if(nom==null){

            System.out.println("--------------------- rien ");
            //  this.addActionError(getText("error.topo.missing.id."));
        }else
            //  =managerFactory.getUtilisateurManager().getUtilisateur(idutilisateur);
            lecteur=por.rechercherparNom(nom);

        {
            // this.addActionError("il n'y a pas de projet pour ce numéro "+idtopo );
            System.out.println("-------------------"+"pas d'id");

        }
        return (this.hasErrors())? ActionSupport.ERROR : ActionSupport.SUCCESS;

    };


    public String dovalidate(){
        Coordonnees coordonnees=new Coordonnees();

        String vresult = ActionSupport.INPUT;

        //condition validant l'ajout de formulaire

        if (this.email!=null) {

            if (this.Telephone == null) {
                this.addActionError("erreur");
                } else
            {

                System.out.println("ok");
            }



            if (!this.hasErrors())
            {
                try
                {
                    coordonnees.setRue(rue);
                    coordonnees.setCodePostal(CodePostale);
                    coordonnees.setVille(Ville);
                    coordonnees.setEmail(email);
                    coordonnees.setRue(rue);
                    coordonnees.setLecteur(por.rechercher(idutilisateur));

                    por.ajouterCoordonnees(coordonnees);
                    vresult = ActionSupport.SUCCESS;
                    this.addActionMessage("Bienvenue  "+identifiant);
                } catch (Exception e)
                {

                    vresult = ActionSupport.ERROR;
                }

            }
        }

        return vresult;
    };

}