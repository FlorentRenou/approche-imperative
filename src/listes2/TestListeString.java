package listes2;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

    public static void main(String args[]) {

        List<String> list = new ArrayList();
        list.add("Nice");
        list.add("Carcassonne");
        list.add("Narbonne");
        list.add("Lyon");
        list.add("Foix");
        list.add("Pau");
        list.add("Marseille");
        list.add("Tarbes");

        String max = "";
        for (String elem : list) {

            if (max.length() < elem.length()) max = elem;

        }

        System.out.println("Le plus grand mot est " + max);

        for (int i=0; i<list.size();i++) {

            list.set(i,list.get(i).toUpperCase());

        }

        System.out.println("Les éléments de la liste après avoir mis tous les noms de villes en majuscules :");

        for (String elem : list) {
            System.out.println(elem);
        }

        for (int i=0; i<list.size();i++) {

            if ( list.get(i).charAt(0) == 'N') list.remove(i);

        }

        System.out.println("Les éléments de la liste après avoir supprimez de la liste les villes dont le nom commence par la lettre N. :");

        for (String elem : list) {
            System.out.println(elem);
        }

    }

}
