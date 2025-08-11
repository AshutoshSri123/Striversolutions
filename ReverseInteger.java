import java.util.*;
class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = reverse(a);
        System.out.println(rev);
    }
    static int reverse(int x) {
        if(x<0){
            x=x*(-1);
            int y = 0;
            while(x>0){

                if(y>Integer.MAX_VALUE/10)return 0;
                y = y*10 + x%10;

                x = x/10;
            }
            return (-1)*y;

        }else{
            int y = 0;
            while(x>0){


                if(y>Integer.MAX_VALUE/10)return 0;
                y = y*10 + x%10;
                x = x/10;
            }
            return y;

        }

    }
}