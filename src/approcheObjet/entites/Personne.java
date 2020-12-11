package approcheObjet.entites;

public class Personne {

    private String nom,prenom;
    private AdressePostale adressePersonne;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePersonne) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePersonne = adressePersonne;
    }
}
