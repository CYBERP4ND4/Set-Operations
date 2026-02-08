import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Set1 {
    public static void main(String[] args){
        Set<Integer> setA = new HashSet<Integer>();
        setA.addAll(Arrays.asList(new Integer[]{1,2,3,4,8,9,10,12}));
        Set<Integer> setB = new HashSet<Integer>();
        setB.addAll(Arrays.asList(new Integer[]{1,3,7,4,5,6,10,11}));

        Set<Integer> union = new HashSet<Integer>(setA); //Union
        union.addAll(setB);
        System.out.println("Union of Set A and B: " + union);

        Set<Integer> intersection = new HashSet<Integer>(setA); //Intersection
        intersection.retainAll(setB);
        System.out.println("Intersection of Set A and B: " + intersection);

        Set<Integer> difference = new HashSet<Integer>(setA); //Difference A-B
        difference.removeAll(setB);
        System.out.println("Difference of Set A and B (A-B): " + difference);

        Set<Integer> difference2 = new HashSet<Integer>(setB); //B-A
        difference2.removeAll(setA);
        System.out.println("Difference of Set A and B (B-A): " + difference2);

        Set<Integer> uniqueA = new HashSet<Integer>(setA); //Symmetric Difference
        uniqueA.removeAll(setB);
        Set<Integer> uniqueB = new HashSet<Integer>(setB); //B-A
        uniqueB.removeAll(setA);

        Set<Integer> symmetricDifference = new HashSet<Integer>(uniqueA);
        symmetricDifference.addAll(uniqueB);
        System.out.println("Symmetric Difference of Set A and B: " + symmetricDifference);

        //Subsets
        boolean subSet = setA.containsAll(setB);
        System.out.println("Is Set B a Subset of Set A? Answer: " + subSet);

        boolean subSet2 = setB.containsAll(setA);
        System.out.println("Is Set A a Subset of Set B? Answer: " + subSet2);

        boolean subsetItselfA = setA.containsAll(setA);
        System.out.println("Is set A a subset of itself? Answer: " + subsetItselfA);

        boolean subsetItselfB = setB.containsAll(setB);
        System.out.println("Is set B a subset of itself? Answer: " + subsetItselfB);
    }
}
