package Assignments;

public class Employee {
	    @Override
	public String toString() {
		return "Employee [EmployeeSalary=" + EmployeeSalary + ", EmployeeName=" + EmployeeName + ", EmployeeId="
				+ EmployeeId + "]";
	}
		private int EmployeeSalary;
	    @ChangeValue (value="Name")
	    private String EmployeeName;
	    private int EmployeeId;
		public Employee(int employeeSalary, String employeeName, int employeeId) {
			EmployeeSalary = employeeSalary;
			EmployeeName = employeeName;
			EmployeeId = employeeId;
		}
		public Employee() {
			  this.EmployeeName= "";
		}
		public int getEmployeeSalary() {
			return EmployeeSalary;
		}

		public void setEmployeeSalary(int employeeSalary) {
			EmployeeSalary = employeeSalary;
		}

		public String getEmployeeName() {
			return EmployeeName;
		}

		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}

		public int getEmployeeId() {
			return EmployeeId;
		}
		public int  setEmployeeId(int employeeId) {
			return EmployeeId = employeeId;
		}
	}
