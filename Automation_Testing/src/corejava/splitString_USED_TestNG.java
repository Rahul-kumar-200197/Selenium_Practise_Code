package corejava;

import org.testng.annotations.Test;

public class splitString_USED_TestNG {
  @Test
  public void f() {
	  String str;
	  str="sridevi,savitri,sunny,bunny,pinny,chinny";
	  String[] s=str.split(",");
	  System.out.println("Numbers of strings:-"+s.length);
	  for(int i=0;i<s.length;i++) 
	  {
		  if(s[i].equalsIgnoreCase("sunny"))
			  System.out.println(s[i]);
	  }
  }
}
