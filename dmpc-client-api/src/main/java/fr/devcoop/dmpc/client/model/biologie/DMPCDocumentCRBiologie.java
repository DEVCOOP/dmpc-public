package fr.devcoop.dmpc.client.model.biologie;

import fr.devcoop.dmpc.client.model.DMPCDocument;
import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfo
 */
public class DMPCDocumentCRBiologie extends DMPCDocument {

    private String id;
    private int versionNumber;
    private Participation prescription;
    private Participation prelevement;
    private List<Participation> validations;
    private List<DMPCPersonnelSante> destinataires;

    private StructuredBody body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Participation getPrescription() {
        return prescription;
    }

    public void setPrescription(Participation prescription) {
        this.prescription = prescription;
    }

    public Participation getPrelevement() {
        return prelevement;
    }

    public void setPrelevement(Participation prelevement) {
        this.prelevement = prelevement;
    }

    public List<Participation> getValidations() {
        if (validations == null) {
            validations = new ArrayList<>();
        }
        return validations;
    }

    public void setValidations(List<Participation> validations) {
        this.validations = validations;
    }

    public List<DMPCPersonnelSante> getDestinataires() {
        if (destinataires == null) {
            destinataires = new ArrayList<>();
        }
        return destinataires;
    }

    public void setDestinataires(List<DMPCPersonnelSante> destinataires) {
        this.destinataires = destinataires;
    }

    public StructuredBody getBody() {
        if (body == null) {
            body = new StructuredBody();
        }
        return body;
    }

    public void setBody(StructuredBody body) {
        this.body = body;
    }

    

}
