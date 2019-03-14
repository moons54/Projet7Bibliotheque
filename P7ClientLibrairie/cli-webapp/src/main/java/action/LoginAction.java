package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.biblio.p7.service.AuthentificationService;
import org.biblio.p7.service.AuthentificationService_Service;
import org.biblio.p7.service.Lecteur;
import org.biblio.p7.service.RecherchercoordonneeResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {



    AuthentificationService_Service authentificationService_service=new AuthentificationService_Service();
    AuthentificationService por=authentificationService_service.getAuthentificationServicePort();

    //param en Entrée
    String identifiant;
    String motDePasse;
    Integer idutilisateur;

    //param en Sortie
    private Map<String, Object> session;
    private List<Lecteur> lecteurs;
    private Lecteur lecteur;


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
        String vresult = ActionSupport.INPUT;

        //condition validant l'ajout de formulaire

        if (this.lecteur !=null) {

            if (this.lecteur.getIdentifiant()==null) {
              //  this.addFieldError(" topo.nom", "ne peut pas etre vide");
                System.out.println("attention ne peut pas etre vide");
            } else
            {

                System.out.println("bien present");
            }



            if (!this.hasErrors())
            {
                try
                {
                   // managerFactory.getUtilisateurManager().ajoututilisateur(this.utilisateur);
                  por.ajouterLecteur(this.lecteur);
                    vresult = ActionSupport.SUCCESS;
                    this.addActionMessage("bienvenue");
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
        if(idutilisateur==null){

            System.out.println("--------------------- rien ");
            //  this.addActionError(getText("error.topo.missing.id."));
        }else
            //  =managerFactory.getUtilisateurManager().getUtilisateur(idutilisateur);
        lecteur=por.rechercher(idutilisateur);

        {
            // this.addActionError("il n'y a pas de projet pour ce numéro "+idtopo );
            System.out.println("-------------------"+"pas d'id");

        }
        return (this.hasErrors())? ActionSupport.ERROR : ActionSupport.SUCCESS;

    };

}