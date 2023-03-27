import java.io.*;
import java.util.*;

// From Video 11-1 (Code Along 11-A)
public class WordCountLinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        // read file into a map of [word --> number of occurrences]
//        List<String> words = new ArrayList<>();
        List<String> words = new LinkedList<>();

        System.out.println("Reading the file...");
        // for this example the file is in the PARENT folder of WordCount so I must use ../mobydick.txt to find it.
        // If the file mobydick.txt was in the WordCount folder then I would not need to use ../ to define the full path.
        Scanner input = new Scanner(new File("../mobydick.txt"));
        readfile(input, words);

        System.out.println("Removing the words...");
//        everyOther(words);  // remove every other word
        while (!words.isEmpty()) {
            words.remove(0);
        }

        System.out.println("Done.");

//        System.out.println();
//
//        input = new Scanner(new File("small.txt"));
//        words.clear();
//        readfile(input, words);
//        printFile(words);
    }

    public static void printFile(List<String > words) {
        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            System.out.println(word);
        }
    }

    // This method was created as part of video 11-1 (Code Along 11-A).
    // There is an error in the video.  The author in the video types list.size() instead of words.size()
    // He never gets a compiler error because he never attempts to execute the code.
    // This particular example has a corrected version
    public static void everyOther(List<String> words) {
//        using remove on a LinkedList without an iterator is SLOW because the list must be traversed from the front every time through the loop
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);    // slow for a linked list - takes about 3-4 minutes
//        }

//      Using an iterator is very fast because the iterator remembers where we are each time through and only has to traverse one element to get to the next element
        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            itr.next();
            if(itr.hasNext()) {
                itr.remove();
                itr.next();
            }
        }
    }

    public static void readfile(Scanner input, List<String> words) {
        while (input.hasNext()) {
            String word = input.next();
            words.add(word);
        }
    }
}