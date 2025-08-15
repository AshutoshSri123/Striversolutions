import java.util.*;
class Recursion1{
    static void recursion(int m, int n){

        System.out.println(m);
        n-=1;
        if(n==0){
            return;
        }
        recursion(m,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What number you want to print : ");
        int a = sc.nextInt();
        System.out.print("How many times do you want to print that number : ");
        int b = sc.nextInt();
        recursion(a,b);
    }
}