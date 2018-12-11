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
    private String civilite;
    private String nomPatronymique;
    private String prenom;
    private String nomUsuel;
    private String dateDeNaissance;
    private int ordreDeNaissance;
    private String paysDeNaissance;
    private String email;
    private String telephone;
    private String mobile;
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

    public String getCivilite() {
        return civilite;
    }

    /**
     * Le nom patronymique ou encore nom de famille ou encore nom de naissance
     */
    public String getNomPatronymique() {
        return nomPatronymique;
    }

    /**
     * Le nom usuel ou encore nom d'usage
     */
    public String getNomUsuel() {
        return nomUsuel;
    }

    /**
     * Prenom du patient
     */
    public String getPrenom() {
        return prenom;
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

    public String getPaysDeNaissance() {
        return paysDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
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

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setOrdreDeNaissance(int ordreDeNaissance) {
        this.ordreDeNaissance = ordreDeNaissance;
    }

    public void setPaysDeNaissance(String paysDeNaissance) {
        this.paysDeNaissance = paysDeNaissance;
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAdresse(DMPCAdresse adresse) {
        this.adresse = adresse;
    }

    public void setSexe(DMPCSexe sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "DMPCPatient{" + "insc=" + insc + ", internalId=" + internalId + ", nomPatronymique=" + nomPatronymique + ", prenom=" + prenom + ", nomUsuel=" + nomUsuel + ", dateDeNaissance=" + dateDeNaissance + ", ordreDeNaissance=" + ordreDeNaissance + ", email=" + email + ", telephone=" + telephone + ", adresse=" + adresse + ", sexe=" + sexe + '}';
    }

}
