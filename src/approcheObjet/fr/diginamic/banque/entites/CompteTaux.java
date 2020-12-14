package approcheObjet.fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private Integer tauxRemuneration ;

    public CompteTaux(Integer numero, Integer solde, Integer tauxRemuneration) {
        super(numero, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "tauxRemuneration=" + tauxRemuneration +
                "} " + super.toString();
    }
}
