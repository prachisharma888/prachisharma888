package labtest5;

public class MyFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an object of the Thread class using the constructor Thread(String name)   
		Thread t= new Thread("Monu");  
		Thread t2= new Thread("Manjeet"); 
		Thread t3= new Thread("Moni"); 
		Thread t4= new Thread("Ranjeet"); 
		Thread t5= new Thread("Shiva"); 
		Thread t6= new Thread("Kajal"); 
		Thread t7= new Thread("prachi"); 
		Thread t8= new Thread("Taniya"); 
		Thread t9= new Thread("Nilesh"); 
		Thread t10= new Thread("Priyanshu"); 
		  
		// the start() method moves the thread to the active state  
		t.start();  
		// getting the thread name by invoking the getName() method  
		String str = t.getName();  
		System.out.println(str);  
		String str1 = t2.getName();  
		System.out.println(str1); 
		
	}

}
