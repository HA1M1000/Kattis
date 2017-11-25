import java.math.*;
import java.util.Scanner;
public class different
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong())
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            System.out.println(Math.abs(x-y));
        }
    }
}
