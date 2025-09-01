import java.util.*;
class LargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array : ");
        int a = sc.nextInt();
        System.out.print("Enter the values of your Array : ");
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i=1; i<a; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.print("Largest element of your Array is : ");
        System.out.println(largest);
    }
}