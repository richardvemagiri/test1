import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Printing menu
		 */
		
		System.out.println("1. Create a user");
		System.out.println("2. Delete a user");
		System.out.println("3. Quit");
		
		Scanner sc= new Scanner(System.in);
		
		int input = sc.nextInt();
		
		UserRecords ur = new UserRecords();
		
		switch(input){
			
		case 1:
			/*
			 * Create a user
			 */
			System.out.println("Enter First Name: ");
			Scanner sc2 = new Scanner(System.in);
			String fname = sc2.next();
			
			User u1 = new User();
			
			u1.setFirstName(fname);
			ur.setUsers(u1);
			
			break;
		case 2:
			/*
			 * Delete a user
			 */
			System.out.println("Enter First Name: ");
			Scanner sc3 = new Scanner(System.in);
			String dfname = sc3.next();
			
			System.out.println("Deletion is not available at this point");
			break;
			
		case 3:
			break;
			
			
			
			
		}
		
	}

}
