package fr.devcoop.dmpc.client.model.biologie;

import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;

/**
 * Une participation permet de définir l'action d'un utilisateur danns une période donnée.
 * 
 * Pour une participation d'un Personnel de Santé, il est possible de définir 
 *   <li>un instant : en renseignant le stopTime uniquement,
 *   <li>une période : en reseignant le startTime ainsi que le stopTime.
 * 
 * @author lfo
 */
public class Participation {
    private String startTime;
    private String stopTime;
    private DMPCPersonnelSante personnelSante;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public DMPCPersonnelSante getPersonnelSante() {
        return personnelSante;
    }

    public void setPersonnelSante(DMPCPersonnelSante personnelSante) {
        this.personnelSante = personnelSante;
    }

}
