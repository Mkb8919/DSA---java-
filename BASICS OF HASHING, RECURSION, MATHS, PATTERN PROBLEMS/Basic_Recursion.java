import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Basic_Recursion {

    public static void main(String[] args) {

        // Problem 1  print something n times by using recursion
//        int cnt = 0;
//        printNumbers(cnt);
//    }
//    static void printNumbers(int cnt){
//        if(cnt==3) return ;
//        System.out.println(cnt);
//        cnt++;
//        printNumbers(cnt);

        // Problem 2 - Print Name n times  GFG

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        func(1, n);
//    }
//    static void func(int i, int n ){
//        if(i>n) return;
//        System.out.println("MOHIT ");
//        func(i+1, n);

//        // Problem 3 print number from 1 - N  GFG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        func(1, n);
//    }
//    static void func(int i , int n ){
//        if(i>n) return;
//        System.out.println(i);
//        func(i+1, n);

//        // Problem 4 print number from N-1  GFG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        func(n, n);
//    }
//    static void func(int i, int n ){
//        if(i<1) return;
//        System.out.println(i);
//        func(i-1, n);

        // Problem 5 Sum of n natural numbers PARAMETERIZED RECURSION
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        SumofN(n, 0);
//    }
//    static void SumofN(int i , int sum){
//        if(i<1){
//            System.out.println("Sum = " +sum);
//            return;
//        }
//        SumofN(i-1, sum + i);

//        // FUNCTIONAL RECURSION
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        int result = SumofN(n);
//        System.out.println("Sum= " + result);
//    }
//    static int SumofN(int n ){
//        if(n == 0) {
//            return 0;
//        }
//        return n+SumofN(n-1);

//        // Problem 6  FACTORIAL OF N NUMBERS
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        int result = factorial(n);
//        System.out.println("factorial of " + n + " is : " + result);
//    }
//
//    static int factorial(int n){
//        if(n==0){
//            return 1;
//        }
//        return n*factorial(n-1);

//        // Problem 7   REVERSE OF AN ARRAY
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //input array elements
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//            // call recursive function
//            ReverseOfArray(arr, n , 0);
//
//
//            System.out.println("Reversed array: ");
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//        }
//
//
//         static void ReverseOfArray ( int[] arr, int n, int i) {
//            if (i >= n / 2) {
//                return ;
//            }
//            int temp = arr[i];
//            arr[i] = arr[n - i - 1];
//            arr[n - i - 1] = temp;
//
//            // recursive call
//            ReverseOfArray(arr, n, i + 1);


//        // Problem 8  CHECK IF STRING IS PALINDROME OR NOT  LEETCODE
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String str = sc.nextLine();
//
//        boolean isPalindrome = CheckStringIsPalindrome(str, 0, str.length());
//        if(isPalindrome){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not a Palindrome");
//        }
//
//    }
//
//    private static boolean CheckStringIsPalindrome(String str, int i, int n ) {
//    //    int n = str.length(); ismain n ko parameter main likhne ki jarurat nhi hain
//        if (i >= n / 2) {
//            return true;
//        }
//     if(str.charAt(i) != str.charAt(n-i-1)){
//         return false;
//     }
//    // return CheckStringIsPalindrome(str, i+1);
//        return CheckStringIsPalindrome(str, i+1, n);


        // Problem 9  FIBONACCI SERIES USING RECURSION  LEETCODE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series: ");
        for(int i=0; i<n; i++) {
            System.out.println(FibonacciSeries(i) + " ");
        }

    }

    static int FibonacciSeries(int n ){
        if(n<=1){
            return n ;
        }
        return FibonacciSeries(n-1) + FibonacciSeries(n-2);

    }

    }


