package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author lfo
 */
public class DMPCCarteVitaleInfo {

    @NotNull
    private String nom;
    @NotNull
    private String nomEpouse;
    @NotNull
    private String prenom;
    @NotNull
    @Length(max = 6, min = 6)
    private String dateNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomEpouse() {
        return nomEpouse;
    }

    public void setNomEpouse(String nomEpouse) {
        this.nomEpouse = nomEpouse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

}
