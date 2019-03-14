package org.biblio.p7.service;

import org.biblio.p7.bean.Coordonnees;
import org.biblio.p7.managerimpl.ManagerFactoryImpl;

import java.util.List;

public class CoordonneesServiceImpl implements CoordonneesService {



    private ManagerFactoryImpl managerFactory;

    public ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public void setManagerFactory(ManagerFactoryImpl managerFactory) {
        this.managerFactory = managerFactory;
    }

    @Override
    public Coordonnees rechercherbyNom(Integer iD) {

        Coordonnees coordonnees=managerFactory.getCoordonneesManager().afficheCoordonneByLecteur(iD);
        return coordonnees;
    }

    @Override
    public List<Coordonnees> rechercherbylecteur(Integer iD) {

        List <Coordonnees> coordonnees=managerFactory.getCoordonneesManager().listeCoordonneByLecteur(iD);
        return coordonnees;
    }

    @Override
    public void ajouterCoordonnees(Coordonnees coordonnees) {
        managerFactory.getCoordonneesManager().ajouteCoordonnees(coordonnees);
    }

    @Override
    public void modifierCooronnees(Coordonnees coordonnees) {
        managerFactory.getCoordonneesManager().modifierCoordonnees(coordonnees);
    }

}
