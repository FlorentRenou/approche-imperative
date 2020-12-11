package approcheObjet.essais;

import approcheObjet.entites.AdressePostale;
import approcheObjet.entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale();
        Personne Personne1 = new Personne("Renou", "Florent", adresse1);
        Personne Personne2 = new Personne("Ren", "Flo", adresse1);

    }

}
