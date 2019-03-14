package org.biblio.p7.consumer.impl;

import org.biblio.p7.bean.Ouvrage;
import org.biblio.p7.bean.OuvrageGenre;
import org.biblio.p7.consumer.impl.RowMapper.OuvrageGenreRM;
import org.biblio.p7.consumer.impl.RowMapper.OuvrageRM;
import org.biblio.p7.contract.OuvrageDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

public class OuvrageDaoImpl extends AbstractDaoimpl implements OuvrageDao {
    @Override
    public List<Ouvrage> afficherOuvrage() {
        String vSQL="select id, intitule_ouvrage, description, photo, num_isbn, auteurid from ouvrage";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
      OuvrageRM ouvrageRM = new OuvrageRM();
      List<Ouvrage> afficheliste= vJdbcTemplate.query(vSQL,ouvrageRM);
        return afficheliste;
    }

    @Override
    public void ajouterOuvrage(Ouvrage ouvrage) {
        String vSQL="insert into ouvrage(intitule_ouvrage, description, photo, num_isbn)"+
                " VALUES (:intituleOuvrage,:description,:photo,:isbn)";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(ouvrage);
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);

    }

    @Override
    public Ouvrage supprimerOuvrage(Integer iD) {
        String vSQL="delete from ouvrage where id=?";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));

        OuvrageRM ouvrageRM=new OuvrageRM();
        vJdbcTemplate.update(vSQL,new Object[]{iD});
        return null;
    }

    @Override
    public void modifierOuvrage(Ouvrage ouvrage) {
        String vSQL="UPDATE ouvrage set intitule_ouvrage=:intituleOuvrage, description=:description,photo=:photo,num_isbn=:isbn";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(ouvrage);
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);
    }

    @Override
    public Ouvrage rechercherparOuvrage(String intituleOuvrage) {
        String vsql = "SELECT * FROM public.ouvrage WHERE intitule_ouvrage=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        OuvrageRM ouvrageRM=new OuvrageRM();

        Ouvrage ouvrage=vJdbcTemplate.queryForObject(vsql,new Object[]{intituleOuvrage},ouvrageRM);
        return ouvrage;
    }

    @Override
    public Ouvrage rechercherparId(Integer id) {
        String vsql = "SELECT  id,intitule_ouvrage, description, photo, num_isbn, auteurid FROM public.ouvrage WHERE id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        OuvrageRM ouvrageRM = new OuvrageRM();

        Ouvrage ouvrage = vJdbcTemplate.queryForObject(vsql, new Object[]{id},ouvrageRM);
        return ouvrage;
    }

    @Override
    public Ouvrage rechercheparISBN(String isbn) {
        String vsql = "SELECT id, intitule_ouvrage, description, photo, num_isbn, auteurid FROM public.ouvrage WHERE num_isbn=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        OuvrageRM ouvrageRM = new OuvrageRM();

        Ouvrage ouvrage = vJdbcTemplate.queryForObject(vsql, new Object[]{isbn}, ouvrageRM);
        return ouvrage;
    }

    @Override
    public List<Ouvrage> Listerlesouvragepargenre(Integer id) {
        String vSQL="select id, intitule_ouvrage, description, photo, num_isbn, auteurid from ouvrage where id=?";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        OuvrageRM ouvrageRM = new OuvrageRM();


       List<Ouvrage> afficheliste= vJdbcTemplate.query(vSQL,new Object[]{id},ouvrageRM);

        return afficheliste;
    }
}
