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
			System.out.println("1. Create a New Contact");
			System.out.println("2. Exit");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
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