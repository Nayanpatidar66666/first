
import java.util.Scanner;

public class patterneleven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        bello b = new bello();

        System.out.println("pattern11");
        b.pattern11(n);
        System.out.println("pattern12");
        b.pattern12(n);
        System.out.println("pattern13");
        b.pattern13(n);
        System.out.println("pattern14");
        b.pattern14(n);
        System.out.println("pattern15");
        b.pattern15(n);
        System.out.println("pattern16A");
        b.pattern16A(n);
        System.out.println("pattern16B");
        b.pattern16B(n);
System.out.println("pattern17");
b.pattern17(n);
System.out.println("pattern18A");
b.pattern18A(n);
        System.out.println("pattern18B");
        b.pattern18B(n);
System.out.println("pattern19");
b.pattern19(n);
 System.out.println("pattern20");
 b.pattern20(n);
    }
}

class bello {

    void pattern11(int n) {
        int k;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                k = 0;
            } else {
                k = 1;
            }
            for (int j = 0; j <= i; j++) {

                System.out.print(k);
                k = 1 - k;

            }
            System.out.println();
        }
    }

    void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }

            System.out.println();

        }
    }

    void pattern13(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    void pattern14(int n) {
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            k = 'A';
            System.out.println();
        }
    }

    void pattern15(int n) {
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(k + " ");
                k++;
            }
            k = 'A';
            System.out.println();
        }
    }

    void pattern16A(int n) {
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(k + " ");

            }

            k++;
            System.out.println();
        }
    }

    void pattern16B(int n) {
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");

            }

            k++;
            System.out.println();
        }
    }

    void pattern17(int n) {
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k + "");
                k++;
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(k + "");
                k--;
            }
            k = 'A';
            System.out.println();
        }
    }

    void pattern18A(int n) {
        char k = (char) ('A' + n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k--;
            }

            k = (char) ('A' + n);
            k--;
            System.out.println();
        }
    }

    void pattern18B(int n) {

        for (int i = 1; i <= n; i++) {
            char k = (char) ('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");

                k++;
            }
            System.out.println();

        }
    }
    void pattern19(int n) {
        int k;
        
        // Upper half
        for (int i = 1; i <= n / 2; i++) { 
            k = i - 1; 
            for (int j = 1; j <= n; j++) {
                if (j <= (n / 2 - k) || (j >= (n / 2 + k + 1) && j <= n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
        
        // Lower half
        for (int i = n / 2; i >= 1; i--) {
            k = i - 1; 
            for (int j = 1; j <= n; j++) {
                if (j <= (n / 2 - k) || (j >= (n / 2 + k + 1) && j <= n)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
    
    
    
    void pattern20(int n) {
        int k;
        for (int i = n / 2; i >= 1; i--) {
            k = i - 1; 
            for (int j = 1; j <= n; j++) {
                if (j <= (n / 2 - k) || (j >= (n / 2 + k + 1) && j <= n)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
        
        
        // Upper half
        for (int i = 1; i <= n / 2; i++) { 
            k = i - 1; 
            for (int j = 1; j <= n; j++) {
                if (j <= (n / 2 - k) || (j >= (n / 2 + k + 1) && j <= n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
