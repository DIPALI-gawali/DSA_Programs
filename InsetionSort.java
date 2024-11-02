package AllProgam;

public class InsetionSort {
	public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

           
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
	public static void displayArray(int[] arr)
	 {
	        for (int i=0;i<arr.length;i++) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 12, 11, 13, 5, 6 };
	        
	        System.out.println("Original array:");
	        displayArray(arr);

	        insertionSort(arr);

	        System.out.println("Sorted array:");
	        displayArray(arr);
	    }
	}


