public class Number3LargestPrimeFactor
{
    public static void main(String[] args)
    {
        long largestPrime = 0;
        for (long i = 1; i <= 600851475143L/2; i++)
        {
            if(600851475143L%i == 0)
            {
                boolean checkPrime = true;
                if (i == 1)
                {
                    checkPrime = false;
                }
                else if (i == 2 || i == 3)
                {
                    System.out.println(i);
                    largestPrime = i;
                }
                else
                {
                    for(int j = 2; j <= i/2; j++)
                    {
                        if (i %j  == 0)
                        {
                            checkPrime = false;
                            break;
                        }
                    }
                }
                if (checkPrime)
                {
                    largestPrime = i;
                    System.out.println(largestPrime);

                }
            }
        }
        System.out.println("hello");
    }
}