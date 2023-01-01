package salary;

class Employee {
	void display() {
		System.out.println("name of the class is Employee");
	}
	void calcSalary() {
		System.out.println("Salary of employee is 10000");
	}
}
class Engineer extends Employee{
	
	void calcSalary() {
		System.out.println("Salary of employee is 20000");
	}
}

class Demo{
	public static void main(String a[]) {
		Employee emp=new Engineer();
		emp.display();
		emp.calcSalary();		
	}
}