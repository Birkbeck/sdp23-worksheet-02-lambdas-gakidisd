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

    System.out.println("Question 1.1: " + Arrays.toString(words));

  }

  public static void question1_2(){
    String[] words = getWords();
    Arrays.sort(words, (word1, word2) -> Integer.compare(word2.length(), word1.length()));

    System.out.println("Question 1.2: " + Arrays.toString(words));
  }

  public static void question1_3(){
    String[] words = getWords();
    Arrays.sort(words, (word1, word2) -> word1.charAt(0) - word2.charAt(0));

    System.out.println("Question 1.3: " + Arrays.toString(words));

  }

  public static void question1_4(){
    String[] words = getWords();

    Arrays.sort(words, (word1, word2) -> {
      if (word1.contains("e") && !word2.contains("e")) return -1;
      if (word2.contains("e") && !word1.contains("e")) return 1;
      return 0;
    });

    System.out.println("Question 1.4: " + Arrays.toString(words));

  }





  public static void main(String[] args) {

    String[] words = getWords();

    Arrays.sort(words, (word1, word2) -> {
      if (word1.contains("e") && !word2.contains("e")) return -1;
      if (word2.contains("e") && !word1.contains("e")) return 1;
      return 0;
    });

    System.out.println("Question 1.4: " + Arrays.toString(words));


  }



  }

