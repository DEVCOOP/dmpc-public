package fr.devcoop.dmpc.client.model;
/**
 * Retourne les Paramètres du DMP utiles.
 * 
 * 
 * @author lfo
 */
public class DMPCParametres {

    private boolean fonctionsGestionMineurs;
    private boolean cumulInvisiblePatientMasquePs;
    private int ageMajorite;
    private boolean production;

    /**
     * EX_GEN_1550 : contient le  paramètre fonctions-gestions-mineurs. 
     * 
     * @return true si il doit être exgible.
     */
    public boolean isFonctionsGestionMineurs() {
        return fonctionsGestionMineurs;
    }

    public void setFonctionsGestionMineurs(boolean fonctionsGestionMineurs) {
        this.fonctionsGestionMineurs = fonctionsGestionMineurs;
    }

    public boolean isCumulInvisiblePatientMasquePs() {
        return cumulInvisiblePatientMasquePs;
    }

    public void setCumulInvisiblePatientMasquePs(boolean cumulInvisiblePatientMasquePs) {
        this.cumulInvisiblePatientMasquePs = cumulInvisiblePatientMasquePs;
    }

    /**
     * Un patient doit être considéré comme mineur si son âge (en années) est strictement inférieur à l’âge de la majorité défini dans le paramètre age-majorite
     * @return l'age de la majorité :
     */
    public int getAgeMajorite() {
        return ageMajorite;
    }

    public void setAgeMajorite(int ageMajorite) {
        this.ageMajorite = ageMajorite;
    }

    /**
     * Détermine si l'environnement cible est de production ou non
     * 
     * @return true si production
     */
    public boolean isProduction() {
        return production;
    }

    public void setProduction(boolean production) {
        this.production = production;
    }

    
    
}
