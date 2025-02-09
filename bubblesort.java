public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 0, 1 };
        int n = arr.length;
        int temp;
        System.out.println("before sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Array Sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
