package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCAuthor;
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

    private DMPCAuthor author;

    public DMPCContext() {
    }

    public DMPCContext(DMPCAuthor author) {
        this.author = author;
    }
    
    @NotNull
    public DMPCAuthor getAuthor() {
        return author;
    }

    public void setAuthor(DMPCAuthor author) {
        this.author = author;
    }
 
    @Override
    public String toString() {
        return "DMPCContext{author=" + author + '}';
    }
    
    
}
