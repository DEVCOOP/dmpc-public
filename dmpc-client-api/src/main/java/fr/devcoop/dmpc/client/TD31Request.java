package fr.devcoop.dmpc.client;

public abstract class TD31Request {

    public enum Query {
        FindDocuments,
        FindSubmissionSets,;
    }
    
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

//                $XDSDocumentEntryCreationTimeFrom, $XDSDocumentEntryCreationTimeTo,
//        $XDSDocumentEntryServiceStartTimeFrom, $XDSDocumentEntryServiceStartTimeTo, $XDSDocumentEntryServiceStopTimeFrom, $XDSDocumentEntryServiceStopTimeTo, $XDSDocumentEntryHealthcareFacilityTypeCode,
//        $XDSDocumentEntryEventCodeList, $XDSDocumentEntryConfidentialityCode, $XDSDocumentEntryAuthorPerson, $XDSDocumentEntryFormatCode, $XDSDocumentEntryStatus, $XDSDocumentEntryType
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

    }

}
