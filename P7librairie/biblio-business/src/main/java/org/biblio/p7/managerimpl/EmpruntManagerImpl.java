package org.biblio.p7.managerimpl;

import org.biblio.p7.bean.Emprunt;
import org.biblio.p7.manager.EmpruntManager;

import java.util.List;

public class EmpruntManagerImpl extends AbstractManagerImpl implements EmpruntManager {
    @Override
    public List<Emprunt> afficherlesemprunts() {
        return getDaoFactory().getEmpruntDao().afficherlesemprunts();
    }

    @Override
    public void ajouterunemprunt(Emprunt emprunt) {
getDaoFactory().getEmpruntDao().ajouterunemprunt(emprunt);
    }

    @Override
    public Emprunt supprimerEmprunt(Integer iD) {
        return getDaoFactory().getEmpruntDao().supprimerEmprunt(iD);
    }

    @Override
    public void modifierEmprunt(Emprunt emprunt) {
getDaoFactory().getEmpruntDao().modifierEmprunt(emprunt);
    }

    @Override
    public Emprunt rechercherEmpruntparId(Integer iD) {
        return getDaoFactory().getEmpruntDao().rechercherEmpruntparId(iD);
    }

    @Override
    public List<Emprunt> afficherlesempruntsparsituation(Integer iD) {
        return getDaoFactory().getEmpruntDao().afficherlesempruntsparsituation(iD);
    }

    @Override
    public List<Emprunt> afficherlesempruntsenretard() {
        return getDaoFactory().getEmpruntDao().afficherlesempruntsenretard();
    }

    @Override
    public List<Emprunt> afficherlesempruntsparLecteur(Integer iD) {
        return getDaoFactory().getEmpruntDao().afficherlesempruntsparLecteur(iD);
    }

    @Override
    public List<Emprunt> afficherleslivresdisponible() {
        return getDaoFactory().getEmpruntDao().afficherleslivresdisponible();
    }
}
