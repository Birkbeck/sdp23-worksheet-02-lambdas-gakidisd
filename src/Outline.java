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

  public static void question1_1(){
    String[] words = getWords();
//    Different approach
//    Arrays.sort(words, Comparator.comparingInt(String::length));
    Arrays.sort(words, (word1, word2) -> Integer.compare(word1.length() , word2.length()));

    System.out.println("Question 1: " + Arrays.toString(words));

  }


  public static void main(String[] args) {
    question1_1();



  }
}
