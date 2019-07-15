package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCCode;
import fr.devcoop.dmpc.client.model.DMPCParametres;
import java.util.List;

/**
 * Point d'entrée d'un client vers le proxy DMP. Toute requête sur ce proxy sera
 * interprétée et transmise au DMP par la mise en place des différentes
 * exigences du [DMP] notamment la TD0.1 .
 *
 * <p>
 * Le proxy a donc pour but de rendre transparent la mise en place de tous les
 * mécanismes complexes induits par la sécurisation des accès et le respect des
 * standards exigés par le Cadre d'Intéropérabilité [CI-SIS].
 *
 */
public interface DMPCClient {

    /**
     * Cette fonctionnalité permet au LPS d’acquérir l’identité du patient et de déclencher les mécanismes d’identito-vigilance.
     * Avant le premier accès au DMP d’un patient via les interfaces LPS v2 du système DMP, le LPS :
     * <li>acquiert l’INS et les traits d’identité du patient (cf. RG_0110) via la transaction TD0.0,
     * <li>déclenche les mécanismes d’identito-vigilance en utilisant les données d’identification du patient fournies par la transaction TD0.0 (cf. RG_0130).
     * <li>détermine le statut de l’INS du patient (cf. RG_0140).
     * <li>Pour les accès suivants, le LPS acquiert l’INS du patient stocké en base locale.
     * 
     * L'appel à TD0.0 est possible dans d'autres cas. Cf. EX_GEN-1510 dans ce chapitre.
     * 
     * @param context
     * @param request Contient li
     * @return TD00Response
     * @throws DMPCClientException 
     */
    public TD00Response td00Identity(DMPCContext context, TD00Request request) throws DMPCClientException;
    
    /**
     * Cette fonctionnalité permet, via la transaction TD0.2, de déterminer si le DMP du patient existe et de récupérer les données suivantes (cf. RG_0310) :
     *  <li>statut du DMP du patient (EF_DMP12_01),
     *  <li>si le DMP du patient est fermé, date, motif et raison de la fermeture (cf. EF_DMP12),
     *  <li>statut de l’autorisation d’accès de l’acteur de santé (EF_DMP04_01),
     *  <li> statut « médecin traitant DMP » (EF_DMP01_07).
     *
     * @param context requis pour accéder à la fonction
     * @param request l'INS (Identifiant National de Santé) doit être renseigné
     * @return le patient retrouvé dans le DMP permet de mettre en place
     * l'identitoVigilance décrite dans [DMP1-DSFT] §7.1.1.3 le role de l'auteur
     * (l'établissement de Santé) si autorisé nul sinon (cf td03)
     * @throws DMPCClientException si problème technique ou fonctionnel
     */
    public TD02Response td02Exist(DMPCContext context, TD02Request request) throws DMPCClientException;

    /**
     *  Demande d'ajout d'autorisation d'accès
     *
     * @param context requis pour accéder à la fonction
     * @param request le role doit être renseigné
     * @return une réponse vide
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD03Response td03AddAuthorization(DMPCContext context, TD03Request request) throws DMPCClientException;

    /**
     * Demande de suppression d'autorisation d'accès
     *
     * @param context requis pour accéder à la fonction
     * @param request le role doit être renseigné
     * @return une réponse vide
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD03Response td03RemoveAuthorization(DMPCContext context, TD03Request request) throws DMPCClientException;

    /**
     * Création d’un DMP
     *
     * @param context requis pour accéder à la fonction
     * @param request le patient à créer doit être renseigné
     * @return une réponse contenant le patient sauvegardé
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD11Response td11CreationDmp(DMPCContext context, TD11Request request) throws DMPCClientException;

    /**
     *  Accès Internet du Patient
     *
     * @param context requis pour accéder à la fonction
     * @param request contenant l'information patient et un canal OTP (One Time
     * Password)
     * @return les infos de connexions ainsi que le formulaire patient.
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD15aResponse td15aCreerAccesInternetPatient(DMPCContext context, TD15aRequest request) throws DMPCClientException;

    /**
     *  Ajout de canal Otp
     *
     * @param context requis pour accéder à la fonction
     * @param request contenant l'information patient et un canal OTP (One Time
     * Password)
     * @return une réponse vide
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD15bResponse td15bAddCanalOTP(DMPCContext context, TD15bRequest request) throws DMPCClientException;

    /**
     * Suppression de canal OTP
     *
     * @param context requis pour accéder à la fonction
     * @param request contenant l'information patient et un canal OTP (One Time
     * Password)
     * @return une réponse vide
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD15bResponse td15bRemoveCanalOTP(DMPCContext context, TD15bRequest request) throws DMPCClientException;

    /**
     * Déblocage du compte internet ou mise à jour des codes internet.
     *
     * @param context requis pour accéder à la fonction
     * @param request contenant l'information patient et un canal OTP (One Time
     * Password)
     * @return les infos de connexions ainsi que le formulaire patient.
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD15cResponse td15dDeblocageAccesInternetPatient(DMPCContext context, TD15cRequest request) throws DMPCClientException;

    /**
     * Soumission de documents
     *
     * Prérequis avoir obtenu l'autorisation d'accès
     *
     * @param context requis pour accéder à la fonction
     * @param request contient une soumission qui contient des documents pour un
     * même patient.
     * @return la soumission complété par des informations gérés par le proxy.
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD21Response td21SubmitDocuments(DMPCContext context, TD21Request request) throws DMPCClientException;

    /**
     * Dépublication de documents
     *
     * Prérequis avoir obtenu l'autorisation d'accès
     *
     * @param context requis pour accéder à la fonction
     * @param request contient l'uuid du document à dépublier
     * @return vide
     * @throws DMPCClientException si problème technique ou fonctionnel.
     */
    public TD33CResponse td33cUnpublished(DMPCContext context, TD33CRequest request) throws DMPCClientException;

    /**
     * Service permmettant de récupérer les différents codes possible pour
     * l'ensemble des jeux de valeurs (nomenclatures) utilisés dans le cadre du
     * DMP.
     *
     * @see DMPCCode.ASIPJeuxValeurs
     * @param jeuxValeurs type de jeux de valeur souhaité
     * @return la liste des codes correspondant au jeux de valeurs souhaités
     * @throws DMPCClientException si problème technique ou fonctionnel
     */
    public List<DMPCCode> getCodesFor(DMPCCode.ASIPJeuxValeurs jeuxValeurs) throws DMPCClientException;
    
    /**
     * Service permmettant de récupérer le paramètrage du DMP, afin de savoir si 
     * le LPS doit réaliser la fonctions-gestion-mineurs (EX_GEN-1550)
     *
     * @see DMPCCode.ASIPJeuxValeurs
     * @param jeuxValeurs type de jeux de valeur souhaité
     * @return la liste des codes correspondant au jeux de valeurs souhaités
     * @throws DMPCClientException si problème technique ou fonctionnel
     */
    public DMPCParametres getParametres() throws DMPCClientException;
    
    /**
     * Service permettant de récupérer la date au format 
     */
}
