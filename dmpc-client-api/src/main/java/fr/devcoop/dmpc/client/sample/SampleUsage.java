package fr.devcoop.dmpc.client.sample;

import fr.devcoop.dmpc.client.DMPCContext;
import fr.devcoop.dmpc.client.DMPCProxy;
import fr.devcoop.dmpc.client.DMPCProxyException;
import fr.devcoop.dmpc.client.TD02Request;
import fr.devcoop.dmpc.client.TD21Request;
import fr.devcoop.dmpc.client.TD21Response;
import fr.devcoop.dmpc.client.model.DMPCAuthor;
import fr.devcoop.dmpc.client.model.DMPCCode;
import fr.devcoop.dmpc.client.model.DMPCDocument;
import fr.devcoop.dmpc.client.model.DMPCPatient;
import fr.devcoop.dmpc.client.model.DMPCSubmission;

/**
 *
 * @author lforet
 */
public class SampleUsage {

    public static void main(String... args) throws DMPCProxyException {
        // Initialisation du point d'entrée exécutant l'ensemble des transactions vers le DMP
        DMPCProxy proxy = null; //(DMPCProxy) springContext.getBean("dmpcProxy");

        // Initialisation d'un PS auteur des différentes transactions
        DMPCAuthor ps1 = new DMPCAuthor("1234", "Dupont", "Pierre");
        ps1.setRole("Médecin");
        ps1.setStructureNom("Clinique du beau Soleil");
        DMPCContext context = new DMPCContext(ps1);
        
        // Test d'existence (recherche) d'un patient
        DMPCPatient patient = proxy.td02Exist(context, new TD02Request("0404312364978044945679")).getPatient();

        // Initialisation d'un document à soumettre au DMP
        DMPCDocument document = new DMPCDocument();
        document.setTitle("Titre du document concernant l'hépatite virale");
        document.setContent("Contenu textuel".getBytes());
        document.addEvent(new DMPCCode("B18", "2.16.840.1.113883.6.3", "Hépatite virale chronique"));
        document.setFormat(proxy.getCodesFor(DMPCCode.ASIPJeuxValeurs.FORMAT_CODE).get(1).getCode());
        // …

        // Création de l'enveloppe de soumission 
        DMPCSubmission submission = new DMPCSubmission();
        submission.addDocument(document);
        submission.setPatient(patient);
        
        // Envoi vers le DMP de la soumission.
        TD21Response td21Response = proxy.td21SubmitDocuments(context, new TD21Request(submission));
        System.out.println("Soumission enregistré avec l'uuid :" + td21Response.getSubmission().getUuid());

    }

}