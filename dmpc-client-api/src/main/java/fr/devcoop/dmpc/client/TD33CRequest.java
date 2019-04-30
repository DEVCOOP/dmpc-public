package fr.devcoop.dmpc.client;

import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD3.3c
 * 
 * 
 * @author lforet
 */
public class TD33CRequest {

    @NotNull
    private String documentUuid;
    @NotNull
    private String patientId;
    @NotNull 
    private String contentType;
    
    public String getDocumentUuid() {
        return documentUuid;
    }

    public void setDocumentUuid(String documentUuid) {
        this.documentUuid = documentUuid;
    }

    public String getIns() {
        return patientId;
    }

    public void setIns(String patientId) {
        this.patientId = patientId;
    }

    @Deprecated
    public String getInsc() {
        return patientId;
    }

    @Deprecated
    public void setInsc(String insc) {
        this.patientId = insc;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "TD33CRequest{" + "documentUuid=" + documentUuid + ", insc=" + patientId + ", contentType=" + contentType + '}';
    }
    
}
