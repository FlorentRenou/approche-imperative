package approcheObjet.entites;

public class AdressePostale {

    private Integer libellleRue,numeroRue;
    private String ville,codePostale;

    public AdressePostale() {

    }

    public AdressePostale(Integer libellleRue,String ville, Integer numeroRue, String codePostale) {
        this.libellleRue = libellleRue;
        this.ville = ville;
        this.numeroRue = numeroRue;
        this.codePostale = codePostale;
    }
}
