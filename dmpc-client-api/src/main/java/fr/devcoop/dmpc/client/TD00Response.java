package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCCarteVitaleInfo;
import fr.devcoop.dmpc.client.model.DMPCNir;


public class TD00Response {

    private DMPCNir nirPatient;
    private DMPCCarteVitaleInfo infoPatient;

    public DMPCNir getNirPatient() {
        return nirPatient;
    }

    public void setNirPatient(DMPCNir nirPatient) {
        this.nirPatient = nirPatient;
    }

    public DMPCCarteVitaleInfo getInfoPatient() {
        return infoPatient;
    }

    public void setInfoPatient(DMPCCarteVitaleInfo infoPatient) {
        this.infoPatient = infoPatient;
    }
}
