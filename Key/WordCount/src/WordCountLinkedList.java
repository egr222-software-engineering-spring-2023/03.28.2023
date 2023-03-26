import java.io.*;
import java.util.*;

// From Code Along 16-A
public class WordCountLinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        // read file into a map of [word --> number of occurrences]
//        List<String> words = new ArrayList<>();
        List<String> words = new LinkedList<>();

        System.out.println("Reading the file...");
        Scanner input = new Scanner(new File("mobydick.txt"));
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