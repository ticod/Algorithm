import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int length = 10;
        int[] array = new int[10];

        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
            array[i] = array[i] % 42;
        }
        System.out.println(Arrays.stream(array).distinct().count());
    }
}