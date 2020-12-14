package approcheObjet.fr.diginamic.entites;

public class Cercle {

    private Double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

}
