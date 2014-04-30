package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCCarteVitaleInfo;
import fr.devcoop.dmpc.client.model.DMPCPatient;

/**
 *
 * @author lfo
 */
public class TD11Request {

    private DMPCPatient patient;
    private DMPCCarteVitaleInfo carteVitaleInfo;
    private boolean consentementOuverture;
    private boolean oppositionBrisDeGlace;
    private boolean oppositionUrgence;

    public DMPCPatient getPatient() {
        return patient;
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }

    public DMPCCarteVitaleInfo getCarteVitaleInfo() {
        return carteVitaleInfo;
    }

    public void setCarteVitaleInfo(DMPCCarteVitaleInfo carteVitaleInfo) {
        this.carteVitaleInfo = carteVitaleInfo;
    }

    public boolean isConsentementOuverture() {
        return consentementOuverture;
    }

    public void setConsentementOuverture(boolean consentementOuverture) {
        this.consentementOuverture = consentementOuverture;
    }

    public boolean isOppositionBrisDeGlace() {
        return oppositionBrisDeGlace;
    }

    public void setOppositionBrisDeGlace(boolean oppositionBrisDeGlace) {
        this.oppositionBrisDeGlace = oppositionBrisDeGlace;
    }

    public boolean isOppositionUrgence() {
        return oppositionUrgence;
    }

    public void setOppositionUrgence(boolean oppositionUrgence) {
        this.oppositionUrgence = oppositionUrgence;
    }

}
