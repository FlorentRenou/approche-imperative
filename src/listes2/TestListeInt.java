package listes2;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList();
        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);

        System.out.println("Les éléments de la liste :");

        for (Integer elem : list) {
            System.out.println(elem);
        }

        System.out.println("Taille : " + list.size());

        int max = 0;
        for (Integer elem : list) {
            if (max < elem) max = elem;
        }

        System.out.println("Le plus grand est " + max);

        int min = 0;
        for (Integer elem : list) {
            if (min > elem) min = elem;
        }

        for (int i=0; i<list.size();i++) {

            if (list.get(i) == min) {

                list.remove(i);

            }
        }


        System.out.println("Les éléments de la liste après supression du plus petit élément :");

        for (Integer elem : list) {
            System.out.println(elem);
        }

        for (int i=0; i<list.size();i++) {

            if (list.get(i) < 0) {

                int modif = list.get(i)*(-1);
                list.set(i,modif);

            }

        }

        System.out.println("Les éléments de la liste après le changement de signe :");

        for (Integer elem : list) {
            System.out.println(elem);
        }


    }

}
