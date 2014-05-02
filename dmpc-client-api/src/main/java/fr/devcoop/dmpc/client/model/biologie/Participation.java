package fr.devcoop.dmpc.client.model.biologie;

import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;

/**
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
