
public class SelectionSort {
	static int[] sort(int[] arr){

		for(int i = 0;i < arr.length-1;i++){
			int index = i;
			for(int j = i+1;j < arr.length;j++){

				if(arr[j] < arr[index]){
					index = j;
					int smallNo = arr[index];
					arr[index] = arr[i];
					arr[i] = smallNo;
				}
			}

		}
		return arr;
	}
	public static void main(String[] args) {

		int[] input = {22,24,28,89,42,75,1,34};
		int[] arr1 = sort(input);
		for(int i : arr1){
			System.out.print(i+" ");
		}
	}

}
