
import java.util.*;

public class sorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {23, 2, 54, 5, 2, 1, 98, 45, 6};
        int arr[] = {2,4,6,7,88,98,34,8};
        
        int n = arr.length;
        selectionsorting ss = new selectionsorting();
        Bubblesort bs = new Bubblesort();
        //ss.sort(arr, n);
         bs.sort(arr, n);
    }
}

class selectionsorting {

    void sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
class Bubblesort{
    void sort(int arr[],int n){
        for(int i=0;i<n;i++){
            int didSwap=0;
            for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
               int temp=arr[j];
               arr[j]=arr[j+1];
  arr[j+1]=temp;
  didSwap=1;
            }
            }
            if(didSwap==0){
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    void Insertionsort(int arr[],int n){
        for(int i=0;i<n;i++){
            int j=i;
            for(j=0;j<n;j++){
               if(arr[j]>arr[j+1]){ 
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=arr[j];
            }}
        }
    }
}