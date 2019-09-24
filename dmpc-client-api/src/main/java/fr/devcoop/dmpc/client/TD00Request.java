package fr.devcoop.dmpc.client;

import fr.devcoop.dmpc.client.model.DMPCNir;

/**
 * Ensemble des paramètres requis et optionnels pour la transaction TD0.0
 *
 * Lire EX_GEN-1250 en cas de profil « Création » : obligation de la TD0.0 dans ce profil
 * Lire EX_GEN-1255 pour les autres profils : obligation de la TD0.0 avant le premier accès au DMP d’un patient via les interfaces LPS v2 du système DMP.
 *
 * Autres Exigences à prendre en compte :
 *
 * <li> EX_GEN-1550 : concernant la fonctions-gestion-mineurs
 * <li> EX_GEN-1265 : concernant la non modification des traits lus de la carte vitale
 * <li> EX_GEN-1530 : où seuls les NIR provenant de la TD0.0 doivent servir d'INS
 * <li> EX_GEN-1290 et EX_GEN_1300 : où l'INS d'un patient doit être rattaché au dossier local avec une gestion des ancienst INS qui deviennent "obsolètes"
 * <li> EX_GEN_1510 : concernant la possibilité par l'utilisateur de rappeler cette transaction TD00, et où aucun appel batch n'est autorisé.
 * <li> EX_GEN_1230 : concernant les mécanismes d'identito-vigilance.
 * <li> EX_GEN_1220 : concernant le statut de l'ins du patient : si il a été obtenu en lisant la CarteVitale ou pas.
 * <li> EX_GEN_1520 : concernant l'OID de des NIR
 *
 */
public class TD00Request {

    private DMPCNir nirOuvrantDroit;
    private String dateNaissance;
    private int rangNaissance = 1;
    private DMPCNir nirIndividu;

    /**
     * @return nir Ouvrant Droit (SSV : 101.08 + 101.09) (API vitale : ident.nir)
     */
    public DMPCNir getNirOuvrantDroit() {
        return nirOuvrantDroit;
    }

    public void setNirOuvrantDroit(DMPCNir nirOuvrantDroit) {
        this.nirOuvrantDroit = nirOuvrantDroit;
    }

    /**
     * Date de naissance du patient au format AAAA-MM-JJ et pouvant être une date lunaire (jour > dernier jour du mois, mois > 12).
     * 
     * @return dateNaissance (SSV : 104.12) (API vitale : ident.naissance)
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissancePatient) {
        this.dateNaissance = dateNaissancePatient;
    }

    /**
     * @return rangNaissance (SSV : 104.13) (API vitale : ident.rangDeNaissance)
     */
    public int getRangNaissance() {
        return rangNaissance;
    }

    public void setRangNaissance(int rangNaissancePatient) {
        this.rangNaissance = rangNaissancePatient;
    }

    /**
     * Donnée requise si connue.
     * @return nir du patient (SSV : 104.09 + 104.10) (API vitale : ident.nirCertifie)
     */
    public DMPCNir getNirIndividu() {
        return nirIndividu;
    }

    public void setNirIndividu(DMPCNir nirPatient) {
        this.nirIndividu = nirPatient;
    }

}
