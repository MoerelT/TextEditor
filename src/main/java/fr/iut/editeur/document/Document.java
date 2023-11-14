package fr.iut.editeur.document;

/**
 * La classe document créer un document qui permet de modifier, ajouter ou supprimer du texte
 */
public class Document {

    /**
     * Le texte du document que l'on va éditer
     */
    private String texte;

    /**
     * Constructeur d'un Document
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Permet d'avoir le texte que contient le document
     * @return le texte du Document
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Permet de changer le texte en un autre choisi
     * @param texte Le texte qui a remplace l'ancien
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Permet d'ajouter du texte après le texte du document
     * @param texte Le texte a ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Permet de remplacer le texte allant de start à end par remplacement
     * @param start début du texte à remplacer
     * @param end fin du texte à remplacer
     * @param remplacement texte de remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Permet de mettre en majuscule le texte compris entre start et end
     * @param start Début du texte à mettre en majuscule
     * @param end Fin du texte à mettre en majuscule
     */
    public void majuscules(int start, int end) {
        String lettresMajuscules = this.texte.substring(start, end);
        this.remplacer(start, end, lettresMajuscules.toUpperCase());
    }

    /**
     * Permet d'effacer le texte compris entre start et end
     * @param start  Début du texte à effacer
     * @param end Fin du texte à effacer
     */
    public void effacer(int start, int end){
        this.remplacer(start, end, "");
    }

    /**
     * Permet d'effacer le texte dans son intégralité
     */
    public void clear(){
        this.remplacer(0, this.texte.length(), "");
    }

    /**
     * Permet d'avoir le texte sous forme d'un String
     * @return le texte;
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
