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
    private DMPCInsNirAutorite insNirAutorite;
    
    
    /**
     * Si les NIR proviennent d’une carte Vitale, l’OID de l’autorité d'affectation des NIR doit correspondre au type de carte Vitale.
     * Pour une carte Vitale réelle, le LPS attribue l’OID réel.
     * Pour une carte Vitale de test, le LPS attribue l’OID de test.
     * Pour une carte Vitale de démonstration, le LPS attribut l’OID de démonstration.
     * Sinon, l’OID doit correspondre au type de NIR utilisé :
     * NIR d’une personne réelle, le LPS attribue l’OID réel.
     * NIR d’une personne fictive utilisé pour des tests, le LPS attribue l’OID de test,
     * NIR d’une personne fictive utilisé pour des démonstrations, le LPS attribue l’OID de démonstration.Tous ces OID sont définis dans [OID-INS].
     */
    public enum DMPCInsNirAutorite {
        TEST, DEMO, REEL;
    }

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

    public DMPCInsNirAutorite getInsNirAutorite() {
        return insNirAutorite;
    }

    public void setInsNirAutorite(DMPCInsNirAutorite insNirAutorite) {
        this.insNirAutorite = insNirAutorite;
    }
    
    @Override
    public String toString() {
        return "DMPCContext{" + "author=" + author + ", confidentialityCode=" + confidentialityCode + ", type=" + insNirAutorite + '}';
    }
    
}
