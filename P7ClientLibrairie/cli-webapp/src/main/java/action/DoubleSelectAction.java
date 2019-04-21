package action;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;
import org.biblio.p7.service.*;

public class DoubleSelectAction extends ActionSupport{

    OuvrageService_Service ouvrageService_service = new OuvrageService_Service();
    OuvrageService por = ouvrageService_service.getOuvrageServicePort();

    private List<String> searchEngine;
    private Ouvrage ouvrage;
    private Genre genre;
    private Auteur auteur;

    private String yourSearchEngine;
    private String yourMonth;
    private List<Ouvrage> ouvrageList;
    Map languageMap;
    private String intituleouvrage;
    private String genreouvrage;

    public List<String> getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(List<String> searchEngine) {
        this.searchEngine = searchEngine;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public String getYourSearchEngine() {
        return yourSearchEngine;
    }

    public void setYourSearchEngine(String yourSearchEngine) {
        this.yourSearchEngine = yourSearchEngine;
    }

    public String getYourMonth() {
        return yourMonth;
    }

    public void setYourMonth(String yourMonth) {
        this.yourMonth = yourMonth;
    }

    public List<Ouvrage> getOuvrageList() {
        return ouvrageList;
    }

    public void setOuvrageList(List<Ouvrage> ouvrageList) {
        this.ouvrageList = ouvrageList;
    }

    public Map getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map languageMap) {
        this.languageMap = languageMap;
    }

    public String getIntituleouvrage() {
        return intituleouvrage;
    }

    public void setIntituleouvrage(String intituleouvrage) {
        this.intituleouvrage = intituleouvrage;
    }

    public String getGenreouvrage() {
        return genreouvrage;
    }

    public void setGenreouvrage(String genreouvrage) {
        this.genreouvrage = genreouvrage;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    ///METHODE
    public DoubleSelectAction(){
        ouvrageList=por.listerlesOuvrages();


        languageMap =new HashMap();
for (Ouvrage ouv:ouvrageList){
    languageMap.put(ouv.getGenres(),ouv.getAuteur());
    searchEngine.add(ouv.getAuteur().getIntituleAuteur());
    }
}




    public String execute() {
        return SUCCESS;
    }

    public String display() {
        return NONE;
    }

}