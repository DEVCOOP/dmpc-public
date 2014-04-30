package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;

/**
 *
 * @author lforet
 */
public class DMPCPersonnelSante {

    private String adeli;
    private String rpps;
    private String internalId;
    private String nom;
    private String prenom;
    private String role;
    private String specialite;
    @NotNull
    private String secteurActivite;
    @NotNull
    private DMPCStructureSante structureSante;
    private String telephone;
    private String email;

    public DMPCPersonnelSante() {
    }

    public DMPCPersonnelSante(String internalId, String nom, String prenom) {
        this.internalId = internalId;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Numéro Adeli si connu
     * @return adeli
     */
    public String getAdeli() {
        return adeli;
    }

    /**
     * Numéro Rpps si connu
     * @return rpps
     */
    public String getRpps() {
        return rpps;
    }

    /**
     * Identifiant interne dans le système 
     * @return internalId
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Nom de l'auteur
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Prénom de l'auteur
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Code du role 
     * @see DMPCCode.ASIPJeuxValeurs#SUBJECT_ROLE
     * @return rolecertificate.getSubjectDN().toString()
     */
    public String getRole() {
        return role;
    }

    /**
     * code de la spécialité 
     * @see DMPCCode.ASIPJeuxValeurs#AUTHOR_SPECIALITY
     * @return specialite
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     * code HealthcareFacilityType
     * @see DMPCCode.ASIPJeuxValeurs#HEALTH_CARE_FACILITY_TYPE_CODE
     */
    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setAdeli(String adeli) {
        this.adeli = adeli;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRpps(String rpps) {
        this.rpps = rpps;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setSecteurActivite(String healthcareFacilityType) {
        this.secteurActivite = healthcareFacilityType;
    }

    public DMPCStructureSante getStructureSante() {
        if (structureSante == null) {
            structureSante = new DMPCStructureSante();
        }
        return structureSante;
    }

    public void setStructureSante(DMPCStructureSante structureSante) {
        this.structureSante = structureSante;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DMPCPersonnelSante{" + "adeli=" + adeli + ", rpps=" + rpps + ", internalId=" + internalId + ", nom=" + nom + ", prenom=" + prenom + ", role=" + role + ", specialite=" + specialite + ", secteurActivite=" + secteurActivite + ", structureSante=" + structureSante + ", telephone=" + telephone + ", email=" + email + '}';
    }
    
}
