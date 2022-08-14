import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /**   Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
         Метод натыйжаны жаңы set катары кайтарышы керек.
         Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
         Мисалы: [1, 2, 3} жана {0, 1, 2]
        Жооп: [0, 3]
         public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2)
         методу болушу керек
        */

        Set<Integer> set1 = new HashSet<>();
        set1.add(1996);
        set1.add(1999);
        set1.add(2000);
        set1.add(2002);
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1997);
        set2.add(2002);
        set2.add(1998);
        set2.add(1996);
        System.out.println("Set2: " + set2);

        System.out.println("Symmetric difference of Set1 and Set2: " + difference(set1, set2));


    }

    public static <Integer> Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.removeAll(set2);
        return symmetricDiff;
    }

}