public class Number7_10001stPrime
{
    public static void main(String[] args)
    {
        int primeCount = 2;
        int currentNumber = 3;
        do
        {
            boolean primeChecker = true;
            currentNumber += 2;
            for(int i = 3; i < currentNumber/2; i += 2)
            {
                if (currentNumber % i == 0)
                {
                    primeChecker = false;
                    break;
                }
            }
            if(primeChecker)
            {
                primeCount++;
            }
        }while(primeCount < 10001);
        System.out.println("Number: " + currentNumber + " prime spot: " + primeCount);
    }

}