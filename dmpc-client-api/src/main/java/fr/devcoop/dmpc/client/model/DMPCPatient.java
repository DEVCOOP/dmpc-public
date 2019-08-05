package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author lforet
 */
public class DMPCPatient {

    @NotNull 
    @Length(max = 22)
    private String ins;
    @NotNull
    private String internalId;
    @Length(max = 5)
    private String civilite;
    @Length(max = 80)
    private String nomPatronymique;
    @Length(max = 60)
    private String prenom;
    @NotNull
    @Length(max = 80)
    private String nomUsuel;
    @NotNull
    private String dateDeNaissance;
    private int ordreDeNaissance;
    private String paysDeNaissance;
    private String email;
    private String telephone;
    private String mobile;
    private DMPCAdresse adresse;
    private DMPCSexe sexe;
    private DMPCRepresentantLegal representantLegal;

    /**
     * Identifiant National du santé du patient dans le DMP (NIR dans le DMP v2)
     */
    @NotNull
    public String getIns() {    
        return ins;
    }

    /**
     * Utilisez le patientId, l'INSc n'est plus reconnu par le DMP en V2
     * 
     * @return l'INS
     * @deprecated 
     */
    @Deprecated
    public String getInsc() {
        return ins;
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

    public DMPCRepresentantLegal getRepresentantLegal() {
        return representantLegal;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Deprecated
    public void setInsc(String insc) {
        this.ins = insc;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setNomPatronymique(String nomPatronymique) {
        this.nomPatronymique = nomPatronymique;
    }

    public void setNomUsuel(String nomUsuel) {
        this.nomUsuel = nomUsuel;
    }

    public void setOrdreDeNaissance(int ordreDeNaissance) {
        this.ordreDeNaissance = ordreDeNaissance;
    }

    public void setIns(String ins) {
        this.ins = ins;
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

    public void setRepresentantLegal(DMPCRepresentantLegal representantLegal) {
        this.representantLegal = representantLegal;
    }
    
    @Override
    public String toString() {
        return "DMPCPatient{" + "insc=" + ins + ", internalId=" + internalId + ", nomPatronymique=" + nomPatronymique + ", prenom=" + prenom + ", nomUsuel=" + nomUsuel + ", dateDeNaissance=" + dateDeNaissance + ", ordreDeNaissance=" + ordreDeNaissance + ", email=" + email + ", telephone=" + telephone + ", adresse=" + adresse + ", sexe=" + sexe + '}';
    }

}
