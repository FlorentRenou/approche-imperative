package approcheObjet.fr.diginamic.banque;

import approcheObjet.fr.diginamic.banque.entites.Compte;
import approcheObjet.fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {


        Compte[] comptes = {new Compte(1,3000), new CompteTaux(2,6000,20)};

        for(Compte compte : comptes) {
            System.out.println(compte);
        }

    }

}
