package fr.devcoop.dmpc.client.model;

/**
 * Role du PS (Personnel de Santé) ou de l'ES (Etablissement de Santé) authentifié
 * dans le DMP pour un patient donné.
 * 
 * @author lforet
 */
public enum DMPCRole {
    /**
     * Role par défaut
     */
    STANDARD, 
    /**
     * Si le PS est le médecin traitant, il peut se donner ce rôle dans le DMP. 
     */
    MEDECIN_TRAITANT;
    
}
