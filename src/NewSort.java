
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,43,1,2,3,4,90};
		NewSort obj=new NewSort();
		obj.selectionSort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}

	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
