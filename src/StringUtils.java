import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringUtils {

    public static int eChecker(String str1, String str2) {

        if (str1.contains("e") && !str2.contains("e")) {
            return -1;
        } else if (str2.contains("e") && !str1.contains("e")) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Applies a lambda to two Strings to define which of the Strings is better.
     * The method returns the better string.
     *
     *
     * @param s1
     * @param s2
     * @param lambda
     * @return
     */
    public static String betterString(String s1, String s2, TwoStringPredicate lambda){

        return lambda.findBest(s1,s2) ? s1 : s2;
    }


    public static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> lambda){
        return lambda.findBest(t1,t2) ? t1 : t2;
    }


    public static List<String> allMatches(List<String> words, Predicate<String> func){
        List<String> filteredWords = new ArrayList<>();
        for (String s: words){
            if (func.test(s)){
                filteredWords.add(s);
            }
        }
        return filteredWords;
    }


}
