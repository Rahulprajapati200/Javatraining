package Assignment4;
import java.util.Arrays;
import java.util.List;

class Employee{
	  private String name;
	  private Integer age;
	  public Employee(String name, Integer age){
	    this.name=name;
	    this.age=age;
	  } 
		  //getters and setters for name and age attributes go here
		  //overridden equals() and hashcode() go here
	  public String toString(){
	    return "Employee Name:"+this.name
	      +"  Age:"+this.age;
		  }
		public int getAge() {
			// TODO Auto-generated method stub
			return 0;
		}
		}
		//MatchingWithStreams.java
		public class Q7MatchInStream {
		  static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 22),
		      new Employee("Deborah Sprightly", 29));
		 
		 public static void main(String[] args) {
		    boolean allEmpAbove21 = employeeList.stream()
		                           .allMatch(emp -> emp.getAge() > 21);

		    boolean anyEmpAbove21 = employeeList.stream()
		                           .anyMatch(emp -> emp.getAge() > 21);
		    

		    boolean noneEmpAbove21 = employeeList.stream()
		                           .noneMatch(emp -> emp.getAge() > 21);
		    
		    System.out.println("All employees are above 21:" + allEmpAbove21);
		    System.out.println("Any employees are above 21:" + anyEmpAbove21);
		    System.out.println("None employee is above 21:" + noneEmpAbove21);
	  }
}