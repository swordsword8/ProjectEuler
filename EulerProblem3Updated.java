public class EulerProblem3Updated
{
    public static void main(String[] args)
    {
        long largestPrimeNumber = 0;
        long number = 600851475143L;

        /*Removes factors that have 2 in order to reduce size. Even factors greater than 2 are not prime, so they can be
        exterminated. Doesn't apply to this specific number but useful to know. Other numbers can be divided as well
        until there is a factor that is larger than the square root of the number. With the smaller number less than
         or equal to the square root already having been tested meaning they don't fit into the number, and can't
         multiply the larger factor to get the number.*/
        while (number % 2 == 0)
        {
            number /= 2;
            largestPrimeNumber = 2;
        }

        /*a*b equals the larger number it's a part of. If the number is 100 and you square root it then you get 10.
        10*10 = 100. If you want to change the 10 then you have to increase one and decrease the other. If you make 10
        into 25 then the other 10 becomes 4. Make 10 into 4 and the other becomes 25. Square rooting the whole number
        shortens the searching process as there are fewer numbers to sift through. The numbers less than or equal to
        the square root are already used and therefore a larger factor than the square root can't use a factor less than
        or equal to the square root. With 2 the only even factor take care of then only odd factors have to be checked.
        Cutting down on time. Then dividing remove factors shrinking the number.*/
        for (long i = 3; i <= Math.sqrt(number); i += 2)
        {
            if (number % i == 0)
            {
                largestPrimeNumber = i;
                number /= i;
            }
        }

        if (number > 2)
        {
            largestPrimeNumber = number;
        }

        System.out.print(largestPrimeNumber);

    }
}