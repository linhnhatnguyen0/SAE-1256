package fr.cbon.app.aliments;

public class Aliment {
    private int proteinesParGramme;
    private int lipidesParGramme;
    private int glucidesParGramme;

    private String nom;
    private String type;

    private float fibres;
    private float calcium;
    private float fer;
    private float sodium;
    private float cholesterol;
    private float magnesium;

    public Aliment(int proteinesParGramme, int lipidesParGramme, int glucidesParGramme, String nom, String type,
            float fibres, float calcium, float fer, float sodium, float cholesterol, float magnesium) {

        this.proteinesParGramme = proteinesParGramme;
        this.lipidesParGramme = lipidesParGramme;
        this.glucidesParGramme = glucidesParGramme;
        this.nom = nom;
        this.type = type;
        this.fibres = fibres;
        this.calcium = calcium;
        this.fer = fer;
        this.sodium = sodium;
        this.cholesterol = cholesterol;
        this.magnesium = magnesium;
    }

    public Aliment(int proteinesParGramme, int lipidesParGramme, int glucidesParGramme, String nom, String type) {
        this.proteinesParGramme = proteinesParGramme;
        this.lipidesParGramme = lipidesParGramme;
        this.glucidesParGramme = glucidesParGramme;
        this.nom = nom;
        this.type = type;
    }

    public int getCalories() {
        // Calcule les proteines, lipides et glucides pour chaque aliment
        return 4 * proteinesParGramme + 9 * lipidesParGramme + 4 * glucidesParGramme;
    }

    public Aliment(String nom) {
        this.nom = nom;
    }

    public int getProteinesParGramme() {
        return this.proteinesParGramme;
    }

    public void setProteinesParGramme(int proteinesParGramme) {
        this.proteinesParGramme = proteinesParGramme;
    }

    public int getLipidesParGramme() {
        return this.lipidesParGramme;
    }

    public void setLipidesParGramme(int lipidesParGramme) {
        this.lipidesParGramme = lipidesParGramme;
    }

    public int getGlucidesParGramme() {
        return this.glucidesParGramme;
    }

    public void setGlucidesParGramme(int glucidesParGramme) {
        this.glucidesParGramme = glucidesParGramme;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFibres() {
        return this.fibres;
    }

    public void setFibres(float fibres) {
        this.fibres = fibres;
    }

    public float getCalcium() {
        return this.calcium;
    }

    public void setCalcium(float calcium) {
        this.calcium = calcium;
    }

    public float getFer() {
        return this.fer;
    }

    public void setFer(float fer) {
        this.fer = fer;
    }

    public float getSodium() {
        return this.sodium;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }

    public float getCholesterol() {
        return this.cholesterol;
    }

    public void setCholesterol(float cholesterol) {
        this.cholesterol = cholesterol;
    }

    public float getMagnesium() {
        return this.magnesium;
    }

    public void setMagnesium(float magnesium) {
        this.magnesium = magnesium;
    }

}
