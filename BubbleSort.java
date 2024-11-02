package AllProgam;

public class BubbleSort 
{
	public static void bubbleSort(int[] arr) 
	{
        
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        
        bubbleSort(arr);
        
        System.out.println("Sorted array:");
        displayArray(arr);
	}

}
