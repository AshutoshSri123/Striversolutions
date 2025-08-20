import java.util.*;
class LargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Largest elements of the array : ");
        System.out.println(getLargest(arr));
    }
    static int val = 0;
    static int getLargest(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                val = array[i];
            }else{
                val = array[i+1];
            }
        }
        return val;
    }
}