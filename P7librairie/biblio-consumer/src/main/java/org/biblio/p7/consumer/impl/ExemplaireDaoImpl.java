package org.biblio.p7.consumer.impl;

import org.biblio.p7.bean.Exemplaire;
import org.biblio.p7.consumer.impl.RowMapper.ExemplaireRM;
import org.biblio.p7.contract.ExemplaireDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

public class ExemplaireDaoImpl extends AbstractDaoimpl implements ExemplaireDao {
    @Override
    public List<Exemplaire> afficherExemplaire() {
        String vsql = "SELECT id, referenceinterne, ouvrageid,bibliothequeid FROM public.exemplaire ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ExemplaireRM exemplaireRM=new ExemplaireRM();
         List<Exemplaire> afficheliste= vJdbcTemplate.query(vsql,exemplaireRM);
        return afficheliste;
    }

    @Override
    public void ajouterExemplaire(Exemplaire exemplaire) {
String vSQL="INSERT into public.exemplaire(referenceinterne) values "+
        "(:referenceInterne)";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(exemplaire);
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);

    }

    @Override
    public Exemplaire supprimerExemplaire(Integer iD) {
        String vsql="DELETE from exemplaire where id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((getDataSource()));
        ExemplaireRM exemplaireRM=new ExemplaireRM();


        vJdbcTemplate.update(vsql,new Object[]{iD});

        return null;
    }

    @Override
    public void modifierExemplaire(Exemplaire exemplaire) {
       String vSQL="update exemplaire set referenceinterne=:referenceInterne";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(exemplaire);
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);
    }

    public Exemplaire rechercherExemplaire(Integer id) {
        String vsql = "SELECT id, referenceinterne, ouvrageid,bibliothequeid FROM public.exemplaire where id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ExemplaireRM exemplaireRM=new ExemplaireRM();
        Exemplaire exemplaire= (Exemplaire) vJdbcTemplate.queryForObject(vsql,new Object[]{id},exemplaireRM);
        return exemplaire;
    }
}
