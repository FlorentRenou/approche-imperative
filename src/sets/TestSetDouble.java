package sets;

import listes2.Ville;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestSetDouble {

    public static void main(String args[]) {

        HashSet<Double> list = new HashSet<Double>();
        list.add(1.5);
        list.add(8.25);
        list.add(-7.32);
        list.add(13.3);
        list.add(-12.45);
        list.add(48.5);
        list.add(0.01);

        for (Double elem : list) {
            System.out.println(elem);
        }

        double max = 0;
        for (Double elem : list) {
            if (max < elem) max = elem;
        }

        System.out.println("Le plus grand est " + max);

        double min = 0;
        for (Double elem : list) {
            if (min > elem) min = elem;
        }

        Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext()) {

            Double elem = iterator.next();
            if (elem == min) iterator.remove();

        }

        System.out.println("Les éléments de la liste après supression du plus petit élément :");

        for (Double elem : list) {
            System.out.println(elem);
        }

    }

}
