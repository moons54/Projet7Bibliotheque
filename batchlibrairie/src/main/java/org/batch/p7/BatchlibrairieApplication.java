package org.batch.p7;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BatchlibrairieApplication implements CommandLineRunner {


   /*public static void main(String[] args) {
        SpringApplication.run(BatchlibrairieApplication.class, args);
    }*/
 /*   @Bean
    public CommandLineRunner demo(EmailServiceImpl emailService ) {
        return (args) -> {
          //  emailService.sendSimpleMessage("aurelien.mimouni@gmail.com","essais sujet","mon long texte");
            emailService.relanceNiv1();

            System.out.println(" voir si ça fonctionne");
        };
    }
*/


        @Autowired
        JobLauncher jobLauncher;

        @Autowired
        Job job;

        public static void main(String[] args)
        {
            SpringApplication.run(BatchlibrairieApplication.class, args);
        }

        @Override
        public void run(String... args) throws Exception
        {
            JobParameters params = new JobParametersBuilder()
                    .addString("JobID", String.valueOf(System.currentTimeMillis()))
                    .toJobParameters();
            jobLauncher.run(job, params);
        }
    }



