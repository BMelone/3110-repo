import java.util.HashSet;

public class AddressBook {
	
	HashSet<BuddyInfo> buddies;
	
	public static void main(String[] args) {
		System.out.println("Address Book");
	}
	
	public AddressBook() {
		buddies = new HashSet<BuddyInfo>();
	}
	
	public boolean removeBuddy(BuddyInfo buddy) {
		return buddies.remove(buddy);
	}
	
	public boolean addBuddy(BuddyInfo buddy) {
		return buddies.add(buddy);
	}
}
