package org.biblio.p7.service;


import org.biblio.p7.bean.Coordonnees;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName  = "CoordonneesService")
public interface CoordonneesService {


    @WebMethod
    public Coordonnees rechercherbyNom(@WebParam(name="iD")Integer iD);

    @WebMethod
    public List<Coordonnees> rechercherbylecteur(@WebParam(name ="lecteurid" ) Integer iD);

    @WebMethod
    public void ajouterCoordonnees(Coordonnees coordonnees);

    @WebMethod
    public void modifierCooronnees(Coordonnees coordonnees);

}
