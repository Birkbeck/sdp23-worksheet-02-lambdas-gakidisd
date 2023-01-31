import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        String[] modules = new String[8];
        modules[0] = "Java";
        modules[1] = "Python";
        modules[2] = "Fundamentals of Computing";
        modules[3] = "Information Systems";
        modules[4] = "Cloud Computing";
        modules[5] = "Data Knowledge and Management";
        modules[6] = "Software Design and Developement";
        modules[7] = "Dissertation Project";

//        ArrayList<String> modulesByLengthDesc = Arrays.stream(modules)
//                .sorted((m1, m2) -> m2.length() - m1.length())
//                .collect(Collectors.toCollection(ArrayList::new));
//
//        ArrayList<String> modulesBylengthAsc = Arrays.stream(modules)
//                .sorted((module1, module2) -> module1.length() - module2.length())
//                .collect(Collectors.toCollection(ArrayList::new));

        // Ascending order by length
        Arrays.sort(modules, Comparator.comparingInt(String::length));
        System.out.println(Arrays.asList(modules));

        System.out.println();

        // Descending order by length
        Arrays.sort(modules, Comparator.reverseOrder());
        System.out.println(Arrays.asList(modules));


        System.out.println();

        // Sorting based on First Char
        Arrays.sort(modules, Comparator.comparingInt(m -> m.toLowerCase(Locale.ROOT).charAt(0)));
        System.out.println(Arrays.asList(modules));

        System.out.println();





//        ArrayList<String> modulesByFirstChar = Arrays.stream(modules)
//                .sorted((m1,m2) -> m1.compareTo(m2))
//                .collect(Collectors.toCollection(ArrayList:: new));
//
//        ArrayList<String> modulesByFirstChar = Arrays.stream(modules)
//                .map(module -> module.toLowerCase(Locale.ROOT))
//                .sorted(Comparator.com



    }
}
