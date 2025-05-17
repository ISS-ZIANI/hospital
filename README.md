# 🏥 TP Spring Boot : Gestion d'un hôpital

## 🎯 Objectif du TP

Ce TP a pour objectif de créer une petite application de gestion hospitalière avec **Spring Boot**, en utilisant **Spring Data JPA** pour manipuler les données (patients, médecins, rendez-vous, consultations), tout en respectant l’architecture MVC simplifiée.

---

## 🧱 Structure du projet

- **Entities (`entites/`)** : 
  - `Patient`
  - `Medecin`
  - `RendezVous`
  - `Consultation`

- **Repositories (`repositories/`)** : interfaces JPA pour accéder à la base de données.

- **Service (`service/`)** : 
  - Interface `IHospitalService`
  - Implémentation `IHospitalServiceImpl`

- **HospitalApplication** : classe principale où j’utilise `CommandLineRunner` pour insérer des données automatiquement au démarrage.

---

## 🗃️ Fonctionnalités réalisées

- ✅ Création des entités avec les annotations JPA
- ✅ Définition des relations entre entités (`@ManyToOne`, `@OneToMany`)
- ✅ Création de services pour insérer les entités
- ✅ Insertion de patients, médecins, rendez-vous et consultations dans la base H2
- ✅ Affichage automatique de certains enregistrements via la console

---

## 📸 Captures d’écran

### 🔍 Patients enregistrés
![patients](screenshots/patients.png)

### 🩺 Médecins insérés
![medecins](screenshots/medecins.png)

### 📅 Rendez-vous créés
![rendezvous](screenshots/rendezvous.png)

### 📝 Consultation enregistrée
![consultations](screenshots/consultations.png)

## 💡 Points techniques

- Utilisation de `CommandLineRunner` pour insérer des données de test
- Injection de dépendances via constructeur dans le service
- Base de données utilisée : **H2 en mémoire**
- Console H2 disponible à : `http://localhost:8080/h2-console`

---

## 🚀 Lancement du projet

```bash
mvn spring-boot:run
