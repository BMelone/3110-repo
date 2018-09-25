/**
 * Lab 1
 * 
 * @author Benjamin Melone
 * @author 101034994
 * @date September 11, 2018
 */
public class BuddyInfo {

	private String name;
	private long phoneNumber;
	private String address;
	
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");
		System.out.println("Hello " + buddy.getName());
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
