package fr.devcoop.dmpc.client;

/**
 * 
 * 
 */
public class TD15bRequest {
    
    private String ins;
    private String email;
    private String telephone;

    public String getIns() {
        return ins;
    }

    public void setIns(String patientId) {
        this.ins = patientId;
    }

    @Deprecated
    public String getInsc() {
        return ins;
    }

    @Deprecated
    public void setInsc(String insc) {
        this.ins = insc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    

}
