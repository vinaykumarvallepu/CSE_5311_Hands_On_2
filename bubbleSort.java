public class bubbleSort {
    static void bubble(int a[]){
        int n = a.length;
        int temp = 0;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }
	public static void main(String[] args) {
	    int a[] = {10,5,2,3,1,2};
	    bubble(a);
	    
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i] + " ");
	    }

        
	}
}
