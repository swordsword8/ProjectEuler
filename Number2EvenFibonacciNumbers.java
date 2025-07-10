public class Number2EvenFibonacciNumbers
{
    public static void main(String[] args)
    {
        int term1 = 1;
        int term2 = 2;
        int sum = 0;
        int sumEven = 2;
        do
        {
            sum = term1 + term2;
            if(sum % 2 == 0)
            {
                sumEven += sum;
            }
            term1 = term2;
            term2 = sum;
        }while(sum < 4000000);
        System.out.print("\nsumEven: " + sumEven);

    }
}