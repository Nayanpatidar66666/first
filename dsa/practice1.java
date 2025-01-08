import java.util.Scanner;
public class practice1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int arr[]={1,2,0,2,1,0,1,0,0,0,1,1,2};
int n=arr.length;
for(int i=0;i<n-1;i++){
    if(arr[i]==0){
        arr[0]=arr[i];

    }
    else if(arr[i]==2){
        arr[n-1]=arr[i];
    }
    else return;
}
    }
}