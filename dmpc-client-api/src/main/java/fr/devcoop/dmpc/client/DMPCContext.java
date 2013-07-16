package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCAuthor;
import javax.validation.constraints.NotNull;

/**
 * A tout appel du proxy vers le DMP, il faut générer un contexte d'appel. C'est 
 * à dire qu'il faut que le proxy connaisse les informations suivantes :
 * 
 * <li> un login/password afin de sécurisé l'appel en interne
 * <li> la version du service appelé afin de suivre l'évolution du service 
 * <li> l'auteur PS qui réalise l'action.
 * 
 * 
 * @author lforet
 */
public class DMPCContext {

    private String login;
    private String password;
    private String version;
    private DMPCAuthor author;

    public DMPCContext(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public DMPCContext() {
    }

    @NotNull
    public DMPCAuthor getAuthor() {
        return author;
    }

    @NotNull
    public String getLogin() {
        return login;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public String getVersion() {
        return version;
    }

    public void setAuthor(DMPCAuthor author) {
        this.author = author;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String toString() {
        return "DMPCContext{" + "login=" + login + ", password=****, version=" + version + ", author=" + author + '}';
    }
    
    
}
