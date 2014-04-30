package fr.devcoop.dmpc.client.model;

/**
 *
 * @author lfo
 */
public class DMPCAdresse {

    private String ligneAdresse;
    private String codePostal;
    private String ville;
    private String pays;

    public DMPCAdresse() {
    }

    public DMPCAdresse(String ligneAdresse, String codePostal, String ville, String pays) {
        this.ligneAdresse = ligneAdresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public String getLigneAdresse() {
        return ligneAdresse;
    }

    public void setLigneAdresse(String ligneAdresse) {
        this.ligneAdresse = ligneAdresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
