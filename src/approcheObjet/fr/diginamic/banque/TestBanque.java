package approcheObjet.fr.diginamic.banque;

import approcheObjet.fr.diginamic.banque.entites.*;

public class TestBanque {

    public static void main(String[] args) {


        Compte[] comptes = {new Compte(1,3000), new CompteTaux(2,6000,20)};

        for(Compte compte : comptes) {
            System.out.println(compte);
        }

        Operation[] operations = {new Credit("1/01/2020",10),new Debit("2/01/2020",20),
                new Credit("3/01/2020",30),new Debit("4/01/2020",40),
                new Credit("5/01/2020",50),new Debit("6/01/2020",60),
                new Credit("7/01/2020",70),new Debit("8/01/2020",80)};

        int montantGlobal = 0;

        for(Operation operation : operations) {
            if(operation.afficherType().equals("Credit")) {
                montantGlobal = montantGlobal + operation.montant;
                System.out.println(operation);
                System.out.println("Opération de type Crédit");
            }else {
                montantGlobal = montantGlobal - operation.montant;
                System.out.println(operation);
                System.out.println("Opération de type Debit");
            }
        }

        System.out.println("Le montant de l'opération est de " + montantGlobal);

    }

}
