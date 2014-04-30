package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;
import javax.validation.constraints.NotNull;

/**
 * A tout appel du proxy vers le DMP, il faut générer un contexte d'appel. C'est 
 * à dire qu'il faut que le proxy connaisse les informations suivantes :
 * 
 * <li> l'auteur PS qui réalise l'action.
 * <
 * 
 * @author lforet
 */
public class DMPCContext {

    private DMPCPersonnelSante author;

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
 
    @Override
    public String toString() {
        return "DMPCContext{author=" + author + '}';
    }
    
    
}
