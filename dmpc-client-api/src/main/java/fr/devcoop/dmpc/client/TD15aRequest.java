package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCPatient;

/**
 *
 * @author lfo
 */
public class TD15aRequest {

    private DMPCPatient patient;
    private String email;
    private String telephone;

    public DMPCPatient getPatient() {
        return patient;
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
