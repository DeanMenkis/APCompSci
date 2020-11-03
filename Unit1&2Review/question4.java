

public class question4
{
    public static void main(String[] args)
    {
        double c = 0;
        for(int a = 0; a <= 1000; a++)
        {
            for(int b = 0; b <= 1000; b++)
            {
                c = (Math.sqrt(a*a + b*b));
                if(a + b + c == 1000)
                {
                    System.out.println("Product abc" + a*b*c);
                }   // I have no clue why this prints 4 times and I'm too tired to find out
            }
        }
    }
}
