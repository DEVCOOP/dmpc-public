package fr.devcoop.dmpc.client.model;

import javax.validation.constraints.NotNull;

/**
 * L'ensemble des jeux de valeur gérés dans le DMP sont des liste de DMPCCode où 
 * chaque DMPCCode est identifié par un code et la nomenclature référente (codingScheme) 
 * avec pour libellé le displayName.
 * 
 * @author lforet
 */
public class DMPCCode {

    /**
     * Les Différents Jeux de valeurs rendus disponible par l'asip sont accessible 
     * ici : http://esante.gouv.fr/sites/default/files/CI-SIS_Jeux_de_valeurs_20101116.zip
     */
    public enum ASIPJeuxValeurs {

        AUTHOR_SPECIALITY,
        CLASS_CODE,
        CONFIDENTIALITY_CODE,
        CONTENT_TYPE_CODE,
        FORMAT_CODE,
        HEALTH_CARE_FACILITY_TYPE_CODE,
        PRACTICE_SETTING_CODE,
        SUBJECT_ROLE,
        TYPE_CODE
    }
    @NotNull
    private String code;
    private String codingScheme;
    private String displayName;

    public DMPCCode() {
    }

    public DMPCCode(String code, String codingScheme, String displayName) {
        this.code = code;
        this.codingScheme = codingScheme;
        this.displayName = displayName;
    }

    /**
     * code dans la nomenclature
     */
    public String getCode() {
        return code;
    }

    /**
     * code de la nomenclature de référence 
     */
    public String getCodingScheme() {
        return codingScheme;
    }

    /**
     * Libellé du code.
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCodingScheme(String codingScheme) {
        this.codingScheme = codingScheme;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String toString() {
        return "DMPCCode{" + "code=" + code + ", codingScheme=" + codingScheme + ", displayName=" + displayName + '}';
    }
    
}
