package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCCode;
import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;
import javax.validation.constraints.NotNull;

/**
 * A tout appel du proxy vers le DMP, il faut générer un contexte d'appel, il permet 
 * de générer le VIHF (Vecteur d'Identification et d'Habilitation Formelles). 
 * 
 * C'est  à dire qu'il faut que le proxy connaisse les informations suivantes :
 * 
 * <li> l'auteur PS qui réalise l'action.
 * <li> un code de confidentialité : pour l'instant seul INVISIBLE_REPRESENTANTS_LEGAUX^1.2.250.1.213.1.1.4.13 est géré par le DMP.
 * 
 */
public class DMPCContext {

    private DMPCPersonnelSante author;
    private DMPCCode confidentialityCode;

    public DMPCContext() {
    }

    public DMPCContext(DMPCPersonnelSante author) {
        this.author = author;
    }
    
    @NotNull
    public DMPCPersonnelSante getAuthor() {
        return author;
    }

    public void setAuthor(DMPCPersonnelSante author) {
        this.author = author;
    }

    /** 
     * 
     * @return 
     */
    public DMPCCode getConfidentialityCode() {
        return confidentialityCode;
    }

    public void setConfidentialityCode(DMPCCode confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

    @Override
    public String toString() {
        return "DMPCContext{" + "author=" + author + ", confidentialitCode=" + confidentialityCode + '}';
    }
    
    
}
