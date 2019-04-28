package org.biblio.p7.service;

import org.biblio.p7.bean.Emprunt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

public interface PretService {

    @WebMethod
    public List<Emprunt> afficherlesemprunts();

    @WebMethod
    public void ajouterunemprunt(Emprunt emprunt);

    @WebMethod
    public Emprunt supprimerEmprunt(@WebParam(name = "iD") Integer iD);

    @WebMethod
    public void modifierEmprunt(Emprunt emprunt);

    @WebMethod
    public Emprunt rechercherEmpruntparId(@WebParam(name = "iD") Integer iD);

    @WebMethod
    public List<Emprunt> afficherlesempruntsparsituation(@WebParam(name = "iD")Integer iD);

    @WebMethod
    public List<Emprunt> afficherlesempruntsenretard();

    @WebMethod
    public List<Emprunt> afficherlesempruntsparLecteur(@WebParam(name = "iD")Integer iD);

    @WebMethod
    public List<Emprunt> afficherleslivresdisponible();

    @WebMethod
    public List<Emprunt> afficherlesempruntbyexmemplaire(@WebParam(name = "iD")Integer iD);

    @WebMethod
    public Emprunt rechercherEmpruntparexp(@WebParam(name = "iD") Integer iD);

    @WebMethod
    public List<Emprunt> rechercherEmpruntparisbn(@WebParam(name = "isbn") String isbn);
}
