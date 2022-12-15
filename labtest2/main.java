package labtest2;

public class main<Employee>

   {
	public main (String[] args)
	
   {
        Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
        Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
        employee.printSalary();
        manager.printSalary();
    }

}
