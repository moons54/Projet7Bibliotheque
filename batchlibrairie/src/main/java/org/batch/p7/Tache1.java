package org.batch.p7;

import org.biblio.p7.service.*;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
public class Tache1 implements Tasklet {


    gestionMail gestionMail;


    EmailServiceImpl emailService;

@Autowired
public Tache1(gestionMail gestionMail,EmailServiceImpl emailService){
    this.gestionMail=gestionMail;
    this.emailService=emailService;
}

    public Tache1() {
    }

    Lecteur lecteur;
    Exemplaire exemplaire;


    //LIAISON AVEC WEBSERVICE EMPRUNT
    AuthentificationService_Service authentificationService_service=new AuthentificationService_Service();
    AuthentificationService por=authentificationService_service.getAuthentificationServicePort();

    OuvrageService_Service ouvrageService_service=new OuvrageService_Service();
    OuvrageService por2=ouvrageService_service.getOuvrageServicePort();

    PretService_Service pretServicePort_client=new PretService_Service();
    PretService por3=pretServicePort_client.getPretServicePort();

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {




        List<Emprunt> empruntList=por3.afficherlesempruntsenretard();
        Iterator<Emprunt> it=empruntList.iterator();
while (it.hasNext()) {
    Emprunt emprunt = it.next();
    System.out.println(emprunt.getExemplaire().getOuvrage().getIntituleOuvrage());
    System.out.println(emprunt.getLecteur().getNom());
   //

}



        return RepeatStatus.FINISHED;
    }
}
