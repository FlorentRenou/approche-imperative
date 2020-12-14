package approcheObjet.fr.diginamic.banque.entites;

public class Compte {

    private Integer numero,solde;

    public Compte(Integer numero, Integer solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Le numéro est " + numero + " et la solde est de " + solde;
    }

}
