import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String regex = "c=|c-|dz=|d-|lj|nj|s=|z=";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(word);

        int count = 0, end = 0;
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            count += m.start() - end;
            end = m.end();
            count++;
        }
        count += word.length() - end;

        System.out.println(count);
    }
}