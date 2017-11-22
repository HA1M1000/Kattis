import java.util.Scanner;
public class Soylent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n[] = new int[t];

        for(int i = 0; i< n.length; i++)
        {
            n[i] = sc.nextInt() + 399;
            System.out.println(n[i]/400);
        }
    }
}
