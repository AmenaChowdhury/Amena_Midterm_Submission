package design;

import static design.EmployeeInfo.calculateEmployeeBonus;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.setEmployeeId(1);
		emp1.setName("James");
		emp1.setSalary(2000);
		emp1.setEmpDepartments("dept1");

		System.out.println("Employee emp1\n"+emp1.toString());
		calculateEmployeeBonus(3);

		EmployeeInfo.calculateEmployeePension();
		System.out.println("");

		EmployeeInfo emp2 = new EmployeeInfo("Peter Pan", 2, 4000, "C");
		System.out.println("Employee emp2\n"+emp2.toString());
		emp2.hourlySalary();
		emp2.annualSalary();
		System.out.println("");

		EmployeeInfo emp3 = new EmployeeInfo("Robert Blanco", 3);
		System.out.println("Employee emp2\n"+emp3.toString());
		emp3.calculateSalary();
		EmployeeInfo.calculateEmployeeBonus(1);
		System.out.println("");
	}
}
