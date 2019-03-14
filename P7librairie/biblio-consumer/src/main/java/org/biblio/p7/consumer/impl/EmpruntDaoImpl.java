package org.biblio.p7.consumer.impl;

import org.biblio.p7.bean.Emprunt;
import org.biblio.p7.bean.SituationDemprunt;
import org.biblio.p7.consumer.impl.RowMapper.EmpruntRM;
import org.biblio.p7.consumer.impl.RowMapper.SituationEmpruntRM;
import org.biblio.p7.contract.EmpruntDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

public class EmpruntDaoImpl extends AbstractDaoimpl implements EmpruntDao {
    @Override
    public List<Emprunt> afficherlesemprunts() {
        String vsql = "SELECT * FROM public.emprunt ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM=new EmpruntRM();
        List<Emprunt> afficheliste= vJdbcTemplate.query(vsql,empruntRM);
        return afficheliste;
    }

    @Override
    public void ajouterunemprunt(Emprunt emprunt) {
        String vSQL="INSERT into public.emprunt(date_debut, date_fin, date_retour_effectif, renouvellement, situation_empruntid, exemplaireid, lecteurid) VALUES "+
                "(:dateDebut,:dateFin,:dateRetourEffectif,:renouvellement,:situationEmprunt,:exemplaire,:lecteur)";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(emprunt);
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);

    }

    @Override
    public Emprunt supprimerEmprunt(Integer iD) {
        String vsql="DELETE from emprunt where id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        EmpruntRM empruntRM=new EmpruntRM();


        vJdbcTemplate.update(vsql,new Object[]{iD});

        return null;
    }

    @Override
    public void modifierEmprunt(Emprunt emprunt) {
        String vSQL="update emprunt set situation_empruntid=:situationEmprunt,date_debut=:dateDebut,date_fin=:dateFin,date_retour_effectif=:dateRetourEffectif,renouvellement=:renouvellement,lecteurid=:lecteur,exemplaireid=:exemplaire";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(emprunt);
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);
    }

    @Override
    public Emprunt rechercherEmpruntparId(Integer iD) {
        String vsql = "SELECT * FROM public.emprunt where id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM=new EmpruntRM();
       Emprunt emprunt= (Emprunt)vJdbcTemplate.queryForObject(vsql,new Object[]{iD},empruntRM);

        return emprunt;
    }

    @Override
    public List<Emprunt> afficherlesempruntsparsituation(Integer iD) {
        String vsql = "SELECT * FROM public.emprunt where situation_empruntid=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM=new EmpruntRM();
        List<Emprunt> emprunt= vJdbcTemplate.query(vsql,new Object[]{iD},empruntRM);

        return emprunt;
    }

    @Override
    public List<Emprunt> afficherlesempruntsenretard() {
        String vsql = "SELECT * FROM public.emprunt where situation_empruntid=4";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM = new EmpruntRM();
        List<Emprunt> afficheliste = vJdbcTemplate.query(vsql, empruntRM);
        return afficheliste;
    }

    @Override
    public List<Emprunt> afficherlesempruntsparLecteur(Integer iD) {
        String vsql = "SELECT * FROM public.emprunt where lecteurid=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM = new EmpruntRM();
        List<Emprunt> afficheliste = vJdbcTemplate.query(vsql, empruntRM);
        return afficheliste;
    }

    @Override
    public List<Emprunt> afficherleslivresdisponible() {
        String vsql = "SELECT * FROM public.emprunt where situation_empruntid=2";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM = new EmpruntRM();
        List<Emprunt> afficheliste = vJdbcTemplate.query(vsql, empruntRM);
        return afficheliste;
    }

    public SituationDemprunt recherchersituationdemprunt(int id){
        String vsql = "SELECT * FROM public.situation_emprunt where id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        SituationEmpruntRM situationEmpruntRM = new SituationEmpruntRM();
        SituationDemprunt situationDemprunt = (SituationDemprunt)vJdbcTemplate.queryForObject(vsql, new Object[]{id},situationEmpruntRM);
        return situationDemprunt;
    }
}
