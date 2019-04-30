package fr.devcoop.dmpc.client;

import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD0.2
 * 
 * 
 * @author lforet
 */
public class TD02Request {

    @NotNull
    private String ins;

    public TD02Request() {
    }

    public TD02Request(String patientId) {
        this.ins = patientId;
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String patientId) {
        this.ins = patientId;
    }
    
    @Deprecated
    public String getInsc() {
        return ins;
    }

    @Deprecated
    public void setInsc(String insc) {
        this.ins = insc;
    }

    public String toString() {
        return "TD02Request{" + "patientId=" + ins + '}';
    }    
}
