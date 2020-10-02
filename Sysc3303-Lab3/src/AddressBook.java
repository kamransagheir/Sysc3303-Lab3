import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	//testing deiting form git
	List<BuddyInfo> buddiesList;
	//testing merging branches
	void testMerging() {
		
		//cjcddsudsfhu
	}
	AddressBook() {
		this.buddiesList = new ArrayList<BuddyInfo>();

	}

	public void addBuddy(BuddyInfo newBuddy) {
		if (newBuddy != null) {
			this.buddiesList.add(newBuddy);
		}

	}

	public BuddyInfo removeBuddy(int index) {
		if (index > -0 && index < buddiesList.size()) {
			return this.buddiesList.remove(index);

		}
		return null;

	}
	public int size() {
		return buddiesList.size();
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof BuddyInfo)) {
			return false;
		}
		//BuddyInfo bi = (BuddyInfo) o;
		//return (bi.getName().equals(this.name) && bi.getAddress().equals(this.address) && bi.getPhoneNo().equals(this.phone));
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println("Test!");
		BuddyInfo budInfo = new BuddyInfo("Tom", "Carleton", "");
		AddressBook adBook = new AddressBook();
		adBook.addBuddy(budInfo);
		adBook.removeBuddy(0);
	}

}
