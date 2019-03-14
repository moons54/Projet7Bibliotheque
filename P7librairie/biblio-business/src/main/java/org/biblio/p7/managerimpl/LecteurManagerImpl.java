package org.biblio.p7.managerimpl;

import org.biblio.p7.bean.Lecteur;
import org.biblio.p7.bean.Exception.Exception.NotFoundException;
import org.biblio.p7.manager.LecteurManager;
import org.biblio.p7.contract.*;
import org.biblio.p7.consumer.impl.DaoFactoryImpl;
import org.biblio.p7.manager.ManagerFactory;

import java.util.List;

public class LecteurManagerImpl extends AbstractManagerImpl implements LecteurManager {


    @Override
    public List<Lecteur> affichelecteur() throws NotFoundException {


return getDaoFactory().getLecteurDao().affichelecteur();
    }

    @Override
    public void ajouteLecteur(Lecteur lecteur) {
        getDaoFactory().getLecteurDao().ajouteLecteur(lecteur);

    }


    @Override
    public Lecteur supprimeLecteur(Integer iD) {
       // getDaoFactory().getLecteurDao().supprimeLecteur(iD);


        return  getDaoFactory().getLecteurDao().supprimeLecteur(iD);
    }

    @Override
    public void modifieLecteur(Lecteur lecteur) {

    }

    @Override
    public Lecteur rechercher(Integer iD) {
        return getDaoFactory().getLecteurDao().rechercher(iD);
    }

    @Override
    public Lecteur rechercherByNom(String nom) {
        return getDaoFactory().getLecteurDao().rechercherByLecteur(nom);
    }

    @Override
    public Lecteur controleLecteur(String identifiant, String motdepasse) throws NotFoundException {
        return getDaoFactory().getLecteurDao().controleLecteur(identifiant,motdepasse);
    }




}
