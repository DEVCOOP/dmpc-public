package fr.devcoop.dmpc.client.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author lforet
 */
public class DMPCDocument {

    private List<DMPCPersonnelSante> auteurs = new ArrayList<>();
    @NotNull
    private String classCode;
    private String comments;
    @NotNull
    @NotEmpty
    private List<String> confidentialities = new ArrayList<>();
    @NotNull
    private byte[] content;
    @NotNull
    private String creationTime;
    @NotNull
    private String entryUuid;
    private List<DMPCCode> events = new ArrayList<>();
    @NotNull
    private String format;
//    @NotNull
//    private String healthcareFacilityType;
    private DMPCPersonnelSante legalAuthenticator;
    private String mimeType;
    private DMPCPatient patient;
    @NotNull
    private String practiceSetting;
    private String serviceStartTime;
    private String serviceStopTime;
    private String title;
    @NotNull
    private String type;
    @NotNull
    private String uniqueId;
    private String replacementOf;
    private String replacementOfUniqueId;

    /**
     * Liste des auteurs du document. Si non précisé lors d'une soumission, 
     * l'auteur de la soumission devient l'auteur du document.
     * 
     * @return auteur 
     */
    public List<DMPCPersonnelSante> getAuteurs() {
        return auteurs;
    }

    /**
     * Code du contentType
     * @see DMPCCode.ASIPJeuxValeurs#CLASS_CODE
     */
    @NotNull
    public String getClassCode() {
        return classCode;
    }

    /**
     * Commentaires
     */
    public String getComments() {
        return comments;
    }

    /**
     * Liste de code de confidentialité parmi 
     * @see DMPCCode.ASIPJeuxValeurs#CONFIDENTIALITY_CODE
     */
    @NotNull
    @NotEmpty
    public List<String> getConfidentialities() {
        return confidentialities;
    }

    /**
     * Le contenu binaire du document 
     */
    @NotNull
    public byte[] getContent() {
        return content;
    }

    /**
     * Date de création du document en temps universel au format yyyyMMddHHmmss. 
     * Si non renseigné à la soumission la date de création sera générée à la volée.
     * 
     * Attention : forte contrainte de synchronisation NTP et ordonnancement des 
     * dates entre la création d'un document d'une soumission d'une signature et 
     * du jeton VIHF.
     */
    @NotNull
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Générée à la volée par le proxy
     */
    @NotNull
    public String getEntryUuid() {
        return entryUuid;
    }

    /**
     * [CI-STRU-ENTETE] §3.3.6.1.1
     * 
     * Liste de code de event permettant de codifier l'acte :
     * Pour acte médical, y compris imagerie et anatomopathologie utiliser : CCAM 1.2.250.1.213.2.5
     * Pour diagnostic de pathologie utiliser : CIM10 2.16.840.1.113883.6.3
     * Pour résultat de consultation utiliser : DRC 1.2.250.1.213.2.9
     * Pur analyses de biologie chapitres (disciplines) de biologie, coder en : LOINC 2.16.840.1.113883.6.1
     */
    public List<DMPCCode> getEvents() {
        return events;
    }

    /**
     * Code format
     * @see DMPCCode.ASIPJeuxValeurs#FORMAT_CODE
     */
    @NotNull
    public String getFormat() {
        return format;
    }

    /**
     * code HealthcareFacilityType
     * @see DMPCCode.ASIPJeuxValeurs#HEALTH_CARE_FACILITY_TYPE_CODE
     */
//    @NotNull
//    public String getHealthcareFacilityType() {
//        return healthcareFacilityType;
//    }
    /**
     * TODO : à préciser dans le cadre du DMP en authentification indirect !
     */
    public DMPCPersonnelSante getLegalAuthenticator() {
        return legalAuthenticator;
    }

    /**
     * Doit être calculé en focntion du format code lors de la soumission.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Patient du document. Si non précisé lors d'une soumission, 
     * le patient de la soumission devient le patient du document.
     * 
     * Si précisé vérification que le patient est le même que dans soumission.
     * 
     * @return patient
     */
    public DMPCPatient getPatient() {
        return patient;
    }

    /**
     * code practiceSetting
     * @see DMPCCode.ASIPJeuxValeurs#PRACTICE_SETTING_CODE
     */
    @NotNull
    public String getPracticeSetting() {
        return practiceSetting;
    }

    /**
     * Date de début de l'acte en UTC (universal coordinated time) au format yyyyMMddHHmmss
     */
    public String getServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * Date de fin de l'acte en UTC (universal coordinated time) au format yyyyMMddHHmmss
     */
    public String getServiceStopTime() {
        return serviceStopTime;
    }

    public String getTitle() {
        return title;
    }

    /**
     * code type 
     * @see DMPCCode.ASIPJeuxValeurs#TYPE_CODE
     */
    @NotNull
    public String getType() {
        return type;
    }

    /**
     * Identifiant unique dans la source.
     */
    @NotNull
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * UUID du document à remplacer. 
     * @return 
     */
    public String getReplacementOf() {
        return replacementOf;
    }

    public String getReplacementOfUniqueId() {
        return replacementOfUniqueId;
    }
    

    public void addAuteur(DMPCPersonnelSante auteur) {
        this.auteurs.add(auteur);
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void addConfidentiality(String confidentiality) {
        this.confidentialities.add(confidentiality);
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setEntryUuid(String entryUuid) {
        this.entryUuid = entryUuid;
    }

    public void addEvent(DMPCCode event) {
        this.events.add(event);
    }

    public void setFormat(String format) {
        this.format = format;
    }

//    public void setHealthcareFacilityType(String healthcareFacilityType) {
//        this.healthcareFacilityType = healthcareFacilityType;
//    }
    public void setLegalAuthenticator(DMPCPersonnelSante legalAuthenticator) {
        this.legalAuthenticator = legalAuthenticator;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setPatient(DMPCPatient patient) {
        this.patient = patient;
    }

    public void setPracticeSetting(String practiceSetting) {
        this.practiceSetting = practiceSetting;
    }

    public void setServiceStartTime(String serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public void setServiceStopTime(String serviceStopTime) {
        this.serviceStopTime = serviceStopTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setAuteurs(List<DMPCPersonnelSante> auteurs) {
        this.auteurs = auteurs;
    }

    public void setConfidentialities(List<String> confidentialities) {
        this.confidentialities = confidentialities;
    }

    public void setEvents(List<DMPCCode> events) {
        this.events = events;
    }

    public void setReplacementOf(String replacementOf) {
        this.replacementOf = replacementOf;
    }

    public void setReplacementOfUniqueId(String replacementOfUniqueId) {
        this.replacementOfUniqueId = replacementOfUniqueId;
    }

    @Override
    public String toString() {
        return "DMPCDocument{" + "auteurs=" + auteurs + ", classCode=" + classCode + ", comments=" + comments + ", confidentialities=" + confidentialities + ", content=" + content + ", creationTime=" + creationTime + ", entryUuid=" + entryUuid + ", events=" + events + ", format=" + format + ", legalAuthenticator=" + legalAuthenticator + ", mimeType=" + mimeType + ", patient=" + patient + ", practiceSetting=" + practiceSetting + ", serviceStartTime=" + serviceStartTime + ", serviceStopTime=" + serviceStopTime + ", title=" + title + ", type=" + type + ", uniqueId=" + uniqueId + ", replacementOf=" + replacementOf + ", replacementOfUniqueId=" + replacementOfUniqueId + '}';
    }
   
}
