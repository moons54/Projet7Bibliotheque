package org.biblio.p7.consumer.impl;

//import com.sun.rowset.internal.Row;
import org.biblio.p7.bean.Lecteur;
import org.biblio.p7.consumer.impl.RowMapper.LecteurRM;
import org.biblio.p7.contract.LecteurDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class LecteurDaoImpl extends AbstractDaoimpl implements LecteurDao {

    private final Logger LOGGER=(Logger) LogManager.getLogger(LecteurDaoImpl.class);


    @Override
    public List<Lecteur> affichelecteur() {
        LOGGER.info("voir si affiche lecteur");
        String vsql = "SELECT * FROM public.Lecteur ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        LecteurRM rmlect = new LecteurRM();

        List<Lecteur> afficheliste = vJdbcTemplate.query(vsql, rmlect);
        return afficheliste;
    }


    //revoir code sur ajoute secteur
    @Override
    public void ajouteLecteur(Lecteur lecteur) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String modipass = passwordEncoder.encode(lecteur.getMotDePasse());
        System.out.println("------------- encodage"+modipass);
//         String vSQL = "INSERT INTO public.lecteur(identifiant, nom, prenom, motdepasse, date_inscription, num_cni, date_de_naissance) VALUES (?,?,?,?,${modipass},?,?) ";



  String vSQL = "INSERT INTO public.lecteur(identifiant, nom, prenom, motdepasse, date_inscription, date_de_naissance) VALUES "
                + "(:identifiant,:nom,:prenom,:motDePasse,:dateInscription,:dateDeNaissance)";
        //JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(lecteur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public Lecteur supprimeLecteur(Integer iD) {
        String vsql = "delete  from public.Lecteur WHERE id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        LecteurRM rmlect = new LecteurRM();

        vJdbcTemplate.update(vsql, new Object[]{iD});

        return null;
    }

    @Override
    public void modifieLecteur(Lecteur lecteur) {
        String vSQL = "UPDATE public.lecteur SET identifiant=:identifiant, nom=:nom, prenom=:prenom, motdepasse=:motDePasse, date_inscription=:dateInscription,"
                + "date_de_naissance=:dateDeNaissance WHERE id=:id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(lecteur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Lecteur rechercher(Integer iD) {
        String vsql = "SELECT * FROM public.Lecteur WHERE id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        LecteurRM rmlect = new LecteurRM();

        Lecteur lecteur = (Lecteur) vJdbcTemplate.queryForObject(vsql, new Object[]{iD}, rmlect);
        return lecteur;
    }

    @Override
    public Lecteur rechercherByLecteur(String nom) {
        String vsql = "SELECT * FROM public.Lecteur WHERE nom=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        LecteurRM rmlect = new LecteurRM();

        Lecteur lecteur = vJdbcTemplate.queryForObject(vsql, new Object[]{nom}, rmlect);
        return lecteur;
    }

    //methode de verification de login
    @Override
    public Lecteur controleLecteur(String identifiant, String motdepasse) {

            String vsql = "SELECT * FROM public.Lecteur WHERE identifiant=? ";


        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        LecteurRM rmlect = new LecteurRM();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        Lecteur lecteur = vJdbcTemplate.queryForObject(vsql, new Object[]{identifiant}, rmlect);
        if (passwordEncoder.matches(motdepasse, lecteur.getMotDePasse())) {
            System.out.println("---------------------------mot de passe valide ");
            return lecteur;
        } else {
            System.out.println("--------------------------Erreur connection");
            return null;
        }
    }
}
