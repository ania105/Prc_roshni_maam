package p17;
import java.util.*;

class std{
	int id;
	String name;
	double m1,m2,m3;
	
	public void setdata() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student ID: ");
	 id = sc.nextInt();
	System.out.println("Enter Student Name: ");
	 name = sc.next();
	System.out.println("Enter Marks 1: ");
	 m1 = sc.nextDouble();
	System.out.println("Enter Marks 2: ");
	m2 = sc.nextDouble();
	System.out.println("Enter Marks 3: ");
	 m3 = sc.nextDouble();
	
	}
	
	public void displaydata() {
		System.out.println("Enter Student ID: " + id);
		System.out.println("Enter Student Name: "+ name);
		System.out.println("Enter Marks 1: "+ m1);
		System.out.println("Enter Marks 2: "+ m2);
		System.out.println("Enter Marks 3: "+ m3);
	}
	
	public void avg() {
		System.out.println("Avg of marks "+((m1+m2+m3)/3));
	}
}

public class Student {
	public static void main(String args[]) {
		std s = new std();
		s.setdata();
		s.displaydata();
		s.avg();
	}

}
