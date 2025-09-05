import java.util.*;
class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));
    }
    static int fibo(int N){
        if(N <= 1){
            return N;
        }
        int last = fibo(N-1);
        int slast = fibo(N-2);
        return last + slast;
    }
}