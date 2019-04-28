package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.biblio.p7.service.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class EmpruntAction extends ActionSupport implements SessionAware {

    @Override
    public void setSession(Map<String, Object> session) {

    }

    private final Logger LOGGER = (Logger) LogManager.getLogger(EmpruntAction.class);



    //LIAISON AVEC WEBSERVICE EMPRUNT
    PretServiceService pretService=new PretServiceService();
    PretService por=pretService.getPretServicePort();


    Date dateDebut;
    Date dateFin;
    Date dateRetourEffectif;
    String renouvellement;
    SituationDemprunt situationDemprunt;
    Exemplaire exemplaire;
    Lecteur lecteur;


    //SORTIE
    List<Exemplaire> exemplaireList;
    List<Lecteur> lecteurList;
    List<Emprunt> empruntList;

    //GETTER AND SETTER


    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateRetourEffectif() {
        return dateRetourEffectif;
    }

    public void setDateRetourEffectif(Date dateRetourEffectif) {
        this.dateRetourEffectif = dateRetourEffectif;
    }

    public String getRenouvellement() {
        return renouvellement;
    }

    public void setRenouvellement(String renouvellement) {
        this.renouvellement = renouvellement;
    }

    public SituationDemprunt getSituationDemprunt() {
        return situationDemprunt;
    }

    public void setSituationDemprunt(SituationDemprunt situationDemprunt) {
        this.situationDemprunt = situationDemprunt;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public List<Exemplaire> getExemplaireList() {
        return exemplaireList;
    }

    public void setExemplaireList(List<Exemplaire> exemplaireList) {
        this.exemplaireList = exemplaireList;
    }

    public List<Lecteur> getLecteurList() {
        return lecteurList;
    }

    public void setLecteurList(List<Lecteur> lecteurList) {
        this.lecteurList = lecteurList;
    }




    //LES METHODES

    String doemprunbyid(){
        LOGGER.info("dans la methode doemprunt");
       // empruntList = por.rechercherEmpruntparId()
return ActionSupport.SUCCESS;
    }


}
