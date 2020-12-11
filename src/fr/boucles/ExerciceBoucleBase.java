package fr.boucles;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciceBoucleBase {

    public static void main( String[] args ) {
        for (int i=1; i<=10;i++) {
            System.out.println(i);
        }

        String prenom1 = "Florent";
        String nom1 = "Renou";

        for (int i=1; i<=20;i++) {
            System.out.println(i + ". " + prenom1 + " " + nom1);
        }

        for (int i=1; i<=100;i++) {
            if (i % 2 == 0)
                System.out.println(i + ". Pairs");
            else
                System.out.println(i + ". Impairs");
        }

    }

}
