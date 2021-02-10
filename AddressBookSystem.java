package addbook;
import java.util.*;

public class AddressBookSystem 
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
			System.out.println("2. Exit");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0 :
					System.out.println(addbook1);
					break;
					
				case 1 :
					System.out.println("Enter contact details");
					contactCreation();
					break;
					
				case 2 :
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
