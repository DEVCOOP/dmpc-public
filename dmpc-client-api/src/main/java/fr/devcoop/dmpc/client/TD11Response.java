package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCPatient;

/**
 *
 * @author lfo
 */
public class TD11Response {

    private DMPCPatient patient;

    public DMPCPatient getPatient() {
        return patient;
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }
    
}
