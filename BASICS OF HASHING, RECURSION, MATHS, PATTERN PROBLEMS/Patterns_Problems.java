import java.util.Scanner;

public class Patterns_Problems {
    public static void main(String[] args) {

        // **  1. direct main function main code
        // 2. take input from user in main function and make a void function for code
        // 3. don't take input write code in void function and return it on main function


//        PATTERN 1:
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the value of n: ");
//        int n = sc.nextInt();
//
//        pattern1(n);
//        sc.close();
//    }
//
//        public  static void pattern1(int n ){
//            for(int i = 0; i<n; i++){
//                for (int j =0; j<=n; j++){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }

        // ****    2 forms to solve that question

        //        int rows = 5;
//        int columns = 4;
//
//        // outer loop
//        for(int i=1; i<=rows;i++){
//            // inner loop
//            for(int j = 1; j<= columns; j++){
//                System.out.print(" * ");
//            }
//            System.out.println(); // move to the next line
//
//        }

        // PATTERN 2:
//        Scanner sc =  new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//
//        pattern2( n);
//        sc.close();
//    }
//    public static void pattern2(int n){
//        for(int i=0; i<=n;i++){
//            for (int j=0; j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        // PATTERN 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//
//        pattern3(n);
//        sc.close();
//    }
//    public static void pattern3(int n) {
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // PATTERN 4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern4(n);
//        sc.close();
//    }
//    public static void pattern4(int n) {
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        // PATTERN 5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//       // int n = 6;
//        pattern5(n);
//       // sc.close();
//    }
//    public static void pattern5(int n) {
//       for(int i=0; i<n; i++){
//           for(int j=n;j>i;j--){
//               System.out.print(" * ");
//           }
//            System.out.println();
//        }

//        // PATTERN 6
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern6(n);
//         sc.close();
//    }
//    public static void pattern6(int n) {
//        for(int i=0; i<n; i++){
//            for(int j=1;j<=n-i;j++){
////                for (int i = n; i >= 1; i--) {
////                    for (int j = i; j >= 1; j--)   {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//       // PATTERN 7
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern7(n);
//        sc.close();
//    }
//
//    public static void pattern7(int n) {
//
        // outer loop
//        for (int i = 0; i < n; i++) {
//
//            // space
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//                // star
//                for (int j = 0; j < 2 * i + 1; j++) {
//                    System.out.print("*");
//                }
//
//                    //space
//                    for (int j = 0; j < n - i - 1; j++) {
//                        System.out.print(" ");
//                    }
//                    System.out.println();
//                    }

//        // PATTERN 8
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern8(n);
//        sc.close();
//    }
//    public static void pattern8(int n) {
//
//        for (int i = 0; i < n; i++) {
//
//            // space
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            // star
//            for (int j = 0; j < 2*n - (2*i+1); j++) {
//                System.out.print("*");
//            }
//
//            //space
//            for (int j = 0; j <i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


//        // PATTERN 9
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern7(n);
//        pattern8(n);
//        sc.close();
//    }
//
//    public static void pattern8(int n) {
//
//        for (int i = 0; i < n; i++) {
//
//            // space
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            // star
//            for (int j = 0; j < 2*n - (2*i+1); j++) {
//                System.out.print("*");
//            }
//
//            //space
//            for (int j = 0; j <i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//        public static void pattern7(int n) {
//
//            for (int i = 0; i < n; i++) {
//
//                // space
//                for (int j = 0; j < n - i - 1; j++) {
//                    System.out.print(" ");
//                }
//
//                // star
//                for (int j = 0; j < 2 * i + 1; j++) {
//                    System.out.print("*");
//                }
//
//                //space
//                for (int j = 0; j < n - i - 1; j++) {
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }

//            // PATTERN 10
//            Scanner sc = new Scanner(System.in);
//            System.out.print("enter the number:");
//            int n = sc.nextInt();
//            pattern10(n);
//            sc.close();
//        }
//        public static void pattern10(int n ) {
//
//            // Outer loop
//            for (int i = 0; i <= 2 * n - 1; i++) {
//                int stars = i;
//
//                // for the second half of the rotated triangle
//                if(i>n) stars = 2*n-i;
//
//                for (int j = 0; j <= stars; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//
//            }

        // PATTERN 11
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern11(n);
//        sc.close();
//    }
//    public static void pattern11(int n ) {
//
//        int start = 1;
//        // outer loop
//        for(int i=0; i<n; i++){
//            if(i%2==0)
//                start = 1;
//            else start = 0;
//
//            // inner loop
//            for(int j=0; j<=i; j++){
//                System.out.print(start);
//                start = 1-start;
//            }
//
//            System.out.println();
//        }

//        // PATTERN 12
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern12(n);
//        sc.close();
//    }
//
//    public static void pattern12(int n) {
//
//        int space = 2*(n-1);
//        for (int i = 1; i <= n; i++) {
//            // numbers
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            // space
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//
//            // numbers
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//
//            }
//            System.out.println();
//            space-=2;
//        }

        // PATTERN 13
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern13(n);
//        sc.close();
//    }
//
//    public static void pattern13(int n) {
//        int num = 1;
//        for(int i=1;i<=n;i++) {
//            for(int j = 1; j <= i; j++){
//                System.out.print(num);
//                num = num+1;
//            }
//            System.out.println();
//
//        }

//        // PATTERN 14
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern14(n);
//        sc.close();
//    }
//
//    public static void pattern14(int n) {
//
//        // outer loop
//        for(int i=0;i<n;i++){
//
//            // inner loop
//            for(char ch='A'; ch<='A'+i; ch++){
//                System.out.print(ch );
//            }
//            System.out.println();
//        }

//        // PATTERN 15
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern15(n);
//        sc.close();
//    }
//
//    public static void pattern15(int n) {
//
//        // outer loop
//        for(int i=0;i<n;i++){
//
//            // inner loop
//            for(char ch='A'; ch<='A'+(n-i-1); ch++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

//        // PATTERN 16
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern16(n);
//        sc.close();
//    }
//
//    public static void pattern16(int n ) {
//        for(int i=0; i<n;i++){
//            for(int j=0; j<=i;j++){
//                System.out.print((char) ((int) ('A'+i)) );
//            }
//            System.out.println();
//        }

//        // PATTERN 17
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern17(n);
//        sc.close();
//    }
//
//    public static void pattern17(int n ) {
//        // outer loop
//        for(int i=0; i<n;i++) {
//
//            // space
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            // characters
//            char ch = 'A';
//            int breakpoint = (2*i+1)/2;
//            for(int j=1; j<=2*i+1;j++){
//                System.out.print(ch);
//               if(j<=breakpoint) ch++;
//               else ch--;
//            }
//            // space
//            for(int j=0; j<n-i-1; j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//        // PATTERN 18
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern18(n);
//        sc.close();
//    }
//
//    public static void pattern18(int n ) {
//        // outer loop
//        for(int i=0; i<n;i++) {
//            for (char ch = (char)(int)('E'-i) ; ch<=(char)(int)('E'); ch++) {
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        // PATTERN 19
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern19(n);
//        sc.close();
//    }
//
//    public static void pattern19(int n ) {

       /* // upper half
        for (int i = 0; i < n; i++) {
            // left star
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            // space
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            // right star
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // lower half (mirror of the upper half)

        for(int i=n-1;i>=0;i--){

            // left stars
            for (int j = 0; j <n - i; j++) {
                System.out.print(" * ");
            }

            // spaces
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            }
        */
        //   OR
        // initial spaces
//        int inis = 0;
//        for(int i=0;i<n;i++){
//
//            // stars
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" * ");
//            }
//            // spaces
//            for(int j=0;j<inis;j++){
//                System.out.print(" ");
//            }
//            // stars
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" * ");
//            }
//
//            inis+=2;
//            System.out.println();
//        }
//
//         inis = 8;
//        for(int i=0;i<n;i++){
//
//            // stars
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            // spaces
//            for(int j=0;j<inis;j++){
//                System.out.print(" ");
//            }
//            // stars
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//
//            inis-=2;
//            System.out.println();
//        }
//
//        // PATTERN 20
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern20(n);
//        sc.close();
//    }
//
//    public static void pattern20(int n ) {
//
//        // upper half including the middle row
//        for(int i=1;i<=n;i++){
//            if(i==n){
//                // middle line : print 2 stars (no spaces)
//                for(int j=1; j<=2*n; j++){
//                    System.out.print("*");
//                }
//            }
//                // left side stars
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//
//            // spaces
//                for (int j = 1; j <= 2 * n - i; j++) {
//                    System.out.print(" ");
//                }
//
//            // right side stars
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // lower half including the middle row(mirror of upper half)
//        for(int i=n-1; i>=1;i--){
//
//            //left side stars
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//
//            // spaces
//            if(i!=n) {
//                for (int j = 1; j <= 2 * n - i; j++) {
//                    System.out.print(" ");
//                }
//            }
//
//            // right side spaces
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//        // PATTERN 21
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number:");
//        int n = sc.nextInt();
//        pattern21(n);
//        sc.close();
//    }
//    public static void pattern21(int n ) {
//
//        for(int i=0;i<=n;i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//
//        }

        // PATTERN 22
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        pattern22(n);
        sc.close();
    }
    public static void pattern22(int n ) {
        int size = 2*n-1; // take common value of size
        for(int i=0; i<size;i++){
            for(int j=0;j<size;j++){
                // calculate the distance from edges
                int value = n-Math.min(Math.min(i,j), Math.min(size-1-i, size-1-j));
                System.out.print(value + "");
            }
            System.out.println();
        }
        }
    }




