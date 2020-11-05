

public class Main {
    public static void main(String[] args) {
        final int TEST_MAX = 500000;
        int[] testArray = new int[TEST_MAX];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * TEST_MAX);
        }
        long start = System.currentTimeMillis();
        /*
         * before testing sorting big o time spending, make your testing case scope ->
         * TEST_MAX Choose your sorting testing array
         *
         */
//        testArray = bubbleSort(testArray);
//        testArray = insertionSort(testArray);
//        testArray = shellSort(testArray);
//        testArray = selectionSort(testArray);
        testArray = quickSort(testArray);
        System.out.println("testing case : " + testArray.length);
        System.out.println("Total Time spend : " + (long) (System.currentTimeMillis() - start));
        System.out.print("checking sorting...");
        for (int i = 0; i < testArray.length - 1; i++) {
            if (testArray[i] > testArray[i + 1]) {
                System.out.println("sorting fail");
                System.out.println(testArray[i] + "/" + testArray[i + 1]);
                return;
            }
        }
        System.out.println("sorting perfect, test end");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        /*
        가장 큰 값부터 맨 뒤에 채워 넣는다.
         */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        /*
        배열의 최소 값부터 찾아(선택하여)
        맨 앞부터 차곡차곡 쌓는 정렬
         */
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        /*
        키 값을 앞의 값들과 비교하여
        적절한 위치에 삽입한다.
         */
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static int[] shellSort(int[] arr) {
        /*
        1959년 도널드 셸의 이름을 딴 셸 정렬
        배열을 일정 기준으로 분류하고, 분류한 배열을 삽입 정렬로 정렬한다.
        정렬 후 전체 배열을 더 작게 분류하여 다시 삽입 정렬로 정렬한다.
        분류된 배열의 길이가 1이 될 때까지 이를 반복한다.
         */
        // gap을 length / 3 + 1로 하는 알고리즘이 가장 빠르다 - 위키백과
        for (int gap = arr.length / 3 + 1; gap >= 1; gap = gap / 3 + 1) {
            for (int list = 0; list < gap; list++) {
                for (int i = list + gap; i < arr.length; i += gap) {
                    int key = arr[i];
                    int j = i - gap;
                    for (; j >= 0 && arr[j] > key; j -= gap) {
                        arr[j + gap] = arr[j];
                    }
                    arr[j + gap] = key;
                }
            }
            if (gap == 1) break;
        }
        return arr;
    }

    public static int[] quickSort(int[] testArray) {

    }

    public static int[] quickSort(int[] testArray, int s, int e) {

    }
}
