package fr.devcoop.dmpc.client;

/**
 *
 * @author lfo
 */
public class TD15aResponse {

    private String identifiant;
    private String password;
    private byte[] formulairePatient;

    public TD15aResponse() {
    }

    public TD15aResponse(String identifiant, String password, byte[] formulairePatient) {
        this.identifiant = identifiant;
        this.password = password;
        this.formulairePatient = formulairePatient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getFormulairePatient() {
        return formulairePatient;
    }

    public void setFormulairePatient(byte[] formulairePatient) {
        this.formulairePatient = formulairePatient;
    }
}
