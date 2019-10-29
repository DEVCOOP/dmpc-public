package fr.devcoop.dmpc.client.model.biologie;

import fr.devcoop.dmpc.client.model.DMPCCode;
import fr.devcoop.dmpc.client.model.DMPCStructureSante;


/**
 * Le contexte de prise en charge permet de décrire la prise en charge du patient par un laboratoire
 *  Il contient le biologiste responsable de la prise en charge
 *  la structure de sante où à eu lieu la prise en charge
 *  le type de prise en charge (ex : Ambulatoire)
 *
 * Le contexte de prise en charge est décrit dans le §3.2.1.16 du CI-SIS - Volet CR-BIO
 */
public class ContextePriseEnCharge extends Participation {
    
    private DMPCCode type;
    private DMPCStructureSante lieu;

    public DMPCCode getType() {
        return type;
    }

    public void setType(DMPCCode type) {
        this.type = type;
    }

    public DMPCStructureSante getLieu() {
        return lieu;
    }

    public void setLieu(DMPCStructureSante lieu) {
        this.lieu = lieu;
    }
    
}
