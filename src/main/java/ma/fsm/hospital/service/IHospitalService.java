package ma.fsm.hospital.service;

import ma.fsm.hospital.entites.Consultation;
import ma.fsm.hospital.entites.Medecin;
import ma.fsm.hospital.entites.Patient;
import ma.fsm.hospital.entites.RendezVous;

public interface IHospitalService  {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
