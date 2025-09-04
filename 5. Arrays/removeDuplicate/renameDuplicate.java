import java.util.*;
class removeDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(dup(arr));
    }
    static int count = 0;
    static int dup(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++ )
        }
    }
}