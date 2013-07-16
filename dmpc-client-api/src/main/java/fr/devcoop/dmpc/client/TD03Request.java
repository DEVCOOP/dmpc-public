package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCRole;
import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD0.3
 * 
 * @author lforet
 */
public class TD03Request {

    @NotNull
    private String insc;
    @NotNull
    private DMPCRole role;

    public TD03Request() {
    }

    public TD03Request(String insc, DMPCRole role) {
        this.insc = insc;
        this.role = role;
    }

    public String getInsc() {
        return insc;
    }

    public void setInsc(String insc) {
        this.insc = insc;
    }

    public DMPCRole getRole() {
        return role;
    }

    public void setRole(DMPCRole role) {
        this.role = role;
    }

    public String toString() {
        return "TD03Request{" + "insc=" + insc + ", role=" + role + '}';
    }
    
}
