package fr.cbon.app.calories;

import java.util.ArrayList;
import fr.cbon.app.aliments.Aliment;

public class Repas {

    protected TypeRepas type;
    protected ArrayList<AlimentQuantifie> aliments;

    /**
     * Crée un nouveau repas vide.
     * 
     * @param type Le type du repas
     */
    public Repas(TypeRepas type) {
        aliments = new ArrayList<AlimentQuantifie>();
        this.type = type;
    }

    /**
     * @return le type de repas
     * @see TypeRepas
     */
    public TypeRepas getTypeRepas() {
        return type;
    }

    public ArrayList<AlimentQuantifie> gAlimentQuantifies() {
        return aliments;
    }

    /**
     * Obtient le total des calories contenues dans le repas
     * 
     * @return le total des calories du repas, en grammes
     */
    public int getCalories() {
        int sommeCalories = 0;

        for (AlimentQuantifie alQu : aliments) {
            // Calcule les proteines, lipides et glucides pour chaque aliment selon sa
            // quantite dans le repas
            int proteinesGrammes = alQu.getAliment().getProteinesParGramme() * alQu.getQuantiteEnGrammes();
            int lipidesGrammes = alQu.getAliment().getLipidesParGramme() * alQu.getQuantiteEnGrammes();
            int glucidesGrammes = alQu.getAliment().getGlucidesParGramme() * alQu.getQuantiteEnGrammes();

            sommeCalories += 4 * proteinesGrammes + 9 * lipidesGrammes + 4 * glucidesGrammes;
        }

        return sommeCalories;
    }

    /**
     * Ajoute un aliment au repas, en indiquant la quantitee
     * 
     * @param aliment           L'aliment a ajouter
     * @param quantiteEnGrammes La quantite, en gramme, de l'aliment
     * @return L'indice de l'aliment ajoute
     */
    public int addAliment(Aliment aliment, int quantiteEnGrammes) {
        aliments.add(new AlimentQuantifie(aliment, quantiteEnGrammes));
        return aliments.size() - 1;
    }

    /**
     * Enleve l'aliment à l'index indiqué
     * 
     * @param indexOfAliment L'indice de l'aliment dans le repas. (Obtenu a l'ajout
     *                       dans le repas, notamment)
     * @throws Exception Si l'indice n'est pas dans le repas
     * @see #addAliment(Aliment, int)
     */
    public void removeAliment(int indexOfAliment) throws Exception {
        if (indexOfAliment < aliments.size()) {
            aliments.remove(indexOfAliment);
        } else {
            throw new Exception("Impossible d'enlever un aliment non existant !");
        }
    }

    /**
     * Permet d'enregistrer la quantite de l'aliment ajouté au repas.
     */
    private class AlimentQuantifie {
        protected Aliment aliment;
        protected int quantiteEnGrammes;

        /**
         * Cree une nouvelle paire Aliment-Quantite
         * 
         * @param alim  L'aliment a enregistrer
         * @param poids La quantité de l'aliment, en grammes
         */
        public AlimentQuantifie(Aliment alim, int quantiteEnGrammes) {
            aliment = alim;
            this.quantiteEnGrammes = quantiteEnGrammes;
        }

        /**
         * Renvoie une reference vers l'aliment
         * 
         * @return L'objet aliment par lui-même
         */
        public Aliment getAliment() {
            return aliment;
        }

        /**
         * Renvoie la quantité ajoutée de l'aliment enregistré.
         * 
         * @return la quantite de l'aliment, en grammes
         */
        public int getQuantiteEnGrammes() {
            return quantiteEnGrammes;
        }
    }

}