package approcheObjet.fr.diginamic.banque.entites;

public class Debit extends Operation {

    public Debit(String date, Integer montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {

        return "Debit";

    }

}