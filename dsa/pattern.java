
import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        hello h = new hello();
System.out.println("pattern1");
h.pattern1(n);
System.out.println("pattern2");
h.pattern2(n);
System.out.println("pattern3");
h.pattern3(n);
System.out.println("pattern4");
h.pattern4(n);
System.out.println("pattern5");
h.pattern5(n);    
System.out.println("pattern6");
h.pattern6(n);
System.out.println("pattern7");
h.pattern7(n);
System.out.println("pattern8");
h.pattern8(n);
System.out.println("pattern9");
h.pattern9(n);
System.out.println("pattern10");
h.pattern10(n);
System.out.println("patter21");
h.pattern21(n);
System.out.println("pattern22");
h.pattern22(n);

    }

}

class hello {

    void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {

                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {

                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              if(j==1||j==n||i==1||i==n) {
                System.out.print("*");
              }
              else System.out.print(" ");
            }
            System.out.println();
        }
       


}

void pattern22(int n) {
    int k=0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          if(j==1+k||j==n+k||i==1+k||i==n+k) {
            System.out.print(n);
          }
          else System.out.print(" ");
        }
        System.out.println();
        k=n-1;
        k--;
    }
   


}


}
