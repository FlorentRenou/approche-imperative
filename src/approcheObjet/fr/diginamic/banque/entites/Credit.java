package approcheObjet.fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, Integer montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {

        return "Credit";

    }
}
