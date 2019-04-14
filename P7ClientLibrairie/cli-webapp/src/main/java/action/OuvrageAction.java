package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.biblio.p7.service.*;

import java.util.List;

public class OuvrageAction extends ActionSupport {


    private final Logger LOGGER=(Logger) LogManager.getLogger(OuvrageAction.class);


    OuvrageService_Service ouvrageService_service=new OuvrageService_Service();
    OuvrageService por=ouvrageService_service.getOuvrageServicePort();

    //Parametre en Entrée
    Integer id;
    String intitule;
    String descrption;
    String photo;
    String numISBN;
    String referenceInterne;

    private Ouvrage ouvrage;
    private Genre genre;
    private Editeur editeur;
    private Auteur auteur;
    private List<Ouvrage> ouvrageList;
    private List<Exemplaire> exemplaireList;
    private List<Editeur> editeurList;
    private List<Auteur> auteurList;

    //GETTER AND SETTER


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNumISBN() {
        return numISBN;
    }

    public void setNumISBN(String numISBN) {
        this.numISBN = numISBN;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Editeur getEditeur() {
        return editeur;
    }

    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public List<Ouvrage> getOuvrageList() {
        return ouvrageList;
    }

    public void setOuvrageList(List<Ouvrage> ouvrageList) {
        this.ouvrageList = ouvrageList;
    }

    public String getReferenceInterne() {
        return referenceInterne;
    }

    public List<Exemplaire> getExemplaireList() {
        return exemplaireList;
    }

    public void setExemplaireList(List<Exemplaire> exemplaireList) {
        this.exemplaireList = exemplaireList;
    }

    public void setReferenceInterne(String referenceInterne) {
        this.referenceInterne = referenceInterne;
    }


    public List<Editeur> getEditeurList() {
        return editeurList;
    }

    public void setEditeurList(List<Editeur> editeurList) {
        this.editeurList = editeurList;
    }

    public List<Auteur> getAuteurList() {
        return auteurList;
    }

    public void setAuteurList(List<Auteur> auteurList) {
        this.auteurList = auteurList;
    }

    public String doaffiche(){
        LOGGER.info("dans la methode doaffiche");

        /*if (id==null){
            System.out.println("rien");
        }
        else
        {*/
           exemplaireList=por.afficherExemplaire();
       // }
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println();
        System.out.println("------"+exemplaireList.toString());

        return ActionSupport.SUCCESS;
    };

public String dorecherche(){
      LOGGER.info("DANS LA METHODE DOLOGIN");

    String vresult = ActionSupport.INPUT;

        if (!StringUtils.isAllEmpty(ouvrage.getIntituleOuvrage(), genre.getIntituleGenre())) {


        try {


            exemplaireList = por.listerlesExemplairesparintitule(ouvrage.getID());
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println();
            System.out.println(exemplaireList.toString());

                return vresult;


        }
        catch(Exception e){
            this.addActionError("mt de pass invalide");
        }

        vresult=ActionSupport.SUCCESS;

    }
        return vresult;
}
}
