import java.util.Scanner;
public class Above_Average
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int run = sc.nextInt();
        double averag[] = new double[run];

        for(int i = 0;i< run; i++)
        {
            double total = 0;
            int size =sc.nextInt();
            int clas[] = new int[size];

            for(int j = 0; j< clas.length; j++)
            {
                clas[j] = sc.nextInt();
                total += clas[j];
            }
            double av = total/size;

            int grater = 0;
            for(int j = 0; j< clas.length; j++)
            {
                if(clas[j]>av)
                {
                    grater++;
                }

            }
            averag[i] = 100*(grater/(double)size);

        }
        for(Double x : averag) System.out.printf("%.3f%s\n" ,x, "%");


    }
}
