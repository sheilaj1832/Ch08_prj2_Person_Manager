
public class Customer extends Person {

	private String first;
	private String last;
	private String number;
	
	
	public Customer(String first, String last, String number) {
		super();
		this.first = first;
		this.last = last;
		this.number = number;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Customer [first=" + first + ", last=" + last + ", number=" + number + "]";
	}
	
	

}
