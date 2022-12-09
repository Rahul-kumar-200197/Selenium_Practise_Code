package corejava;

import org.testng.annotations.Test;

public class Palindrome_USED_TestNG {
  @Test
  public void f() {
	  String str,reverse="";
	  //str="Rahul";
	  str="madam";
	  System.out.println("Numbers of characters"+str.length());
	  for(int i=str.length()-1;i>=0;i--) {
		  reverse=reverse+str.charAt(i);
	  }
	  System.out.println(reverse);
	  
	  if(str.equals(reverse)) {
		  System.out.println(str +" is a palindrome number");
	  }
		 
	  else {
		  System.out.println(str +" is not a palindrome number");
	  }
  }
}
