import java.util.Scanner;

public class yinyangstones
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        int num_W = 0;
        int num_B = 0;

        for(int i = 0; i < S1.length();i++)
        {
            if(S1.charAt(i)== 'W')
            {
                num_W++;
            }
            else if(S1.charAt(i)== 'B')
            {
                num_B++;
            }
        }

        if(num_B == num_W)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
