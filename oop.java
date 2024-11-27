import java.util.Scanner;
 class Hello{
    Hello(){
System.out.println("not parmeters ");
    }
    Hello(int a){
        System.out.println("hello"+a);
    }
void hell(int a){
    System.out.println("nayan"+a);
}

}
public class oop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=9;
        Hello h=new Hello();
        new Hello(x);
h.hell(x);

    }
    
}