
public class BuddyInfo {
	String name = "";
	String Address = "";
	String phoneNo = "";
	
	public BuddyInfo() {
		
	}

	public BuddyInfo(String name, String address, String phoneNo) {
		this.name = name;
		this.Address = address;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo budInfo = new BuddyInfo();
		budInfo.setName("Homer");
		System.out.println("Hello " + budInfo.getName());

	}

}
