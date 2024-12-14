package Project.com.indira.assignment;
public class AssignmentDeveloper extends AssignmentEmployee {
private String programmingLanguage;
public AssignmentDeveloper(String name, int employeeId, double salary, String programmingLanguage) {
super(name, employeeId, salary);
this.programmingLanguage = programmingLanguage;
}
public String getProgrammingLanguage() {
return programmingLanguage;
} public void setProgrammingLanguage(String programmingLanguage) {
this.programmingLanguage = programmingLanguage;
}
}