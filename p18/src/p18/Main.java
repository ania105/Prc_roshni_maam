package p18;


    class Person{
    	String name;
    	int age;
    	public Person(String name, int age) {
    		this.name = name;
    		this.age = age;
    	}
    }
    
    class Employee extends Person{
    	int employeeId;
    	double salary;
    	
    	public Employee(String name, int age, int employeeId, double salary) {
    	super(name, age);
    	this.employeeId = employeeId;
    	this.salary = salary;
    	}
    }
public class Main {
	public static void main(String args[]) {
		Person p = new Person("Jolly", 38);
		Employee e = new Employee("Jane",40,1003,34000);
		
		System.out.println("Person Name: " + p.name);
        System.out.println("Person Age: " + p.age);
        System.out.println("Employee Name: " + e.name);
        System.out.println("Employee Age: " + e.age);
        System.out.println("Employee ID: " + e.employeeId);
        System.out.println("Employee Salary: " + e.salary);
	}

}
