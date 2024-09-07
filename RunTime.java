package Polymorphism;
class Google
{
	void launchApp()
	{
		System.out.println("Launch the Google first");
	}
}
public class RunTime extends Google
{
	void launchApp()
	{
		super.launchApp();
		System.out.println("After Google, launch Amazon");
	}
	public static void main(String[] args)
	{
	RunTime rt = new RunTime();
	rt.launchApp();
	}
}