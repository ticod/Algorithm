import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int length = 9;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        int max = Arrays.stream(array).max().getAsInt();
        int count = 0;
        for (; max != array[count]; count++) {}
        System.out.println(max);
        System.out.println(++count);
    }
}