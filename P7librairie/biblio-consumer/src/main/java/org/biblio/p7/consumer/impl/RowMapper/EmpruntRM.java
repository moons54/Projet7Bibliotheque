package org.biblio.p7.consumer.impl.RowMapper;

import org.biblio.p7.bean.Emprunt;
import org.biblio.p7.consumer.impl.EmpruntDaoImpl;
import org.biblio.p7.consumer.impl.ExemplaireDaoImpl;
import org.biblio.p7.consumer.impl.LecteurDaoImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpruntRM implements RowMapper<Emprunt> {
    @Override
    public Emprunt mapRow(ResultSet rs, int rowNum) throws SQLException {
        Emprunt emprunt=new Emprunt();
        emprunt.setiD(rs.getInt("id"));
        emprunt.setDateDebut(rs.getDate("date_debut"));
        emprunt.setDateRetourEffectif(rs.getDate("date_retour_effectif"));
        emprunt.setDateFin(rs.getDate("date_fin"));
        emprunt.setRenouvellement(rs.getBoolean("renouvellement"));

        EmpruntDaoImpl empruntDao=new EmpruntDaoImpl();
        emprunt.setSituationEmprunt(empruntDao.recherchersituationdemprunt(rs.getInt("situation_empruntid")));

        ExemplaireDaoImpl exemplaireDao=new ExemplaireDaoImpl();
        emprunt.setExemplaire(exemplaireDao.rechercherExemplaire(rs.getInt("exemplaireid")));

        LecteurDaoImpl lecteurDao=new LecteurDaoImpl();
        emprunt.setLecteur(lecteurDao.rechercher(rs.getInt("lecteurid")));

        return emprunt;
    }
}
