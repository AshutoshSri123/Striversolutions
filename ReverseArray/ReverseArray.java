//import java.util.*;
//class ReverseArray{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of your array : ");
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//        System.out.println("Enter values of your array : ");
//        for(int i=0; i<a; i++){
//            arr[i] = sc.nextInt();
//        }
//        int[] b = recursion(arr);
//        for(int i=0; i<a;ssss i++){
//            System.out.print("[ "+b[i]+"]");
//        }
//    }
//    static int l;
//    static int val = l-1;
//    static int[] recursion(int[] array){
//        int l = array.length;
//        int[] array_new = new int[l];
//        for(int i=0; i<l; i++){
//            array_new[i] = array[val];
//        }
//        val-=1;
//        recursion(array);
//        return array_new;
//    }
//}

public class ReverseArray {
    //Function to print array
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
    }
}

// writing this to maintain git streak :(