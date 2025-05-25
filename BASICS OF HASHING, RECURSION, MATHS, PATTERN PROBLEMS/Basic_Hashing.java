import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Basic_Hashing {
    public static void main(String[] args) {

        // HASHING IMPLEMENTATION USING FREQUENCY OF ARRAY

//        Scanner sc =  new Scanner(System.in);
//
//        int n = sc.nextInt(); // input array size
//
//        int[] arr = new int[n];
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//            max = Math.max(max, arr[i]); // max value for dynamic hashing
//        }
//
//        // precompute
//        int[] hash = new int[max + 1];
//        for(int i=0; i<n; i++){
//            hash[arr[i]] += 1;
//        }
//
//        int q = sc.nextInt(); // number of queries
//        while(q-- != 0){
//            int number = sc.nextInt();
//
//            if(number >= 0 && number <= max){
//                System.out.println(hash[number]);
//            } else {
//                System.out.println("Number out of range.");
//            }
//        }
//
//        sc.close(); // good practice

        // CHARACTER FREQUENCY OF AN ARRAY USING HASHING

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        // precompute
//        int [] hash = new int[256];
//        for(int i=0; i<s.length();i++){
//            hash[s.charAt(i)] ++;
//        }
//        int q = sc.nextInt();
//        while(q-- > 0){
//            char c = sc.next().charAt(0);
//
//            // fetch
//            System.out.println(hash[c]);
//        }
//        sc.close();

//        // UNORDERED MAP
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//       for(int i=0; i<n;i++){
//           arr[i] = sc.nextInt();
//       }
//       // precompute
//        Map< Integer, Integer > mpp = new HashMap<>();
//       for(int i=0;i<n;i++){
//           mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1); // Increment frequency of each element
//       }
//       int q = sc.nextInt();
//       while (q-- > 0) {
//           int number = sc.nextInt();
//
//           // fetch
//           System.out.println(mpp.getOrDefault(number, 0));
//
//       }
//       sc.close();


        // Problem -> Count Frequency of Each Element Using HashMap

//        Scanner sc = new Scanner(System.in);
//
//        // input array element
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        // input elements
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // call method to count frequency
//        Map<Integer, Integer> frequency = countFrequency(arr);
//
//        // Print frequencies
//        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
//            System.out.println("Element: " + entry.getKey() + " → Frequency: " + entry.getValue());
//        }
//        sc.close();
//
//    }
//
//    // method to count frequency
//    public static Map<Integer, Integer> countFrequency(int[] arr) {
//        Map<Integer, Integer> freqMap = new HashMap<>();
//
//        for (int num : arr) {
//            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//        }
//        return freqMap;


      // Problem -> Find the highest/lowest frequency element

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count frequency using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // print frequencies and find min max frequency elements

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElem = -1;
        int minElem = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            System.out.println("Element: " + element + " → Frequency: " + frequency);

            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxElem = element;
            }

            if (frequency < minFreq) {
                minFreq = frequency;
                minElem = element;
            }
        }

        System.out.println("\nElement with Highest Frequency: " + maxElem + " → " + maxFreq + " times");
        System.out.println("Element with Lowest Frequency: " + minElem + " → " + minFreq + " times");

        sc.close();

    }
}
