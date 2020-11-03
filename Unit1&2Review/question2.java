

public class question2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int f1 = 0;
        int f2 = 1;
        for(int i = 0; i < 4000000; i = f1 + f2)
        {
            if (i % 2 == 0) sum += i;
            f1 = f2;
            f2 = i;
        }
        System.out.println(sum);
    }
}
