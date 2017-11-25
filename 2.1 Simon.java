import java.util.Scanner;
public class Simon
{
	public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

	        while(count <=num)
	        {
	        	String s1 = sc.nextLine().toLowerCase();
	        	if(s1.startsWith("simon says"))
	        	{

	        		if (s1.length() >= 11)
					{
						System.out.println(s1.substring(11));
					}
					else
					{
						System.out.println();
					}
	        	}
	        	else
	        	{
	        		System.out.println("");
	        	}
	        	count++;

        }
    }
}
