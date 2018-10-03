
public class Employee extends Person {
	
	
	private String first;
	private String last;
	private String ssn;
	
	
	public Employee(String first, String last, String ssn) {
		super();
		this.first = first;
		this.last = last;
		this.ssn = ssn;
			
	}

	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	@Override
	public String toString() {
		return "Employee [first=" + first + ", last=" + last + ", ssn=" + ssn + "]";
	}
	

}
