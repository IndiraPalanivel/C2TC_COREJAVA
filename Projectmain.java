package Project.com.indira.assignment;
import Project.com.indira.assignmnet.AssignmentManager;
import Project.com.indira.assignmnet.AssignmentDeveloper;
import Project.com.indira.assignmnet.AssignmentEmployeeUtilities;
public class projectmain {
public static void main(String[] args) {
AssignmentManager manager = new AssignmentManager("John", 101, 90000, "Sales");
AssignmentDeveloper developer = new AssignmentDeveloper("Alice", 102, 80000, "Java");
AssignmentEmployeeUtilities.printEmployeeDetails(manager);
AssignmentEmployeeUtilities.printEmployeeDetails(developer);
}
}
