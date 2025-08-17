import java.util.*;
class Recursion6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(recursion(a));
    }
    static int fac = 1;
    static int recursion(int n){
        fac *=n;
        if(n==1){
            return 1;
        }
        recursion(n-1);
        return fac;
    }
}