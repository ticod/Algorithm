import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print(Arrays.stream(array).min().getAsInt() + " ");
        System.out.print(Arrays.stream(array).max().getAsInt());
    }
}
