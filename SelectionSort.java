package AllProgam;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
      
        for (int i = 0; i < arr.length - 1; i++)
        {
            
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
		int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        displayArray(arr);
        
        selectionSort(arr);
        
        System.out.println("Sorted array:");
        displayArray(arr);
    
	}

}

