import java.util.*;
class Recursion4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        recursion(a);
    }
    static void recursion(int n){
        System.out.println(n);
        n-=1;
        if(n==0){
            return;
        }
        recursion(n);
    }
}