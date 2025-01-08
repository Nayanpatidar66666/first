import java.util.Scanner;
public class recursion {
    int p=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
recursion r=new recursion();

System.out.println(r.printupton(n));

// recursion.printntimes(n);

    }

   static void printntimes(int n){
        if(n==0){return ;}
        else{
System.out.println("nayan");
printntimes(n-1);
}


}
int printupton(int n){
   
    if(n==0){
        return p;

    }

    p=p*n;
    printupton(n-1);
}
}
