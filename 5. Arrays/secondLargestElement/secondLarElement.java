import java.util.*;
class secondLarElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i=1; i<a; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        int secLar = Integer.MIN_VALUE;
        for(int i=1; i<a; i++){
            if(arr[i]>secLar && arr[i]!=largest){
                secLar = arr[i];
            }
        }
        System.out.println(secLar);

    }
}