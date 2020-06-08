package fr.devcoop.dmpc.client.model;

/**
 * Permet de définir le mode d'accès au DMP, seul l'authentification direc avec
 * CPS peut passer en mode BRIS_DE_GLACE.
 *
 * @author lfo
 */
public class DMPCModeAcces {

    public enum ModeAcces {
        NORMAL, BRIS_DE_GLACE;
    }

    private ModeAcces acces;
    private String raison;

    /**
     * Mode d’accès demandé par l’utilisateur (normal, bris de glace ou centre de régulation).
     */
    public ModeAcces getAcces() {
        return acces;
    }

    public void setAcces(ModeAcces acces) {
        this.acces = acces;
    }

    /**
     * Explication de la raison de l’usage du bris de glace.
     */
    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

}
