/*************************************************************************
   Author:Luis Giordano
   Date:08/11/2018
   Hacker Rank
   Time Conversion
   Time conversion from civilian normal time to military time
************************************************************************/

//This is just the function remember to call. Sorry for not copying things from hacker rank but I dont like copying from peoples repo 
//to mine


static String timeConversion(String s) {
 		    String complete = "";
 			char [] c_conversion = {};
 			c_conversion = s.toCharArray();
 			int size = c_conversion.length; 
 			char [] receive = {c_conversion[size-2],c_conversion[size-1]};
 			String pm = new String(receive);
      
      
 		int counter = 0 ;
 		int [] twelveForYou = new int[2];
 		if(pm.equals("PM")) {			
 			for(int i = 0 ; i<2;i++) {
 			counter +=  Character.getNumericValue(c_conversion[i]); 
 			twelveForYou[i] =  Character.getNumericValue(c_conversion[i]); 
 			c_conversion[i] = ' ';
 			}
 			
 			if(twelveForYou[0] != 1 ||twelveForYou[1] != 2) {
 				
 				if(twelveForYou[0] == 1 && twelveForYou[1] ==1) {
 					counter = 23;
 					String appender = new String(c_conversion);
 					appender = appender.replace(" ","");
 					appender = appender.replace("PM","");
 					complete = Integer.toString(counter) + appender; 	

 				}else {
 				//se != 1 e !=2
 			counter+=12;
 			String append = new String(c_conversion);
 			append = append.replace(" ","");
 			append = append.replace("PM","");
 			String number = Integer.toString(counter); 		
  			 complete = number + append;
 				}}else {
 				complete = s;
 				complete = complete.replace("AM","");
 	 			complete = complete.replace("PM","");		
 			}
 		}else {
 			complete = s;
 			complete = complete.replace("AM","");
 			complete = complete.replace("PM","");
 			complete = complete.replace("12","00");
 			
 			}
 		
 		return complete;

    }
 	
