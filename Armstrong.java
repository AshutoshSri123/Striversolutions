import java.util.*;
class Armstrong{

    static int checkDigit(int n){
        int i=0;
        while(n>0){
            n = n /10;
            i+=1;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int val = a;
        int b = checkDigit(val);
        double sum = 0;
        while(val>0){
            int x = val%10;
            sum += Math.pow(x,b);
            val = val/10;
        }
        System.out.println((int)sum);
        if((int)sum==a){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}