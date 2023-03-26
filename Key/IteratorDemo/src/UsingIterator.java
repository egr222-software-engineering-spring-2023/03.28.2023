import java.util.*;

public class UsingIterator<I extends Number> {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<Integer>();
        scores.add(94);
        scores.add(38);
        scores.add(87);
        scores.add(43);
        scores.add(72);

        System.out.println(scores); // [38, 43, 72, 87, 94] natural order is ascending for a TreeSet of integers

        Iterator<Integer> itr = scores.iterator();
        while (itr.hasNext()) {
            int score = itr.next();

            System.out.println("The score is: " + score);

            // eliminate any failing grades
            if (score < 60) {
                itr.remove();
            }
        }

        System.out.println(scores); // [72, 87, 94]
    }
}