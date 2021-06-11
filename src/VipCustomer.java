
public class VipCustomer {

	private String name;
	private double creditsLimit;
	private String email;

	public VipCustomer() {
		this.name = "default";
		this.creditsLimit = 10000.0;
		this.email = "default@email.com";
	}

	public VipCustomer(String name, double creditsLimit) {
		this.name = name;
		this.creditsLimit = creditsLimit;
	}
	
	public VipCustomer(String name, double creditsLimit, String email) {
		this.name = name;
		this.creditsLimit = creditsLimit;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCreditsLimit() {
		return this.creditsLimit;
	}
	
	public String getEmail() {
		return this.email;
	}
	
}
