package ankitaG;

public class Program8 {
	static int num1, num2, num3;

	static void setdata(int x, int y)
	{
		num1 = x;
		num2 = y;
		swap();
	}

	static void swap()
	{
		num3 = num1;
		num1 = num2;
		num2 = num3;
	}

	public static void main(String[] args)
	{
		int firstNum = Integer.parseInt(args[0]);
		int SecondNum = Integer.parseInt(args[1]);
		setdata(firstNum, SecondNum);
		System.out.println("before swaping numbers are: " + firstNum + " " + SecondNum+ "\n after swaping numbers are: " + num1 + " " + num2);
	}
}
