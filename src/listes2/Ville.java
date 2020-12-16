package listes2;

public class Ville {

    private String nom;
    private Integer nbHabitants;

    public Ville() {
        this.nom = "";
        this.nbHabitants = 0;
    }

    public Ville(String nom, Integer nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Integer getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}
