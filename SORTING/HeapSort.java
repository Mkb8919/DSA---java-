public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {4,10,3,5,1};
        System.out.println("Original Array:");
        printArray(arr);

        heapSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);

    }

    public static void heapify(int[] arr, int n, int i){
        int largest = i; // assume root is largest
        int left = 2 * i + 1;// left child index
        int right = 2 * i + 2;// right child index

        // if left child is larger than root
        if(left < n && arr[left] > arr[largest]){
            largest =  left;
        }
        // if right child is larger than root
        if(right < n && arr[right] > arr[largest]){
            largest =  right;
        }
        if(largest != i){
            // swap root with the largest

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
    public static void buildMaxHeap(int[] arr, int n){
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
    }
    public static void heapSort(int[] arr){
        int n = arr.length;
        buildMaxHeap(arr, n);
        for(int i = n - 1; i > 0; i--){
            // swap root with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    public static void printArray(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }


}
