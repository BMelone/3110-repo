import java.util.HashSet;

public class AddressBook {
	
	HashSet<BuddyInfo> buddies;
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		AddressBook book = new AddressBook();
		BuddyInfo buddy = new BuddyInfo();
		book.addBuddy(buddy);
		book.removeBuddy(buddy);
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
