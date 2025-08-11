import  java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = isPalindrome(a);
        System.out.println(ans);
    }
    static boolean isPalindrome(int x) {
        int t = x;
        int y=0;
        while(x>0){

            y=y*10 + x%10;
            x=x/10;

        }
        if(y==t){

            return true;

        }else{
            return false;
        }
    }
}