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

    public String toString() {
        return "DMPCPatient{" + "insc=" + insc + ", internalId=" + internalId + ", nom=" + nom + ", prenom=" + prenom + ", nomEpouse=" + nomEpouse + ", dateDeNaissance=" + dateDeNaissance + ", ordreDeNaissance=" + ordreDeNaissance + '}';
    }
    
}
