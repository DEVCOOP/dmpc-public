package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.AvailabilityStatus;
import fr.devcoop.dmpc.client.model.DMPCDocument;
import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;
import java.util.List;
import javax.validation.constraints.NotNull;

public abstract class TD31Request {

    public enum Query {
        FindDocuments,
        FindSubmissionSets,;
    }

    @NotNull
    private String ins;

    public abstract Query getQuery();

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }

    public static class FindDocuments extends TD31Request {

        private String classCode;
        private String typeCode;
        private String practiceSettingCode;
        private String creationTimeFrom;

        private String creationTimeTo;
        private String serviceStartTimeFrom, serviceStartTimeTo;
        private String serviceStopTimeFrom, serviceStopTimeTo;
        private String healthcareFacilityTypeCode;
        private List<String> eventCodeList;
        private List<String> confidentialityCode;
        private DMPCPersonnelSante auteur;
        private String formatCode;
        @NotNull 
        private List<AvailabilityStatus> statuses;
        private String type;

        @Override
        public Query getQuery() {
            return Query.FindDocuments;
        }

        public String getClassCode() {
            return classCode;
        }

        public void setClassCode(String classCode) {
            this.classCode = classCode;
        }

        public String getTypeCode() {
            return typeCode;
        }

        public void setTypeCode(String typeCode) {
            this.typeCode = typeCode;
        }

        public String getPracticeSettingCode() {
            return practiceSettingCode;
        }

        public void setPracticeSettingCode(String practiceSettingCode) {
            this.practiceSettingCode = practiceSettingCode;
        }

        public String getCreationTimeFrom() {
            return creationTimeFrom;
        }

        public void setCreationTimeFrom(String creationTimeFrom) {
            this.creationTimeFrom = creationTimeFrom;
        }

        public String getCreationTimeTo() {
            return creationTimeTo;
        }

        public void setCreationTimeTo(String creationTimeTo) {
            this.creationTimeTo = creationTimeTo;
        }

        public String getServiceStartTimeFrom() {
            return serviceStartTimeFrom;
        }

        public void setServiceStartTimeFrom(String serviceStartTimeFrom) {
            this.serviceStartTimeFrom = serviceStartTimeFrom;
        }

        public String getServiceStartTimeTo() {
            return serviceStartTimeTo;
        }

        public void setServiceStartTimeTo(String serviceStartTimeTo) {
            this.serviceStartTimeTo = serviceStartTimeTo;
        }

        public String getServiceStopTimeFrom() {
            return serviceStopTimeFrom;
        }

        public void setServiceStopTimeFrom(String serviceStopTimeFrom) {
            this.serviceStopTimeFrom = serviceStopTimeFrom;
        }

        public String getServiceStopTimeTo() {
            return serviceStopTimeTo;
        }

        public void setServiceStopTimeTo(String serviceStopTimeTo) {
            this.serviceStopTimeTo = serviceStopTimeTo;
        }

        public String getHealthcareFacilityTypeCode() {
            return healthcareFacilityTypeCode;
        }

        public void setHealthcareFacilityTypeCode(String healthcareFacilityTypeCode) {
            this.healthcareFacilityTypeCode = healthcareFacilityTypeCode;
        }

        public List<String> getEventCodeList() {
            return eventCodeList;
        }

        public void setEventCodeList(List<String> eventCodeList) {
            this.eventCodeList = eventCodeList;
        }

        public List<String> getConfidentialityCode() {
            return confidentialityCode;
        }

        public void setConfidentialityCode(List<String> confidentialityCode) {
            this.confidentialityCode = confidentialityCode;
        }

        public DMPCPersonnelSante getAuteur() {
            return auteur;
        }

        public void setAuteur(DMPCPersonnelSante auteur) {
            this.auteur = auteur;
        }

        public String getFormatCode() {
            return formatCode;
        }

        public void setFormatCode(String formatCode) {
            this.formatCode = formatCode;
        }

        public List<AvailabilityStatus> getStatuses() {
            return statuses;
        }

        public void setStatuses(List<AvailabilityStatus> status) {
            this.statuses = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }

    public static class FindSubmissionSets extends TD31Request {
        
        private String sourceId; 
        private String submissionTimeFrom, submissionTimeTo;
        private DMPCPersonnelSante auteur;
        private String contentType;
        private List<AvailabilityStatus> statuses;

        @Override
        public Query getQuery() {
            return Query.FindSubmissionSets;
        }

        public String getSourceId() {
            return sourceId;
        }

        public void setSourceId(String sourceId) {
            this.sourceId = sourceId;
        }

        public String getSubmissionTimeFrom() {
            return submissionTimeFrom;
        }

        public void setSubmissionTimeFrom(String submissionTimeFrom) {
            this.submissionTimeFrom = submissionTimeFrom;
        }

        public String getSubmissionTimeTo() {
            return submissionTimeTo;
        }

        public void setSubmissionTimeTo(String submissionTimeTo) {
            this.submissionTimeTo = submissionTimeTo;
        }

        public DMPCPersonnelSante getAuteur() {
            return auteur;
        }

        public void setAuteur(DMPCPersonnelSante auteur) {
            this.auteur = auteur;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public List<AvailabilityStatus> getStatuses() {
            return statuses;
        }

        public void setStatuses(List<AvailabilityStatus> statuses) {
            this.statuses = statuses;
        }
        
    }
}
