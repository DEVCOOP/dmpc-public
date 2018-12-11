package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.Size;

/**
 * Numero d'immatriculation au répertoire des personnes physiques.
 *
 */
public class DMPCNir {

    @Size(min = 13, max = 13)
    private String numero;
    @Size(min = 2, max = 2)
    private String cle;

    public DMPCNir(String quinzeDigits) {
        this.numero = quinzeDigits.substring(0, 13);
        this.cle = quinzeDigits.substring(13, 15);
    }

    public DMPCNir(String numero, String cle) {
        this.numero = numero;
        this.cle = cle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    @Override
    public String toString() {
        return numero + cle ;
    }

    
}
