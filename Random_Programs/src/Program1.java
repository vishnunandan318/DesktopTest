public class Program1 {

public static void main(String[] args) {
		Program1 obj = new Program1();
		int arr[] = {1,1,2,2,2,4,4,4,4};
		
		System.out.println(obj.findLucky(arr));
	}
	

public int findLucky(int[] arr) {
	        
	int count;
	int lucky = -1;
	    for(int i=0; i<arr.length; i++){
	    count=0;
	    	for(int j=0; j<arr.length; j++){
	    		if(arr[i] == arr[j]){
	                count++;
	            }
	        }
	    	if(count > lucky){
	    		lucky = count;
	    	}
	    }
	return lucky;
	}
}