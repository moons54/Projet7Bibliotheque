package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.dispatcher.Parameter;
import org.biblio.p7.service.*;


import java.util.List;
import java.util.stream.Collectors;

public class OuvrageAction extends ActionSupport {


    private final Logger LOGGER = (Logger) LogManager.getLogger(OuvrageAction.class);


    OuvrageService_Service ouvrageService_service = new OuvrageService_Service();
    OuvrageService por = ouvrageService_service.getOuvrageServicePort();

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
    private OuvrageGenre ouvrageGenre;
    private Auteur auteur;
    private List<Ouvrage> ouvrageList;
    private List<Exemplaire> exemplaireList;
    private List<Editeur> editeurList;
    private List<Auteur> auteurList;
    private List<OuvrageGenre> ouvrageGenreList;

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

    public OuvrageGenre getOuvrageGenre() {
        return ouvrageGenre;
    }

    public void setOuvrageGenre(OuvrageGenre ouvrageGenre) {
        this.ouvrageGenre = ouvrageGenre;
    }

    public List<OuvrageGenre> getOuvrageGenreList() {
        return ouvrageGenreList;
    }

    public void setOuvrageGenreList(List<OuvrageGenre> ouvrageGenreList) {
        this.ouvrageGenreList = ouvrageGenreList;
    }

    public String doafficheexemplaire() {
        LOGGER.info("dans la methode doaffiche");

        /*if (id==null){
            System.out.println("rien");
        }
        else
        {*/
        exemplaireList = por.afficherExemplaire();

        return ActionSupport.SUCCESS;
    }



    public String doafficheouvrage() {
        LOGGER.info("dans la methode doaffiche");


        ouvrageList = por.listerlesOuvrages();


        return ActionSupport.SUCCESS;
    }

    ;

    public String dorecherche() {

        String vresult = ActionSupport.INPUT;

        //condition validant l'ajout de formulaire

        if (this.genre != null|this.auteur !=null) {

            if (this.genre.getID()== 0|this.auteur.getID()==0) {


            } else {


            }


            if (!this.hasErrors()) {
                try {

                    ouvrageList=por.multichoix(this.genre.getID(),this.auteur.getID());




                    vresult = ActionSupport.SUCCESS;

                    this.addActionMessage("liste des ouvrage par genre");
                } catch (Exception e) {

                    vresult = ActionSupport.ERROR;
                }

            }
        }


        return vresult;
    }

    public String dorech(){

        String vresult = ActionSupport.INPUT;

        //condition validant l'ajout de formulaire

        if (this.ouvrage !=null) {

            if (this.ouvrage.getIsbn() == null) {
                this.addFieldError(" topo.nom", "ne peut pas etre vide");

            } else
            {


            }



            if (!this.hasErrors())
            {
                try
                {
                    ouvrage=por.rechercherparISBN(ouvrage.getIsbn());

                    vresult = ActionSupport.SUCCESS;
                    this.addActionMessage("Nouveau Topo consultable et pret a l'emploi");
                } catch (Exception e)
                {

                    vresult = ActionSupport.ERROR;
                }

            }
        }

        return vresult;
    };





}
