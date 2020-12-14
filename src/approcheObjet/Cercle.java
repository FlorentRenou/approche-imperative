package approcheObjet;

public class Cercle implements ObjetGeometrique{

    private Double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

}
