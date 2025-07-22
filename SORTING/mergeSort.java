public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2; // find the middle point
            mergeSort(arr, left, mid); // sort left half
            mergeSort(arr, mid + 1, right); // sort right half
            merge(arr, left, mid, right); // merge the sorted halves
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        // size of two sub arrays
        int n1 =  mid - left + 1;
        int n2 =  right - mid;

        // create temporary array
        int[] leftArr  = new int[n1];
        int[] rightArr =  new int[n2];

        // copy data to temporary arrays
        for(int i =  0; i < n1; i++){
            leftArr[i] = arr[left + i];
        }
        for(int j = 0; j < n2; j++){
            rightArr[j] =  arr[mid + 1 + j];
        }

        // merge the temporary array back into the arr[left...right]
        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;

        }
        // copy remaining elements of leftArr[] if any
        while(i < n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // copy remaining elements of rightArr[] if any
        while(j < n2){
            arr[k] = leftArr[j];
            j++;
            k++;
        }
    }
    public static void printArray(int[]arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

