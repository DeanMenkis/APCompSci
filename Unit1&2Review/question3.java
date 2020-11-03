

public class question3
{
    public static void main(String[] args)
    {
        int sum = 0;
        int sqsum = 0;
        int answer = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
            sqsum = sqsum + i * i;
            if(i == 100)
            {
                sum = sum * sum;
                answer = sum - sqsum;
            }
        }
        System.out.println(answer);
    }
}
