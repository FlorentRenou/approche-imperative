package approcheObjet.fr.diginamic.banque.entites;

public abstract class Operation {

    private String date;
    public Integer montant;

    public Operation(String date, Integer montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String afficherType();

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
