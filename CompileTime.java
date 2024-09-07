package Polymorphism;

public class CompileTime 
{	
		static void login(int mobile_num)
		{
			System.out.println("User can login using mobile number");	
		}
		void login(String email)
		{
			System.out.println("User can login using email");
		}
		public static void main(String[] args) 
		{
			CompileTime ct = new CompileTime();
			login(983929292);
			ct.login("rohi@gmail.com");	
			System.out.println(ct);
		}
	}

