import java.util.*;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=0;
        while(a>0){
            a = a/10;
            i+=1;
        }

        System.out.print(i);
    }
}