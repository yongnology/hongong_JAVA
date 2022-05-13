package sec01.exam05;

public class SamrtPhone {
	private String company;
	private String os;
	
	public SamrtPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return company + "," + os;
	
	}
}
