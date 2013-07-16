package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCSubmission;
import javax.validation.constraints.NotNull;

/**
 *
 * @author lforet
 */
public class TD21Response {

    /**
     * submission complété par le proxy.
     */
    @NotNull
    private DMPCSubmission submission;

    public DMPCSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(DMPCSubmission submission) {
        this.submission = submission;
    }

    public String toString() {
        return "TD21Response{" + "submission=" + submission + '}';
    }    
}
