package Project.com.indira.assignment;

public class AssignmentManager extends AssignmentEmployee {
private String department;
public AssignmentManager(String name, int employeeId, double salary, String department) {
super(name, employeeId, salary);
this.department = department;
} public String getDepartment() {
return department;
} public void setDepartment(String department) {
this.department = department;
}
}