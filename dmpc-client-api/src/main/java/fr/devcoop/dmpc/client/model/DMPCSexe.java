package fr.devcoop.dmpc.client.model;

/**
 * Sexe du patient.
 * 
 * 
 * @author lfo
 */
public enum DMPCSexe {
    
    /** Masculin */
    M , 
    /** Féminin */
    F, 
    /** Inconnu */
    U;
    
    public static DMPCSexe fromCode(String code) {
        try {
            return DMPCSexe.valueOf(code);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
