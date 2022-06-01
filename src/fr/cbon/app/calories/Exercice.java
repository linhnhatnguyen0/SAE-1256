package fr.cbon.app.calories;

public class Exercice {

    protected String nom;
    protected float caloriesDepensees;
    protected float tempsEnHeures;

    /**
     * Créé un nouvel exercice, en calculant les calories dépensées automatiquement
     * selon le type d'exercice donné
     * 
     * @param tempsEnHeures la durée de l'exercice, en heures (e.g. 1h30 = 1.5h)
     * @param type          le
     */
    public Exercice(float tempsEnHeures, TypeExercice type) {
        this.caloriesDepensees = tempsEnHeures * type.getCaloriesParHeure();
        this.tempsEnHeures = tempsEnHeures;
    }

}
