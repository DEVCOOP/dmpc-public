package fr.devcoop.dmpc.client.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author lforet
 */
public class DMPCSubmission {

    private String comments;
    @NotNull
    private String contentType;
    @NotEmpty
    private List<DMPCDocument> documents = new ArrayList<>();
    @NotNull
    private DMPCPatient patient;
    private String title;
    private String uuid;

    /**
     * Commentaires
     */
    public String getComments() {
        return comments;
    }

    /**
     * Code du contentType
     * @see DMPCCode.ASIPJeuxValeurs#CONTENT_TYPE_CODE
     */
    @NotNull
    public String getContentType() {
        return contentType;
    }

    /**
     * Une soumission contient au moins un document. 
     */
    @NotEmpty
    public List<DMPCDocument> getDocuments() {
        return documents;
    }

    /**
     * Patient de la soumission : tous les documents d'une même soumission 
     * concerne un seul et même patient.
     * @return le patient
     */
    @NotNull
    public DMPCPatient getPatient() {
        return patient;
    }

    /**
     *  Titre de la soumission
     */
    public String getTitle() {
        return title;
    }

    /**
     * Identifiant universel de la soumission 
     */
    public String getUuid() {
        return uuid;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void addDocument(DMPCDocument document) {
        this.documents.add(document);
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setDocuments(List<DMPCDocument> documents) {
        this.documents = documents;
    }

    public String toString() {
        return "DMPCSubmission{" + "comments=" + comments + ", contentType=" + contentType + ", documents=" + documents + ", patient=" + patient + ", title=" + title + ", uuid=" + uuid + '}';
    }
        
}
