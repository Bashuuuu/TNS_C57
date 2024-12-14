package utilities;
import employees.*;
public class AssignmentMain {
	 public static void main(String[] args) {

	        Manager manager = new Manager("Basidh", 101, 85000, "HR");
	        System.out.println("Manager Details:");
	        EmployeeUtilities.displayEmployeeInfo(manager);
	        System.out.println("Department: " + manager.getDepartment());

	        Developer developer = new Developer("Malik", 102, 75000, "Java");
	        System.out.println("\nDeveloper Details:");
	        EmployeeUtilities.displayEmployeeInfo(developer);
	        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

	        System.out.println("\nUpdating salaries:");
	        EmployeeUtilities.updateEmployeeSalary(manager, 90000);
	        EmployeeUtilities.updateEmployeeSalary(developer, 80000);
	    }
	}



