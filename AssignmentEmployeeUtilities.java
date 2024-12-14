package Project.com.indira.assignment;
import Project.com.indira.assignment.AssignmentEmployee;
import Project.com.indira.assignment.AssignmentManager;
import Project.com.indira.assignment.AssignmentDeveloper;
public class AssignmentEmployeeUtilities {
public static void printEmployeeDetails(Employee employee) {
System.out.println("Employee Name: " + employee.getName());
System.out.println("Employee ID: " + employee.getEmployeeId());
System.out.println("Salary: " + employee.getSalary());
if (employee instanceof Manager) {
AssignmentManager manager = (Manager) Assignmentemployee;
System.out.println("Department: " + manager.getDepartment());
} else if (employee instanceof Developer) {
AssignmentDeveloper developer = (Developer) Assignmentemployee;
System.out.println("Programming Language: " + developer.getProgrammingLanguage());
}
System.out.println();
}
}