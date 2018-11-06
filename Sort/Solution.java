import java.util.Arrays; 
public class help {
	static void miniMaxSum(int[] arr) {	   
		int [] tempArray = arr;
		int min = 0 ;
	    int max = 0;
	    //Find Minumum
	    for(int i = 0 ; i < tempArray.length ; i++) {
	    	for(int j = 0 ; j < tempArray.length ; j++) {
	    		if(tempArray[i] < tempArray[j]) {
	        	   min = tempArray[i];
	           } else if(tempArray[i] > tempArray[j]) {
	        	   min = tempArray[j];
	        	   tempArray[i] = min;
	           } 		
	    	}
	    	if(min != 0) {
	    		break;
	    	}
	    }  
	    for(int i = 0 ; i< tempArray.length ;i ++) {
	    	for(int j = 0 ; j< tempArray.length ; j++) {
	    		  if(tempArray[i] > tempArray[j]) {
	    			  max = tempArray[i];
	    		  }else if(tempArray[i] < tempArray[j]){
	    			  max = tempArray[j];
	    			  tempArray[i] = max;
	    		  }
	    	}
	    	if(max != 0) {
	    		break;
	    	}
	    }
    System.out.println(min  + " " +max );	    
	}
	
	public static void main(String [] args) {
		int[] arr =  {7,69,2,221,8974};
		miniMaxSum(arr);
		int[] arr3 =  {1,2,3,4,5};
		miniMaxSum(arr3);
	}
}
