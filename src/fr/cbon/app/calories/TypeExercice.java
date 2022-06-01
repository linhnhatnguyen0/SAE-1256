
public enum TypeExercice {
    LEGER(150),
    MOYEN(300),
    INTENSE(500);

    private float caloriesParHeure;

    private TypeExercice(float caloriesParHeure) {
        this.caloriesParHeure = caloriesParHeure;
    }

    public float getCaloriesParHeure() {
        return caloriesParHeure;
    }
}