package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;

/**
 *
 * @author lfo
 */
public class DMPCStructureSante {

    @NotNull
    private String nom;
    
    private DMPCAdresse adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public DMPCAdresse getAdresse() {
        return adresse;
    }

    public void setAdresse(DMPCAdresse adresse) {
        this.adresse = adresse;
    }
    
    
}
