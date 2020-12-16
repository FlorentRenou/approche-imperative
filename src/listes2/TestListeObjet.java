package listes2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeObjet {

    public static void main(String args[]) {

        List<Ville> list = new ArrayList();
        list.add(new Ville("Nice", 343000));
        list.add(new Ville("Carcassonne", 47800));
        list.add(new Ville("Narbonne", 53400));
        list.add(new Ville("Lyon", 484000));
        list.add(new Ville("Foix", 9700));
        list.add(new Ville("Pau", 77200));
        list.add(new Ville("Marseille", 850700));
        list.add(new Ville("Tarbes", 40600));

        Iterator<Ville> iterator = list.iterator();
        Ville villePeuplée = new Ville();
        while (iterator.hasNext()) {

            Ville ville = iterator.next();
            if (ville.getNbHabitants() > villePeuplée.getNbHabitants()) villePeuplée = ville;
        }

        System.out.println("La ville la plus peuplé est " + villePeuplée.getNom());

        iterator = list.iterator();
        Ville villeMoinsPeuplée = villePeuplée;
        while (iterator.hasNext()) {

            Ville ville = iterator.next();
            if (ville.getNbHabitants() < villeMoinsPeuplée.getNbHabitants()) villeMoinsPeuplée = ville;
        }

        iterator = list.iterator();
        while (iterator.hasNext()) {

            Ville ville = iterator.next();
            if (villeMoinsPeuplée == ville) iterator.remove();
        }

        iterator = list.iterator();
        while (iterator.hasNext()) {

            Ville ville = iterator.next();
            if (ville.getNbHabitants() > 100000) ville.setNom(ville.getNom().toUpperCase());

        }

        System.out.println(list.toString());


    }

}
