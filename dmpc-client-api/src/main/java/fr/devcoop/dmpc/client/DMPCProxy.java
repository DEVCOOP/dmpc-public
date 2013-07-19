package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCCode;
import java.util.List;
import javax.jws.WebService;

/**
 * Point d'entrée d'un client vers le proxy DMP. Toute requête sur ce proxy sera 
 * interprétée et transmise au DMP par la mise en place des différentes exigences 
 * du [DMP1-DSFT] notamment la TD0.1 §6.2.
 * 
 * <p>Le proxy a donc pour but de rendre transparent la mise en place de tous les mécanismes 
 * complexes induits par la sécurisation des accès et le respect des standards exigés 
 * par le Cadre d'Intéropérabilité [CI-SIS].
 * 
 * @author lforet
 */
public interface DMPCProxy {

    /**
     * Transaction décrite dans [DMP1-DSFT] §6.4 : Test l'existence du patient dans le DMP, 
     * 
     * @param   context requis pour accéder à la fonction
     * @param   request insc doit être renseigné
     * @return  le patient retrouvé dans le DMP permet de mettre en place l'identitoVigilance décrite dans [DMP1-DSFT] §7.1.1.3 
     *          le role de l'auteur (l'établissement de Santé) si autorisé nul sinon (cf td03)
     * @throws DMPCProxyException
     */
    public TD02Response td02Exist(DMPCContext context, TD02Request request) throws DMPCProxyException;

    /**
     * Transaction décrite dans [DMP1-DSFT] §6.5 : Demande d'ajout d'autorisation d'accès
     * 
     * @param context requis pour accéder à la fonction
     * @param request le role doit être renseigné
     * @return une réponse vide 
     * @throws DMPCProxyException si problème technique ou fonctionnel.
     */
    public TD03Response td03AddAuthorization(DMPCContext context, TD03Request request) throws DMPCProxyException;

    /**
     * Transaction décrite dans [DMP1-DSFT] §6.5 : Demande de suppression d'autorisation d'accès
     * 
     * @param context requis pour accéder à la fonction
     * @param request le role doit être renseigné
     * @return une réponse vide 
     * @throws DMPCProxyException si problème technique ou fonctionnel.
     */
    public TD03Response td03RemoveAuthorization(DMPCContext context, TD03Request request) throws DMPCProxyException;

    /**
     * Transaction décrite dans [DMP1-DSFT] §9.2 : Soumission de documents
     * 
     * Prérequis avoir obtenu l'autorisation d'accès
     * 
     * @param context requis pour accéder à la fonction
     * @param request contient une soumission qui contient des documents pour un même patient.
     * @return la soumission complété par des informations gérés par le proxy.
     * @throws DMPCProxyException si problème technique ou fonctionnel.
     */public TD21Response td21SubmitDocuments(DMPCContext context, TD21Request request) throws DMPCProxyException;

    /**
     * Transaction décrite dans [DMP1-DSFT] §9.4.4 : Dépublication de documents
     * 
     * Prérequis avoir obtenu l'autorisation d'accès
      * 
     * @param context requis pour accéder à la fonction
     * @param request contient l'uuid du document à dépublier
     * @return vide 
     * @throws DMPCProxyException si problème technique ou fonctionnel.
     */
     public TD33CResponse td33cUnpublished(DMPCContext context, TD33CRequest request) throws DMPCProxyException;
    
    /**
     * Service permmettant de récupérer les différents codes possible pour l'ensemble 
     * des jeux de valeurs (nomenclatures) utilisés dans le cadre du DMP.
     * 
     * @see fr.devcoop.dmpc.proxy.model.DMPCCode.ASIPJeuxValeurs
     * @param jeuxValeurs
     * @return la liste des codes correspondant au jeux de valeurs souhaités
     * @throws DMPCProxyException 
     */
    public List<DMPCCode> getCodesFor(DMPCCode.ASIPJeuxValeurs jeuxValeurs) throws DMPCProxyException;
}
