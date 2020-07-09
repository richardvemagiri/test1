import java.util.LinkedList;


public class UserRecords {
	
	UserRecords(){
		LinkedList<User> users = new LinkedList<User>();
	}
	
	private LinkedList<User> users;
	

	public LinkedList<User> getUsers() {
		return users;
	}

	public void setUsers(User u1) {
		this.users.add(u1);
	}
	
	

}
