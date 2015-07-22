
public class MergeSort {
	static void sort(int[] a, int low, int high) 
	{
		int n = high - low;         
		if (n <= 1) 
			return; 
		int mid = low + n/2; 

		sort(a, low, mid); 
		sort(a, mid, high); 

		int[] temp = new int[n];
		int i = low, j = mid;
		for (int k = 0; k < n; k++) 
		{
			if (i == mid)  
				temp[k] = a[j++];
			else if (j == high) 
				temp[k] = a[i++];
			else if (a[j]<a[i]) 
				temp[k] = a[j++];
			else 
				temp[k] = a[i++];
		}    
		for (int k = 0; k < n; k++) 
			a[low + k] = temp[k];         
	}

	public static void main(String[] args){
		int[] array = {45,85,63,12,23,74,42,94};
		int n = array.length;
		sort(array,0,n);
		for(int i = 0;i < n;i++)
			System.out.println(array[i]+" ");
	}
}
