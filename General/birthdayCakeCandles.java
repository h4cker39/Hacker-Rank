 static int birthdayCakeCandles(int[] ar) {
 	    Arrays.sort(ar);
 	   //1,1,4,4
 	    int size = ar.length;
 	    int max = ar[size-1 ];
 	    int count =  0;
 	    for(int i=0; i<size;i++) {
 	    	if(ar[i] == max) {
 	    		count +=1;
 	    		
 	    	}
 	    }
 		 	return count;
     }
