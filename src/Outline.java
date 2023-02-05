import java.util.Arrays;
import java.util.Comparator;

public class Outline {

  public static String[] getWords() {

    return new String[]{
            "Fundamentals of Computing",
            "Python",
            "Java",
            "Operation Systems",
            "Information Systems",
            "Cloud Computing",
            "Machine Learning",
            "Software Design and Programming",
            "Dissertation Project"
    };

  }


  public static void main(String[] args) {
    String[] words = getWords();
    Arrays.sort(words, Comparator.comparingInt(String::length));

    // Another approach
    // Arrays.sort(words, (word1, word2) -> Integer.compare(word1.length(), word2.length()));

    System.out.println(Arrays.toString(words));



  }
}
