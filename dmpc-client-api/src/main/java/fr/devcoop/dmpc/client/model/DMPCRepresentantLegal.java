package fr.devcoop.dmpc.client.model;

import org.hibernate.validator.constraints.Length;

public class DMPCRepresentantLegal {

    private String civilite;
    @Length(max = 80)
    private String nom;
    @Length(max = 60)
    private String prenom;
    private String qualite; // Jeu de valeurs pour Qualité représentant légal 
    private String email;
    private String telephone;
    private String mobile;
    private DMPCAdresse adresse;

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public DMPCAdresse getAdresse() {
        return adresse;
    }

    public void setAdresse(DMPCAdresse adresse) {
        this.adresse = adresse;
    }

}
