package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;

/**
 *
 * @author lforet
 */
public class DMPCPatient {

    @NotNull
    private String insc;
    @NotNull
    private String internalId;
    private String nom;
    private String prenom;
    private String nomEpouse;
    private String dateDeNaissance;
    private int ordreDeNaissance;
    private String email;
    private String telephone;
    private DMPCAdresse adresse;
    private DMPCSexe sexe;

    /**
     * Identifiant Nationale de Santé 
     */
    @NotNull
    public String getInsc() {
        return insc;
    }

    /**
     * Identifiant interne dans le système 
     */
    @NotNull
    public String getInternalId() {
        return internalId;
    }

    /**
     * Nom du patient
     */
    public String getNom() {
        return nom;
    }

    /**
     * Prenom du patient
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Nom d'épouse de la patiente
     */
    public String getNomEpouse() {
        return nomEpouse;
    }

    /**
     * Date de naissance au format yyyyMMdd.
     * 
     */
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * Ordre de naisssance an cas de naissance multiple.
     */
    public int getOrdreDeNaissance() {
        return ordreDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public DMPCAdresse getAdresse() {
        return adresse;
    }

    public DMPCSexe getSexe() {
        return sexe;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setInsc(String insc) {
        this.insc = insc;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomEpouse(String nomEpouse) {
        this.nomEpouse = nomEpouse;
    }

    public void setOrdreDeNaissance(int ordreDeNaissance) {
        this.ordreDeNaissance = ordreDeNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAdresse(DMPCAdresse adresse) {
        this.adresse = adresse;
    }

    public void setSexe(DMPCSexe sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "DMPCPatient{" + "insc=" + insc + ", internalId=" + internalId + ", nom=" + nom + ", prenom=" + prenom + ", nomEpouse=" + nomEpouse + ", dateDeNaissance=" + dateDeNaissance + ", ordreDeNaissance=" + ordreDeNaissance + ", email=" + email + ", telephone=" + telephone + ", adresse=" + adresse + ", sexe=" + sexe + '}';
    }
    
}
