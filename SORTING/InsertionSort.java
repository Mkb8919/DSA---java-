public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i - 1;

            //shift the larger element to the right
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] =  arr[j];
                j--;
            }
            arr[j + 1] = temp; // place key in correct position
            System.out.print("Pass " + i + ": ");
            for(int num : arr){
                System.out.print(num + "");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // test sorted array
        int [] sortedArr = {6, 8, 9, 12, 13, 14, 15};
        System.out.println("Sorted Array: ");
        System.out.print("Start: ");
        for(int num: sortedArr){
            System.out.print(num + " ");
        }
        System.out.println("\n");
        insertionSort(sortedArr);
        System.out.println("\nfinal: ");
        for(int num : sortedArr){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // test unsorted array
        int [] unsortedArr = {14, 9, 15, 12, 6, 8, 13};
        System.out.println("Unsorted Array: ");
        System.out.print("Start: ");
        for(int num : unsortedArr){
            System.out.print(num + " ");
        }
        System.out.println("\n");
        insertionSort(unsortedArr);
        System.out.println("\nfinal: ");
        for(int num : unsortedArr){
            System.out.print(num + " ");
        }

    }
}
