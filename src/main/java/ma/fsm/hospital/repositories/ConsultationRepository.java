package ma.fsm.hospital.repositories;

import ma.fsm.hospital.entites.Consultation;
import ma.fsm.hospital.entites.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

}
