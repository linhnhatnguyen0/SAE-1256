package fr.cbon.app;

public class Utilisateur {
    private float poids;
    private short taille;
    private short age;
    private String email;
    private String nom;
    private String prenom;
    private String identifiant;
    private String sexe;

    public float getPoids() {
        return this.poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public short getTaille() {
        return this.taille;
    }

    public void setTaille(short taille) {
        this.taille = taille;
    }

    public short getAge() {
        return this.age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return this.identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
