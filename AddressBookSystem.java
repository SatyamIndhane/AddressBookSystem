package addbook;
import java.util.*;

public class AddressBookSystem 
{	
	static Scanner sc = new Scanner(System.in);
	static ArrayList addbook1 = new ArrayList();
	
	public static void main(String[] args)
	{
		boolean quit = true;
		int choice = 0;
		System.out.println("Welcome to AddressbOOkSystem");
		while( quit != false )
		{
			System.out.println("Choose option");
			System.out.println("0. Print the address book");
			System.out.println("1. Create a New Contact");
			System.out.println("2. Edit a Contact");
			System.out.println("3. Remove a Contact");
			System.out.println("4. Exit");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0 :
					System.out.println(addbook1);
					break;
				case 1 :
					contactCreation();
					break;
				case 2 :
					editContact();
					break;
				case 3:
					deleteContact();
					break;
				case 4 :
					quit = false;
					break;
			}
		}
		
	}
	
	public static void contactCreation()
	 {
		 System.out.println("Enter first name\r"); 
		 Create.fname=sc.next();
		 addbook1.add(Create.fname);
		 
		 System.out.println("Enter last name\r"); 
		 Create.lname=sc.next();
		 addbook1.add(Create.lname);
		 
		 System.out.println("Enter address\r"); 
		 Create.address=sc.next();
		 addbook1.add(Create.address);
		 
		 System.out.println("Enter state\r"); 
		 Create.state=sc.next();
		 addbook1.add(Create.state);
		 
		 System.out.println("Enter zip\r"); 
		 Create.zip=sc.nextInt();
		 addbook1.add(Create.zip);
		 
		 System.out.println("Enter phone number\r"); 
		 Create.ph=sc.nextInt();
		 addbook1.add(Create.ph);
		 
		 System.out.println("Enter email\r"); 
		 Create.email=sc.next();
		 addbook1.add(Create.email);
		 
		 System.out.println(addbook1);
	 }
	
	public static void editContact()
	{
		System.out.println("Please input the first name");
		String input = sc.next();
		
		boolean exists = addbook1.contains(input);
		
		if ( exists == true && input.equals(addbook1.get(0)))
		{
			System.out.println("Which detail to edit Please enter option\r");
			System.out.println("1. Editing first name\r");
			System.out.println("2. Editing last name\r");
			System.out.println("3. Editing address\r");
			System.out.println("4. Editing city\r");
			System.out.println("5. Editing state\r");
			System.out.println("6. Editing zip\r");
			System.out.println("7. Editing phone number\r");
			System.out.println("8. Editing email\r");
			int option = sc.nextInt();
			switch(option)
				{
					case 1:
						addbook1.set(addbook1.indexOf(Create.fname), sc.next());
						break;
					case 2:
						addbook1.set(addbook1.indexOf(Create.lname), sc.next());
						break;
					case 3:
						addbook1.set(addbook1.indexOf(Create.address), sc.next());
						break;
					case 4:
						addbook1.set(addbook1.indexOf(Create.city), sc.next());
						break;
					case 5:
						addbook1.set(addbook1.indexOf(Create.state), sc.next());
						break;
					case 6:
						addbook1.set(addbook1.indexOf(Create.zip), sc.next());
						break;
					case 7:
						addbook1.set(addbook1.indexOf(Create.ph), sc.next());
						break;
					case 8:
						addbook1.set(addbook1.indexOf(Create.email), sc.next());
						break;
				}
		}
		
		else
		{
			System.out.println("This name doesn't exist");
		}
		
		System.out.println(addbook1);
	}
	
	public static void deleteContact()
	{
		System.out.println("Please input Contact first name to delete him");
		String input = sc.next();
		
		boolean exists = addbook1.contains(input);
		
		if( exists == true && input.equals(addbook1.get(0)))
		{
			System.out.println("Confirm delete ");
			addbook1.clear();
		}
		
		else
		{
			System.out.println("This name doesn't exist");
		}
		
		System.out.println(addbook1);
	}

}

class Create
{
	static String fname;
	static String lname;
	static String address;
	static String city;
	static String state;
	static int zip;
	static int ph;
	static String email;
	
	Create(String fname, String lname, String address, String city, String state, int zip, int ph,
			String email)
	{
		Create.fname = fname;
		Create.lname = lname;
		Create.address = address;
		Create.city = city;
		Create.state = state;
		Create.zip = zip;
		Create.ph = ph;
		Create.email = email;
	}
	
	public void display()
	{
		System.out.println("First name : "+fname+"\rLast name : "+lname+"\rAddress :" +address+"\rcity : "
				+city+"\rstate : "+state+"\rzip : "+zip+"\rph : "+ph+"\remail : "+email);
	}
}