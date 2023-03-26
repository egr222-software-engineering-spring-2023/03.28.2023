import java.util.*;

public class IntegerSet {
    public static void main(String[] args) {
//        Set<Double> grades = new HashSet<>();     // arbitrary order
        Set<Double> grades = new TreeSet<>();   // "natural" order
        grades.add(90.5);
        grades.add(85.4);
        grades.add(100.0);
        grades.add(72.5);
        grades.add(85.4);   // won't be in the set twice

        System.out.println(grades.size() + " unique scores.");
        for (double grade : grades) {
            System.out.println("Student's grade: " + grade);
//            if (grade < 75) {
//                grades.remove(grade);
//            }
        }
        System.out.println(grades);
    }
}