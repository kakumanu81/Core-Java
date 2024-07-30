package com.serilazationaanddesrialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

class Employee implements Serializable {

	private int emp_id;
	private String emp_name;
	private Float emp_salary;
	private String emp_location;

	public Employee(int emp_id, String emp_name, Float emp_salary, String emp_location) {

		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_location = emp_location;
	}

	public void get_emp_Details() {
		System.out.println("Employee Id : " + emp_id);
		System.out.println("Employee Name : " + emp_name);
		System.out.println("Employee Salary : " + emp_salary);
		System.out.println("Employee Location : " + emp_location);

	}
}

public class SerialZation_and_Deserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// seriliazation started
		FileOutputStream fos = new FileOutputStream("E:/emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee emp1 = new Employee(111, "codegana", 50000.0f, "hyd");
		System.out.println("Employees Details before serilization");
		emp1.get_emp_Details();

		oos.writeObject(emp1);
		System.out.println("Serilazation Employee object : " + emp1);
		System.out.println();

		oos.close();
		fos.close();

		System.out.println("Serilization endde");
		System.out.println("======================================================");

		System.out.println("deserilization Started");

		FileInputStream fis = new FileInputStream("E:/emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee emp2 = (Employee) ois.readObject();
		System.out.println("after deserilization employee details");
		emp2.get_emp_Details();
		System.out.println("deserilization employee object : " + emp2);
		ois.close();
		fis.close();
		System.out.println("deselization ended");

	}

}
