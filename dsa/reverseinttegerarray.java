

public class reverseinttegerarray {
    public static void main(String[] args) {
        int arr[]={4,6,44,7,3,9,89,1};

        for (int i=0;i<8/2;i++){
            int t=arr[8-i-1];
            arr[8-i-1]=arr[0];
            arr[0]=t;
            
   
        }
        for(int i=0;i<8;i++){
            System.out.println(arr[i]);
        }
    }
    
}
