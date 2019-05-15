package org.biblio.p7.consumer.impl;

import org.biblio.p7.bean.Emprunt;
import org.biblio.p7.bean.SituationDemprunt;
import org.biblio.p7.consumer.impl.RowMapper.EmpruntRM;
import org.biblio.p7.consumer.impl.RowMapper.SituationEmpruntRM;
import org.biblio.p7.contract.EmpruntDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EmpruntDaoImpl extends AbstractDaoimpl implements EmpruntDao {


    public static Date ajouterJour(Date date, int nbJour) {
        Calendar cal = Calendar.getInstance();
        //cal.setTime(date.getTime();
        cal.add(Calendar.DAY_OF_MONTH, nbJour);
        return cal.getTime();
    }



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
                "(:dateDebut,:dateFin,:dateRetourEffectif,1,1,:exemplaire,1)";
        SqlParameterSource vParams=new BeanPropertySqlParameterSource(emprunt);

        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);

    }
    @Override
    public Emprunt addemprunt(Emprunt emprunt) {
        String vSQL="INSERT into public.emprunt(date_debut, date_fin, date_retour_effectif, renouvellement,situation_empruntid, exemplaireid, lecteurid) VALUES "+
                "(:dateDebut,:dateFin,:dateRetourEffectif,:renouvellement,:situationEmprunt,:exemplaire,:lecteur)";
//        SqlParameterSource vParams=new BeanPropertySqlParameterSource(emprunt);
        SqlParameterSource vParams=new MapSqlParameterSource()
                .addValue("dateDebut",new Date())
                .addValue("dateFin",ajouterJour(new Date(),40))
                .addValue("dateRetourEffectif",ajouterJour(new Date(),40))
                .addValue("renouvellement",0)
                .addValue("situationEmprunt",2)
                .addValue("exemplaire", emprunt.getExemplaire().getiD())
                .addValue("lecteur",emprunt.getLecteur().getId());
        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);
return emprunt;
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
    public Emprunt modifierEmprunt(Emprunt emprunt) {
        String vSQL="update emprunt set situation_empruntid=:situationEmprunt,date_retour_effectif=:dateRetourEffectif,renouvellement=:renouvellement,lecteurid=:lecteur,exemplaireid=:exemplaire where id=:id";
      //  SqlParameterSource vParams=new BeanPropertySqlParameterSource(emprunt);
        SqlParameterSource vParams=new MapSqlParameterSource()
            //    .addValue("dateDebut",emprunt.getDateDebut())
              // .addValue("dateFin",emprunt.getDateFin())
             .addValue("dateRetourEffectif",ajouterJour(new Date(),40))
                .addValue("renouvellement",1)
                .addValue("situationEmprunt",4)
                .addValue("exemplaire", emprunt.getExemplaire().getiD())
                .addValue("lecteur",emprunt.getLecteur().getId())
                .addValue("id",emprunt.getiD());

        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);
        return emprunt;
    }

    @Override
    public Emprunt changestatutemprunt(Emprunt emprunt) {
        String vSQL="update emprunt set situation_empruntid=:situationEmprunt,lecteurid=:lecteur,exemplaireid=:exemplaire where id=:id";
        //  SqlParameterSource vParams=new BeanPropertySqlParameterSource(emprunt);
        SqlParameterSource vParams=new MapSqlParameterSource()
               .addValue("situationEmprunt",4)
                .addValue("exemplaire", emprunt.getExemplaire().getiD())
                .addValue("lecteur",emprunt.getLecteur().getId())
                .addValue("id",emprunt.getiD());

        NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,vParams);
        return emprunt;
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
        List<Emprunt> afficheliste = vJdbcTemplate.query(vsql,new Object[]{iD}, empruntRM);
        return afficheliste;
    }

    @Override
    public List<Emprunt> afficherlesempruntsparLecteurencours(Integer iD) {
        String vsql = "SELECT * FROM public.emprunt where lecteurid=? and situation_empruntid!=1";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM = new EmpruntRM();
        List<Emprunt> afficheliste = vJdbcTemplate.query(vsql,new Object[]{iD}, empruntRM);
        return afficheliste;
    }

    @Override
    public List<Emprunt> afficherlesempruntbyexmemplaire(Integer iD) {
        String vsql = "SELECT * FROM public.emprunt where exemplaireid=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM = new EmpruntRM();
        List<Emprunt> afficheliste = vJdbcTemplate.query(vsql,new Object[]{iD}, empruntRM);
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

    public Emprunt rechercherEmpruntparexp(Integer iD) {
        String vsql = "SELECT * FROM public.emprunt where exemplaireid=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM=new EmpruntRM();
        Emprunt emprunt= (Emprunt)vJdbcTemplate.queryForObject(vsql,new Object[]{iD},empruntRM);

        return emprunt;
    }

    public List<Emprunt> rechercherEmpruntparisbn(String isbn) {
         String vsql = "SELECT DISTINCT public.emprunt.situation_empruntid  FROM public.emprunt join exemplaire e on emprunt.exemplaireid = e.id join ouvrage o on e.ouvrageid = o.id where num_isbn ='9782290170267' and situation_empruntid=1";
          //  String vsql = "select count(DISTINCT public.emprunt.exemplaireid) from public.emprunt join exemplaire e on emprunt.exemplaireid = e.id join ouvrage o on e.ouvrageid = o.id where num_isbn='9782290170267'";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        EmpruntRM empruntRM=new EmpruntRM();
       List <Emprunt> affichelist= vJdbcTemplate.query(vsql,new Object[]{isbn},empruntRM);

        return affichelist;
    }

    public SituationDemprunt situationDemprunt(int id){
        String vsql="SELECT * from public.situation_emprunt ";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        SituationEmpruntRM situationEmpruntRM=new SituationEmpruntRM();
        SituationDemprunt situationEmprunt= vJdbcTemplate.queryForObject(vsql,new Object[]{id},situationEmpruntRM);

        return situationEmprunt;
    }
}
