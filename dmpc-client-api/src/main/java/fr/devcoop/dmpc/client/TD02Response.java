package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCPatient;
import fr.devcoop.dmpc.client.model.DMPCRole;

/**
 *
 * @author lforet
 */
public class TD02Response {

    public enum Status {
        ACTIF, FERME, INEXISTANT;
    }

    public enum Autorisation {
        NON_EXISTENT,
        INTERDIT,
        EXPIRE,
        VALIDE,
    }

    private DMPCPatient patient;
    private DMPCRole role;
    private Status status;
    private Autorisation autorisation;
    private String raison;
    private Boolean compteInternetOuvert;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public Boolean getCompteInternetOuvert() {
        return compteInternetOuvert;
    }

    public void setCompteInternetOuvert(Boolean compteInternetOuvert) {
        this.compteInternetOuvert = compteInternetOuvert;
    }

    public Autorisation getAutorisation() {
        return autorisation;
    }

    public void setAutorisation(Autorisation autorisation) {
        this.autorisation = autorisation;
    }

    @Override
    public String toString() {
        return "TD02Response{" + "patient=" + patient + ", role=" + role + ", status=" + status + ", autorisation=" + autorisation + ", raison=" + raison + ", compteInternetOuvert=" + compteInternetOuvert + '}';
    }

}
