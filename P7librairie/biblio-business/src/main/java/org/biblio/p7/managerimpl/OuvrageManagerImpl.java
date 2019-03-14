package org.biblio.p7.managerimpl;

import org.biblio.p7.bean.Ouvrage;
import org.biblio.p7.manager.OuvrageManager;

import java.util.List;

public class OuvrageManagerImpl extends AbstractManagerImpl implements OuvrageManager {
    @Override
    public List<Ouvrage> afficherExemplaire() {
        return getDaoFactory().getOuvrageDao().afficherOuvrage();
    }

    @Override
    public List<Ouvrage> Listerlesouvragepargenre(Integer Id) {
        return getDaoFactory().getOuvrageDao().Listerlesouvragepargenre(Id);
    }

    @Override
    public void ajouterOuvrage(Ouvrage ouvrage) {
        getDaoFactory().getOuvrageDao().ajouterOuvrage(ouvrage);
    }

    @Override
    public Ouvrage supprimerOuvrage(Integer iD) {
        return getDaoFactory().getOuvrageDao().supprimerOuvrage(iD);
    }

    @Override
    public void modifierOuvrage(Ouvrage ouvrage) {
        getDaoFactory().getOuvrageDao().modifierOuvrage(ouvrage);
    }

    @Override
    public Ouvrage rechercherparOuvrage(String intituleOuvrage) {
        return getDaoFactory().getOuvrageDao().rechercherparOuvrage(intituleOuvrage);
    }

    @Override
    public Ouvrage rechercherparId(Integer iD) {
        return getDaoFactory().getOuvrageDao().rechercherparId(iD);
    }

    @Override
    public Ouvrage rechercheparISBN(String isbn) {
        return getDaoFactory().getOuvrageDao().rechercheparISBN(isbn);
    }
}
