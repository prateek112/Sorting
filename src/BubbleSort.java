

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort obj=new BubbleSort();
		int arr[]={65,43,12,67,1};
		obj.bubble(arr);
		System.out.println("Sorted Array");
		obj.printArray(arr);

	}
     void bubble(int arr[]){
		int n=arr.length;
		for(int i =0;i<n;i++){
			for (int j=i+1;j<n;j++){
				if (arr[j]<arr[i]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
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
