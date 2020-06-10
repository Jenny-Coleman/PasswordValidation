import java.util.Scanner;

public class pswdValidation {
	
	public static boolean valid(String pswd) {
		boolean len = false;
		boolean charact = true;
		int count = 0;
		
		if (pswd.length() >=  8)
		{
			len = true;
		}
		
		for (int i=0; i<pswd.length(); i++)
		{
			if (!Character.isLetterOrDigit(pswd.charAt(i)))
			{
				charact = false;
			}
			
			if (Character.isDigit(pswd.charAt(i)))
			{
				count++;
			}
		}
		
		if (!len || !charact || !(count >= 2))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. A password must have at least eight characters. \r\n" + 
				"2. A password consists of only letters and digits. \r\n" + 
				"3. A password must contain at least two digits \r\n" + 
				"Input a password (You are agreeing to the above Terms and Conditions.): ");
		
		String pswd = sc.nextLine();
		
		if (valid(pswd))
		{
			System.out.println("Password is valid: " + pswd);
		}
		else
		{
			System.out.println("Password is not valid: " + pswd);
		}
	}
}
