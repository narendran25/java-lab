
public class Exp232 implements Comparable {
	
	int rollno;  
	String name;  
	int age;  
	Exp232(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(Object obj){  
	Exp232 st=(Exp232)obj;  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}
	public static void main(String args[]) {
		Exp232 a=new Exp232(1,"DEv",19);
		Exp232 b=new Exp232(2,"DEv1",18);
		
		System.out.println(a.compareTo(b));
	}
	  
	  

}
