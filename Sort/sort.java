static void miniMaxSum(int[] arr) {	  
	
     Arrays.sort(arr);
     long countMin = 0 , countMax =0 ;
     
    for(int i = 1 ; i<arr.length;i++) {
    	countMax += arr[i];
    }
    for(int i =0 ; i <arr.length-1;i++) {
    	countMin += arr[i];
    }
 	System.out.println(countMin + " " + countMax);
    
}
