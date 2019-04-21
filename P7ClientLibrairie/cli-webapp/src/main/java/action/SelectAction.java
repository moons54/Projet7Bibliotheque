package action;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import org.biblio.p7.service.Ouvrage;
import org.biblio.p7.service.OuvrageService;
import org.biblio.p7.service.OuvrageService_Service;

public class SelectAction extends ActionSupport{

    OuvrageService_Service ouvrageService_service = new OuvrageService_Service();
    OuvrageService por = ouvrageService_service.getOuvrageServicePort();

    private List<String> searchEngine;

    private Ouvrage ouvrage;
    private String intituleouvrage;
    private String genreouvrage;

    private String yourSearchEngine;
    private String yourMonth;
private List<Ouvrage> ouvrageList;
    public String getYourMonth() {
        return yourMonth;
    }

    public void setYourMonth(String yourMonth) {
        this.yourMonth = yourMonth;
    }

    public List<String> getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(List<String> searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String getYourSearchEngine() {
        return yourSearchEngine;
    }

    public void setYourSearchEngine(String yourSearchEngine) {
        this.yourSearchEngine = yourSearchEngine;
    }

    public String getDefaultSearchEngine() {
        return "rien";
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public List<Ouvrage> getOuvrageList() {
        return ouvrageList;
    }

    public void setOuvrageList(List<Ouvrage> ouvrageList) {
        this.ouvrageList = ouvrageList;
    }

    public SelectAction() {
ouvrageList=por.listerlesOuvrages();
        searchEngine = new ArrayList<String>();
        for (Ouvrage ouv : ouvrageList
        ) {
            if (searchEngine.contains(ouv.getAuteur().getIntituleAuteur())) {
                System.out.println("rien");
            } else {
searchEngine.add(ouv.getAuteur().getIntituleAuteur());
            }
        }
    }

    public String execute() {
        return SUCCESS;
    }

    public String display() {
        return NONE;
    }

}