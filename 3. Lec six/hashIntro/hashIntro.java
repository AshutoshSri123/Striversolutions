import java.util.*;
class hashIntro{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for(int i=0; i<a; i++){
            hash[arr[i]]+=1;
        }

        int q = sc.nextInt();
        while(q--!=0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }
    }
}