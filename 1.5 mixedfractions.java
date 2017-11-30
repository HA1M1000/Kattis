import java.util.Scanner;
public class mixedfractions
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		while(a !=0 && b!=0)
		{
			int whole_num = a/b;
			int remainder = a%b;
			System.out.println(whole_num + " " + remainder+ " / "+ b);

			a = sc.nextInt();
			b = sc.nextInt();
		}
	}
}
