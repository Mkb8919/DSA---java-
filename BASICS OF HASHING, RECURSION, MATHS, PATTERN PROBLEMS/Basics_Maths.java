import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Basics_Maths {
    public static void main(String[] args) {

//        // problem 1   count digits in a  number   GEEKS FOR GEEKS
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("N: " + n);
//        int digits = countDigits(n);
//        System.out.println("Number of digits in N: " + digits);
//        countDigits(n);
//        sc.close();
//    }
//    // functions to count digits
//        public static int countDigits(int n ){
//        int cnt =  0;
//        while (n>0) {
//            int lastDigit = n % 10; // optional
//            cnt++;
//            n /= 10;
//        }
//        return cnt ;


//        // problem 2   reverse a number of digits  LEETCODE
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("N: " + n);
//        int digits = revNumber(n);
//        System.out.println("Number of digits in N: " + digits);
//        revNumber(n);
//        sc.close();
//    }
//
//    // functions to count digits
//    public static int revNumber(int n) {
//        int revNum = 0;
//        while (n > 0) {
//            int lastDigit = n % 10; // optional
//            revNum = (revNum * 10) + lastDigit;
//            n /= 10;
//        }
//        System.out.println(revNum);
//        return revNum;
//    }


//        // problem 3  check palindrome   LEETCODE
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("N: " + n);
//        boolean ispalindrome =  checkpalindrome(n);
//        System.out.println("is palindrome: " + ispalindrome);
//
//        sc.close();
//    }
//
//    public static boolean checkpalindrome(int n) {
//        int revNum = 0;
//        int dup = n;  //  duplicate (dup)
//        while (n > 0) {
//            int lastDigit = n % 10; // optional
//            revNum = (revNum * 10) + lastDigit;
//            n /= 10;
//        }
//        if (dup == revNum)
//            System.out.println("true");
//        else
//            System.out.println("false");
//
//    return dup == revNum;
//}


//        // problem 4 Armstrong number   LEETCODE - 166 premium
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("N: " + n);
//        boolean  isArmstrong  = Armstrong(n);
//        System.out.println("is Armstrong : " + isArmstrong);
//
//        sc.close();
//    }
//
//    public static boolean Armstrong(int n) {
//        int dup = n;  //  duplicate (dup)
//        int digits = String.valueOf(n).length(); // count digits
//        int sum = 0;
//        while (n > 0) {
//            int lastDigit = n % 10; // optional
//           // sum = sum + (lastDigit * lastDigit * lastDigit);  ---> yeh sirf 3 digits tak he kaam karega
//            sum = (int) (sum+Math.pow(lastDigit, digits));
//            n /= 10;
//        }
//        if (dup == sum)
//            System.out.println("true");
//        else
//            System.out.println("false");
//
//        return dup == sum;
//
//

//        // problem -5 print all divisors GEEK FOR GEEK
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//       // System.out.println("Divisors of" + n + "are;");
//        List<Integer> smallDivisors = new ArrayList<>();
//        List<Integer> largeDivisors = new ArrayList<>();
//
//        // EASY METHOD
////        for(int i=1;i<=n;i++){
////            if(n%i==0){
////                System.out.println(i+ " ");
//
//        // COMPLEX METHOD
//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                smallDivisors.add(i);
//                if (i != n / i) {
//                    largeDivisors.add(n / i);
//                }
//            }
//        }
//        // Print small divisors (1 to sqrt(n))
//        for (int d : smallDivisors) {
//            System.out.print(d + " ");
//        }
//
//        // Print large divisors (sqrt(n) to n) in reverse order
//        Collections.reverse(largeDivisors);
//        for (int d : largeDivisors) {
//            System.out.print(d + " ");
//        }
//        sc.close();

        // Problem 6 PRIME NUMBER CHECK    GEEK FOR GEEK
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//
//        if (isPrime(n)) {
//            System.out.println("True(It is a Prime number)");
//        } else {
//            System.out.println("False(It is a not a Prime number");
//        }
//
//        sc.close();
//    }
//
//    public static boolean isPrime(int n){
//
//        if (n<=1) return false; // 0 and 1 are not prime
//        int counter = 0;
//        for(int i=1; i<=n;i++){
//            if(n%i==0){
//                counter ++;
//                }
//            }
//        return counter == 2;
//        }
//
//        // Problem 7 GCD HCF     GEEK FOR GEEK
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a first number: ");
//        int num1 =  sc.nextInt();
//
//        System.out.println("Enter a second number:");
//        int num2 = sc.nextInt();
//
//        int result = findGCD(num1, num2 );
//        System.out.println("GCD(HCF) of " + num1 + " and " + num2 + " is: " + result);
//
//
//        sc.close();
//    }
//
//    public static int findGCD(int n1 , int n2){
//        int gcd = 1;
//        int min = Math.min(n1, n2);
//
//        for(int i =1; i<=min; i++){
//            if(n1%i==0 && n2%i==0){
//                gcd = i;
//            }
//        }
//        return gcd;



        // Problem 7 GCD HCF by EQUILATERAL ALGORITHAM  LEETCODE-1979
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a =  sc.nextInt();

        System.out.println("Enter a second number:");
        int b = sc.nextInt();

        int result = findGCD(a, b );
        System.out.println("GCD(HCF) of " + a + " and " + b + " is: " + result);


        sc.close();
    }

    public static int findGCD(int a , int b){


        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
            if(a==0){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }
        return a;

    }

}












