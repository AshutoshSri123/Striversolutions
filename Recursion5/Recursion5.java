import java.util.*;
class Recursion5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of first how many terms ? : ");
        int a = sc.nextInt();
        System.out.println(recursion(a));
    }
    static int sum = 0;
    static int recursion(int n){
        sum+=n;
        if(n==0){
            return 0;
        }
        recursion(n-1);
        return sum;
    }

}