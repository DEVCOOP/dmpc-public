package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lfo
 */
public class DMPCCarteVitaleInfo {

    private String nomPatronymique;
    @NotNull
    private String nomUsuel;
    @NotNull
    private String prenom;
    @NotNull
    @Size(max = 6, min = 6)
    private String dateNaissance;

    public String getNomPatronymique() {
        return nomPatronymique;
    }

    public void setNomPatronymique(String nomPatronymique) {
        this.nomPatronymique = nomPatronymique;
    }

    public String getNomUsuel() {
        return nomUsuel;
    }

    public void setNomUsuel(String nomUsuel) {
        this.nomUsuel = nomUsuel;
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
