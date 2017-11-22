import java.util.Scanner;
public class Pot
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int N[] = new int[sc.nextInt()];
        int count = 0;
        for(int i = 0; i< N.length; i++)
        {
            N[i] = sc.nextInt();
            N[i] = (int)Math.pow(N[i]/10,N[i]%10);
            count += N[i];
        }

        System.out.println(count);
    }
}
