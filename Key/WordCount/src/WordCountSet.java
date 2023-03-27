import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// From Video 11-2 (Code Along 11-B)
public class WordCountSet {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();    // order is arbitrary
//        Set<String> words = new TreeSet<>();    // order will be "natural" order

        Scanner input = new Scanner(new File("mobydick.txt"));
//        Scanner input = new Scanner(new File("small.txt"));
        while (input.hasNext()) {
            String word = input.next();
//            if (!words.contains(word)) {
                words.add(word);
//            }
        }

        System.out.println(words.size() + " unique words.");
//        System.out.println(words);
//        for (String word:words) {
//            System.out.println(word);
//        }
    }
}
