package fr.devcoop.dmpc.client;

import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD0.2
 * 
 * @author lforet
 */
public class TD02Request {

    @NotNull
    private String insc;

    public TD02Request() {
    }

    public TD02Request(String insc) {
        this.insc = insc;
    }

    public String getInsc() {
        return insc;
    }

    public void setInsc(String insc) {
        this.insc = insc;
    }

    public String toString() {
        return "TD02Request{" + "insc=" + insc + '}';
    }    
}
