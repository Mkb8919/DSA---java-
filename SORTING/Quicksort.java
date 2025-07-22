public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        System.out.println("Original array");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array");
        printArray(arr);
    }

    public static void quickSort(int[]arr, int low, int high){
        if(low < high){
            int pi = partition(arr,low, high);
            quickSort(arr, low, pi - 1); // sort left sub-array
            quickSort(arr, pi + 1, high); // sort right sub-array
        }

    }
    public static int partition(int[] arr, int low, int high){
        int pivot =  arr[low];
        int i =  high +  1;

        for(int j =  high; j > low; j-- ){
            if(arr[j] >= pivot){
                i--;

                // swap arr[i] and arr[j]

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot in its correct position
        int temp = arr[i - 1];
        arr[i - 1] = arr[low];
        arr[low] = temp;

        return i - 1;

    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
