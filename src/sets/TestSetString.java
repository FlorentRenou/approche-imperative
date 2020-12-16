package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

    public static void main(String args[]) {

        HashSet<String> list = new HashSet();
        list.add("USA");
        list.add("France");
        list.add("Allemagne");
        list.add("UK");
        list.add("Italie");
        list.add("Japon");
        list.add("Chine");
        list.add("Russie");
        list.add("Inde");

        for (String elem : list) {
            System.out.println(elem);
        }

        String max = "";
        for (String elem : list) {
            if (max.length() < elem.length()) max = elem;
        }

        System.out.println("Le plus grand est " + max);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {

            String elem = iterator.next();
            if (elem == max) iterator.remove();

        }

        for (String elem : list) {
            System.out.println(elem);
        }

    }

}
