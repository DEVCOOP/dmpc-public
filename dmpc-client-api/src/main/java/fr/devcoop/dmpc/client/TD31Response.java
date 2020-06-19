package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCDocument;
import fr.devcoop.dmpc.client.model.DMPCSubmission;
import java.util.List;

public class TD31Response {

    private List<DMPCDocument> documents;
    private List<DMPCSubmission> soumissions;

    public List<DMPCDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DMPCDocument> documents) {
        this.documents = documents;
    }

    public List<DMPCSubmission> getSoumissions() {
        return soumissions;
    }

    public void setSoumissions(List<DMPCSubmission> soumissions) {
        this.soumissions = soumissions;
    }
    
    
}
