package package addbook;
import java.util.*;

public class public class AddressBookSystem 
{	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Create> addbook1 = new ArrayList<Create>();
	
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
			 Create person = new Create(null, null, null, null, null, 0, 0, null);
			 System.out.println("Enter first name\r"); 
			 person.fname=sc.next();
			 
			 System.out.println("Enter last name\r"); 
			 person.lname=sc.next();
			 
			 System.out.println("Enter address\r"); 
			 person.address=sc.next();
			 
			 System.out.println("Enter city\r"); 
			 person.city=sc.next();
			 
			 System.out.println("Enter state\r"); 
			 person.state=sc.next();
			 
			 System.out.println("Enter zip\r"); 
			 person.zip=sc.nextInt();
			 
			 System.out.println("Enter phone number\r"); 
			 person.ph=sc.nextInt();
			 
			 System.out.println("Enter email\r"); 
			 person.email=sc.next();
			 
			 addbook1.add(person);
			 System.out.println(person.toString());
		 	
	 }
	
	public static void editContact()
	{
		System.out.println("Please input the first name");
		String input = sc.next();
		int flag = 0;
		
		for (int i=0; i<addbook1.size(); i++)
		{
			if ( addbook1.get(i).fname.equals(input) )
			{
				flag = 1;
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
							System.out.println("Insert first name\r");
							addbook1.get(i).fname = sc.next();
							break;
						case 2:
							System.out.println("Insert last name\r");
							addbook1.get(i).lname = sc.next();
							break;
						case 3:
							System.out.println("Insert address\r");
							addbook1.get(i).address = sc.next();
							break;
						case 4:
							System.out.println("Insert city\r");
							addbook1.get(i).city = sc.next();
							break;
						case 5:
							System.out.println("Insert state\r");
							addbook1.get(i).state = sc.next();
							break;
						case 6:
							System.out.println("Insert zip\r");
							addbook1.get(i).zip = sc.nextInt();
							break;
						case 7:
							System.out.println("Insert phone number\r");
							addbook1.get(i).ph = sc.nextInt();
							break;
						case 8:
							System.out.println("Insert email\r");
							addbook1.get(i).email = sc.next();
							break;
					}
			}
		}
		if ( flag != 1 )
		{
			System.out.println("Please enter valid first name");
		}
	}
	public static void deleteContact()
	{
		System.out.println("Please input Contact first name to delete him");
		String input = sc.next();
		int flag = 0;
				
		for (int i=0; i<addbook1.size(); i++)
		{
			flag = 1;
			if( input.equals(addbook1.get(i).fname))
			{
				System.out.println("Confirm delete ");
				addbook1.remove(i);
			}
			
		}
		if ( flag !=1 )
		System.out.println("This name doesn't exist");
		
	}

}

class Create
{
	 String fname;
	 String lname;
	 String address;
	 String city;
	 String state;
	 int zip;
	 int ph;
	 String email;
	
	Create(String fname, String lname, String address, String city, String state, int zip, int ph,
			String email)
	{
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.ph = ph;
		this.email = email;
	}
	
	
	public String toString()
	{
		return "\rFirst name : "+this.fname+"\rLast name : "+this.lname+"\rAddress :" +this.address+"\rcity : "
				+this.city+"\rstate : "+this.state+"\rzip : "+this.zip+"\rph : "+this.ph+"\remail : "
				+this.email+"\r";
	}
	
}
