
public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {13, 46, 24, 52, 20, 9};
        
        
        System.out.println("Original array:");
        printArray(arr);
        
        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
        
    }



    public static void selectionSort(int[]arr){
        int  n = arr.length;
        
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // swap
            int temp =  arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[]arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
