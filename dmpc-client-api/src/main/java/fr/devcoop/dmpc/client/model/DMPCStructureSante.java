package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;

/**
 *
 * @author lfo
 */
public class DMPCStructureSante {
    
    private String idNational;

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

    public String getIdNational() {
        return idNational;
    }

    public void setIdNational(String idNational) {
        this.idNational = idNational;
    }
    
    
}
