package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCNir;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD0.0
 *
 * @author lforet
 */
public class TD00Request {

    private DMPCNir nirOuvrantDroit;
    private String dateNaissancePatient;
    private int rangNaissancePatient;
    private DMPCNir nirPatient;

    public DMPCNir getNirOuvrantDroit() {
        return nirOuvrantDroit;
    }

    public void setNirOuvrantDroit(DMPCNir nirOuvrantDroit) {
        this.nirOuvrantDroit = nirOuvrantDroit;
    }

    public String getDateNaissancePatient() {
        return dateNaissancePatient;
    }

    public void setDateNaissancePatient(String dateNaissancePatient) {
        this.dateNaissancePatient = dateNaissancePatient;
    }

    public int getRangNaissancePatient() {
        return rangNaissancePatient;
    }

    public void setRangNaissancePatient(int rangNaissancePatient) {
        this.rangNaissancePatient = rangNaissancePatient;
    }

    public DMPCNir getNirPatient() {
        return nirPatient;
    }

    public void setNirPatient(DMPCNir nirPatient) {
        this.nirPatient = nirPatient;
    }

}
