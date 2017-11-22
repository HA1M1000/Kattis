import java.util.Scanner;
public class Simon_Says
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        String array[] = new String[sc.nextInt()+1];

        for(int i = 0; i< array.length; i++)
        {   
            array[i] = sc.nextLine().toLowerCase();
            if(array[i].startsWith("simon says"))
            {
              System.out.println(array[i].substring(11));
            }   
        }
    }        
}
