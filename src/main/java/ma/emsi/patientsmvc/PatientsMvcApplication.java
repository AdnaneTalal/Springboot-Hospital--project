package ma.emsi.patientsmvc;

import ma.emsi.patientsmvc.Entities.Patient;
import ma.emsi.patientsmvc.Entities.Repositories.PatientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }


    CommandLineRunner commandLineRunner(PatientRepo patientRepo){
        return args -> {
           patientRepo.save(new Patient(null,"adanan",new Date(),12));
            patientRepo.save(new Patient(null,"atesn",new Date(),12));
           patientRepo.findAll().forEach(p->{
               System.out.println(p.getNom());
           });



        };
    }

}
