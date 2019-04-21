package org.biblio.p7.service;

import org.biblio.p7.bean.Emprunt;
import org.biblio.p7.managerimpl.ManagerFactoryImpl;

import java.util.List;

public class PretServiceImpl implements  PretService {
    private ManagerFactoryImpl managerFactory;

    public ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public void setManagerFactory(ManagerFactoryImpl managerFactory) {
        this.managerFactory = managerFactory;
    }

    @Override
    public List<Emprunt> afficherlesemprunts() {

        return managerFactory.getEmpruntManager().afficherlesemprunts();
    }

    @Override
    public void ajouterunemprunt(Emprunt emprunt) {
managerFactory.getEmpruntManager().ajouterunemprunt(emprunt);
    }

    @Override
    public Emprunt supprimerEmprunt(Integer iD) {
        return getManagerFactory().getEmpruntManager().supprimerEmprunt(iD);
    }

    @Override
    public void modifierEmprunt(Emprunt emprunt) {
        getManagerFactory().getEmpruntManager().modifierEmprunt(emprunt);
    }

    @Override
    public Emprunt rechercherEmpruntparId(Integer iD) {
        return null;
    }

    @Override
    public List<Emprunt> afficherlesempruntsparsituation(Integer iD) {
        return getManagerFactory().getEmpruntManager().afficherlesempruntsparsituation(iD);
    }

    @Override
    public List<Emprunt> afficherlesempruntsenretard() {
        return getManagerFactory().getEmpruntManager().afficherlesempruntsenretard();
    }

    @Override
    public List<Emprunt> afficherlesempruntsparLecteur(Integer iD) {
        return getManagerFactory().getEmpruntManager().afficherlesempruntsparLecteur(iD);
    }

    @Override
    public List<Emprunt> afficherleslivresdisponible() {
        return getManagerFactory().getEmpruntManager().afficherleslivresdisponible();
    }
}
