package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCPatient;
import fr.devcoop.dmpc.client.model.DMPCRole;

/**
 *
 * @author lforet
 */
public class TD02Response {

    private DMPCPatient patient;
    private DMPCRole role;

    public DMPCPatient getPatient() {
        return patient;
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }

    public DMPCRole getRole() {
        return role;
    }

    public void setRole(DMPCRole role) {
        this.role = role;
    }

    public String toString() {
        return "TD02Response{" + "patient=" + patient + ", role=" + role + '}';
    }
    
}
