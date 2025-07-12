public class Number4LargestPalindromeProduct
{
    public static void main(String[] args)
    {
        int largestPalindrome = 0;
        int firstFactor = 0;
        int secondFactor = 0;
        for(int i = 100; i <= 913; i ++)
        {
            for(int j = 100; j <= 993; j++)
            {
                String numToString = Integer.toString(i*j);
                char[] stringToCharArray = numToString.toCharArray();
                int[] numberStore = new int[stringToCharArray.length];

                for(int k = 0; k < stringToCharArray.length; k++)
                {
                    numberStore[k] = stringToCharArray[k];
                }

                boolean results = checkPalindrome(numberStore);
                if(results)
                {
                    if(i*j > largestPalindrome)
                    {
                        largestPalindrome = i*j;
                    }
                    firstFactor = i;
                    secondFactor = j;
                }
            }
        }
        System.out.println(largestPalindrome + "\nFirst factor: " + firstFactor + "\nSecond factor: " + secondFactor);
    }

    public static boolean checkPalindrome(int[] storedIntArray)
    {
        int checkBackHalf = storedIntArray.length;
        boolean matchingNumber = true;
        for(int i = 0; i < storedIntArray.length/2; i++)
        {
            checkBackHalf -= 1;
            if(storedIntArray[i] != storedIntArray[checkBackHalf])
            {
                matchingNumber = false;
            }

        }
        return matchingNumber;
    }
}