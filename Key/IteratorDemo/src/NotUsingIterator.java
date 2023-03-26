import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NotUsingIterator<I extends Number> {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();
        scores.add(94);
        scores.add(38);
        scores.add(87);
        scores.add(43);
        scores.add(72);

        System.out.println(scores);

        for (int score : scores) {
            if (score < 60) {
                // will throw a ConcurrentModificationException
                scores.remove(score);
            }
        }

        System.out.println(scores); // [72, 87, 94]
    }
}