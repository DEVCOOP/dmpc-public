package fr.devcoop.dmpc.client.model.biologie;

import fr.devcoop.dmpc.client.model.DMPCCode;
import fr.devcoop.dmpc.client.model.DMPCPersonnelSante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfo
 */
public class StructuredBody {
    private List<ChapterSection> chapterSections;

    public List<ChapterSection> getChapterSections() {
        if (chapterSections == null) {
            chapterSections = new ArrayList<>();
        }
        return chapterSections;
    }

    public void setChapterSections(List<ChapterSection> chapterSections) {
        this.chapterSections = chapterSections;
    }

    public static class ChapterSection {

        private String loincCode;
        private List<Section> sections;

        public String getLoincCode() {
            return loincCode;
        }

        public void setLoincCode(String loincCode) {
            this.loincCode = loincCode;
        }

        public List<Section> getSections() {
            if (sections == null) {
                sections = new ArrayList<>();
            }
            return sections;
        }

        public void setSections(List<Section> sections) {
            this.sections = sections;
        }
    }

    public static class Section {

        private DMPCCode code;
        private DMPCPersonnelSante authenticator;
        private String authenticatorInterpretation;
        private String time;
        private DMPCPersonnelSante preleveur;
        private List<Observation> observations;

        public DMPCCode getCode() {
            return code;
        }

        public void setCode(DMPCCode code) {
            this.code = code;
        }

        public DMPCPersonnelSante getAuthenticator() {
            return authenticator;
        }

        public void setAuthenticator(DMPCPersonnelSante authenticator) {
            this.authenticator = authenticator;
        }

        public DMPCPersonnelSante getPreleveur() {
            return preleveur;
        }

        public void setPreleveur(DMPCPersonnelSante preleveur) {
            this.preleveur = preleveur;
        }

        
        public String getAuthenticatorInterpretation() {
            return authenticatorInterpretation;
        }

        public void setAuthenticatorInterpretation(String authenticatorInterpretation) {
            this.authenticatorInterpretation = authenticatorInterpretation;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<Observation> getObservations() {
            if (observations == null) {
                observations = new ArrayList<>();
            }
            return observations;
        }

        public void setObservations(List<Observation> observations) {
            this.observations = observations;
        }
    }

    public static class Observation {

        private DMPCCode code;
        private String status;
        private String time;
        private Value value;
        private DMPCCode interpretation;
        private DMPCCode method;
        private RangeValue referenceRange;

        public DMPCCode getCode() {
            return code;
        }

        public void setCode(DMPCCode code) {
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }

        public DMPCCode getInterpretation() {
            return interpretation;
        }

        public void setInterpretation(DMPCCode interpretation) {
            this.interpretation = interpretation;
        }

        public DMPCCode getMethod() {
            return method;
        }

        public void setMethod(DMPCCode method) {
            this.method = method;
        }

        public RangeValue getReferenceRange() {
            return referenceRange;
        }

        public void setReferenceRange(RangeValue referenceRange) {
            this.referenceRange = referenceRange;
        }
    }

    public static class Value {

        private String unit;
        private String value;

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class RangeValue {

        private String low;
        private String high;
        private String unit;

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
        
    }

}
