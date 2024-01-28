public class selectionSort {
    static void Selection(int arr[]){
        
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            int min_value = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_value])
                min_value = j;
            }
            temp = arr[i];
            arr[i] = arr[min_value];
            arr[min_value] = temp;
        }
    }
	public static void main(String[] args) {
	    
	    int arr[] = {10,1,5,20,2,4,1};
	    Selection(arr);
	    
	    for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i] + " ");
	    }
	}
}
