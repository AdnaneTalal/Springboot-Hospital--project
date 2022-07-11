package ma.emsi.patientsmvc.Entities.Repositories;

import ma.emsi.patientsmvc.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}
