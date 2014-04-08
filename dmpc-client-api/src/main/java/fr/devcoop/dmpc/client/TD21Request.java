package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCSubmission;
import javax.validation.constraints.NotNull;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD3.1
 * 

 * @author lforet
 */
public class TD21Request {

    @NotNull
    private DMPCSubmission submission;

    public TD21Request() {
    }

    public TD21Request(DMPCSubmission submission) {
        this.submission = submission;
    }

    public DMPCSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(DMPCSubmission submission) {
        this.submission = submission;
    }

    public String toString() {
        return "TD21Request{" + "submission=" + submission + '}';
    }
    
}
