package approcheObjet.essais;

import approcheObjet.entites.AdressePostale;
import approcheObjet.entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {


        Personne PersonneTP1 = new Personne();

        Personne PersonneTP2 = new Personne("Renou", "Florent");

        AdressePostale adresseTP2 = new AdressePostale(1,"Tennie",1,"72666");
        Personne PersonneTP2_2 = new Personne("Renou", "Florent", adresseTP2);

    }

}
