package corejava;

public class Student {
	
	static String cname="Durga Soft";
	int sno;
	String sname;	
	Student (String sname,int sno){	//Constructor:-to initialize instance variable
		this.sname=sname;
		this.sno=sno;		
	}		
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Munny",100); 
		Student s2=new Student("bunny",101);	
	    System.out.println(s1.sno);
		System.out.println(s1.sname);
		System.out.println(s1.cname);
		System.out.println(s2.sno);
		System.out.println(s2.sname);		
		System.out.println(s2.cname);
	}

}
