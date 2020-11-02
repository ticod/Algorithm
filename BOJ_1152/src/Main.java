import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentence = new Scanner(System.in).nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println(0);
            return ;
        }
        System.out.println(sentence.split(" ").length);
    }
}