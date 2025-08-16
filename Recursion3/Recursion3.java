import java.util.*;
class Recursion3{
     static int b=1;
     static void recursion(int n){
        System.out.println(b);
        b+=1;
        if(b>n){
            return;
        }
        recursion(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        recursion(a);
    }
}