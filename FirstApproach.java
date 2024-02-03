package com.interviewPrep.leetcode.easy.longestcommonprefix;

public class FirstApproach {

	public static void main(String[] args) {
		
		String[] strs = new String[]{"flower","floor","flight"};
		FirstApproach lcp = new FirstApproach();
		
		String prefix = lcp.longestCommonPrefix(strs);
		System.out.println("Longest common prefix: " + prefix);
		
	}
	
	 public String longestCommonPrefix(String[] strs) {
		 
		 String prefix = "";
		 boolean isPresent = true;
		 
		 // store the first string from the input array in a string variable
		 String firstStr = strs[0];
		 
		 
		 /*
		  * In a for loop read character from firstStr 
		  */
		 for(int i=0; i<firstStr.length(); i++) {
			 
			 // store the char at index i in a variable chr
			 char chr = firstStr.charAt(i);
			 
			 /*
			  * now iterate the input array from the second string
			  */
			 for(int j=1; j<strs.length; j++) {
				 
				 String curStr = strs[j];
				 if(curStr.length() > i) {
					 
					 /*
					  * here we check if the character chr is present at the same
					  * index position in this string
					  */
					 if(chr == curStr.charAt(i) ) {
						 
						 // if yes then store in a boolean variable
						 isPresent = true;
						 
					 } // end if
					 else {
						
						 return prefix;
					 }
					 
				 } // end if
				 else {
					 
					 return prefix;
				 }
				 
			 } // end for
			 
			 if(isPresent) {
				 
				 // add the character chr in the prefix to be returned
				 prefix = prefix + chr;
			 }  // end if
			 
		 }  // end for
		 
		 return prefix;
		 
	 }  // end function

} // end class
