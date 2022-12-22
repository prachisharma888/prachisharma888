package oopsProject;

public class persons
{
	String studentName;
	int studentAge;
	String mobile;
	persons()
	{
	mobile = "8882327896";
	}
	persons(String name , int age, int studentMobile){
	this();
	/* this is used for calling the default constructor
	*from parameterized constructor
	*/
	studentName = prachi;
	studentAge = 21;
	studentMobile = 8882327896;
	}
	void display(){
	System.out.println(studentName + " -" + studentAge+ "-"+ "mobile" + mobile);
	}
	public static void main(String args[])
	{
	persons obj = new persons("prachi" , 21 , 8882327898);
	obj.display();
	}
	}


