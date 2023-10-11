import java.util.*;
public class generator
{
	static generator obj = new generator();
	Alphabets ap = new Alphabets();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to my password Generator:");
		System.out.println("here are the option you can take");
		obj.mainLoop();
	}
	public void mainLoop()
	{
		System.out.println("1. Generate Password");
		System.out.println("2. Useful Details");
		System.out.println("3. Quit");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				obj.Generate_password();
				break;
			}
			case 2:
			{
				obj.Useful_Details();
				break;
			}
			case 3:
			{
				obj.goodbye();
				break;
			}
			default:
			{
				System.out.println("Invaild Input");
				System.out.println("Lets get over with it again");
				obj.mainLoop();
				break;
				
			}
		}
	}
	public void Generate_password()
		{
			boolean Uppercase = false;
			boolean Lowercase = false;
			boolean Numbers = false;
			boolean symbol = false;
			System.out.println("enter the length of password you want:");
			int n = sc.nextInt();
			System.out.println("do you want to add Uppercase letters i.e ABCD....");
			String s = sc.nextLine();
			s = sc.nextLine();
			if(s.equalsIgnoreCase("YES"))
			{
				Uppercase = true;
			}
			System.out.println("do you want add Lowercase letters i.e. abcd....");
			String s1 = sc.nextLine();
			s = s1;
			if(s.equalsIgnoreCase("YES"))
			{
				Lowercase = true;
			}
			System.out.println("do you want to add numbers i.e. 1234...");
			s = sc.nextLine();
			if(s.equalsIgnoreCase("YES"))
			{
				Numbers = true;
			}
			System.out.println("do you want to add Special characters i.e. !@#$....");
			s = sc.nextLine();
			if(s.equalsIgnoreCase("YES"))
			{
				symbol = true;
			}
			ap.Alphabets(Uppercase , Lowercase , Numbers , symbol);
			StringBuilder pass = new StringBuilder();
				String b = ap.getAlphabet();
				int max = b.length() - 1;
				int min = 0;
				int range = max - min + 1;
				if(b.isEmpty())
				{
					obj.ErrorMessage();
				}
				else
				{

					for (int i = 0; i < n; i++) 
					{
						int index = (int) (Math.random() * range) + min;
						pass.append(b.charAt(index));
					}
					System.out.println("Here is your Password --> " + pass);
				}
		}
		public void ErrorMessage()
		{
			String c;
			System.out.println("you have to choose at least one option for letters or characters");
			System.out.println("Do you want to do it again:");
			c = sc.nextLine();
			if(c.equalsIgnoreCase("YES"))
			{
				obj.Generate_password();
			}
			else 
			{
				obj.goodbye();
			}
		}
		public void Useful_Details()
		{
			System.out.println("A strong password must contain all the uppercase letters, lowercase letters , numbers , special characters");
			System.out.println(" A strong password must have length of 8 characters or above");
			System.out.println("and last Avoid using same password on different platform.");
		}
		public void goodbye()
		{
			System.out.println("Thank you for using my service ");
			System.out.println("Hope you will come back.");
		}
}