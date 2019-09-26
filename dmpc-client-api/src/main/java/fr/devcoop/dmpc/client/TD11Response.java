package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCPatient;

/**
 *
 * @author lfo
 */
public class TD11Response {

    private DMPCPatient patient;
    private byte[] formulairePatient;

    public DMPCPatient getPatient() {
        return patient;
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }

    public byte[] getFormulairePatient() {
        return formulairePatient;
    }

    public void setFormulairePatient(byte[] formulairePatient) {
        this.formulairePatient = formulairePatient;
    }
    
}
