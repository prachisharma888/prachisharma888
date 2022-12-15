package labtest2;

   public class member 
 {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

 public member(String name, int age, String phoneNumber, String address, double salary) 
 
 {
     this.name = name;
     this.age = age;
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.salary = salary;
 }

 public void print() {
	 System.out.println("name " + name);
	 System.out.println("age " + age);
	 System.out.println("phoneNumber " + phoneNumber );
	 System.out.println("address " + address);
     System.out.println("Salary " + salary);
 }
}