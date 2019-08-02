package fr.devcoop.dmpc.client;

import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction DMP3.1b
 * 
 * 
 * @author lforet
 */
public class TD31bRequest {

    @NotNull
    private String ins;
    
    @NotNull
    private String documentUniqueId;

    public String getDocumentUniqueId() {
        return documentUniqueId;
    }

    public void setDocumentUniqueId(String documentUniqueId) {
        this.documentUniqueId = documentUniqueId;
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }

    
}
