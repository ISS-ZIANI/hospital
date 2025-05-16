package ma.fsm.hospital.repositories;

import ma.fsm.hospital.entites.Medecin;
import ma.fsm.hospital.entites.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, String> {

}
