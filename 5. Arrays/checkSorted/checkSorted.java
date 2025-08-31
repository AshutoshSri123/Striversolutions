import java.util.Scanner;

class checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements:");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Check for ascending order
        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                isAscending = false;
                break;
            }
        }
        if (isAscending) {
            return true;
        }

        // Check for descending order
        boolean isDescending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]) {
                isDescending = false;
                break;
            }
        }
        return isDescending;
    }
}