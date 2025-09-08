import java.util.*;
class AssignCookies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Cookies : ");
        int numberOfCookies = sc.nextInt();
        System.out.print("Enter the size of Cookies : ");
        int[] sizeOfCookies = new int[numberOfCookies];
        for(int i=0; i<numberOfCookies; i++){
            sizeOfCookies[i] = sc.nextInt();
        }
        System.out.print("Enter the number of Children : ");
        int numberOfChildren = sc.nextInt();
        System.out.print("Enter the greed factor of Children : ");
        int[] greedFactor = new int[numberOfChildren];
        for(int i=0; i<numberOfChildren; i++){
            greedFactor[i] = sc.nextInt();
        }
        int ans = findTotalChildren(sizeOfCookies, greedFactor);
        System.out.println(ans);
    }
    static int findTotalChildren(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int l = 0;
        int r = 0;
        while(l<arr1.length && r<arr2.length){
            if(arr1[r]<=arr2[l]){
                r+=1;
            }else{
                l+=1;
            }
        }
        return r;
    }
}