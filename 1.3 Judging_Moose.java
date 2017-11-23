import java.util.Scanner;
public class Judging_Moose
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();
    int R = sc.nextInt();
    int sum = L + R;

    if(L != R || R != L)
    {
      if(L > R)
      {
        System.out.println("Odd " + L*2);
      }
      else
      {
        System.out.println("Odd " + R*2);
      }
    }
    else if(L == 0 && R == 0)
    {
      System.out.println("Not a moose");
    }
    else if(L == R)
    {
      System.out.println("Even " + R*2 );
    }


  }
}
