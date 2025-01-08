
import java.util.Scanner;

public class largestinarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {23, 2, 54, 5, 2, 1, 98, 45, 6};
        int arr1[] = {2, 4, 6, 7, 88, 108, 34, 8};
        int n = arr.length;
        int n1 = arr1.length;
       largestinarraya lia=new largestinarraya();
       lia.maxx(arr,n);
       secondlargestinarray slia=new secondlargestinarray();
       slia.maxx(arr,n);

    }
}
class largestinarraya{
    void maxx(int arr[],int n){
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
System.out.println(max);
    }

}
class secondlargestinarray{
    void maxx(int arr[],int n){
       
//brute force solution is sort then next index after largest is second largest
//optimal is
int max = arr[0];
int secmax=-1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            
            }
            if(arr[i]>secmax && secmax!=max){
                secmax=arr[i];

            }
          
        }
System.out.println(secmax);
    }

}