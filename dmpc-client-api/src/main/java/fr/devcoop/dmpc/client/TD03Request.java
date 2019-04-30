package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCRole;
import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD0.3
 * 
 * 
 * @author lforet
 */
public class TD03Request {

    @NotNull
    private String ins;
    @NotNull
    private DMPCRole role;

    public TD03Request() {
    }

    public TD03Request(String insc, DMPCRole role) {
        this.ins = insc;
        this.role = role;
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String patientid) {
        this.ins = patientid;
    }

    @Deprecated
    public String getInsc() {
        return ins;
    }

    @Deprecated
    public void setInsc(String insc) {
        this.ins = insc;
    }

    public DMPCRole getRole() {
        return role;
    }

    public void setRole(DMPCRole role) {
        this.role = role;
    }

    public String toString() {
        return "TD03Request{" + "insc=" + ins + ", role=" + role + '}';
    }
    
}
