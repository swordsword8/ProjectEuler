public class Number9SpecialPythagoreanTriplet
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int tripletSum = 0;
        while (tripletSum != 1000)
        {
            b++;
            for (int i = 0; i < b; i++)
            {
                int sum =  i*i + b*b;
                double evenCheck = Math.sqrt(sum);
                for (int j = 0; j <= evenCheck; j++)
                {
                    if (j*j == sum && j > b)
                    {
                        c = j;
                        a = i;
                        tripletSum = a + b + c;
                        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
                        System.out.println("Triplet sum: " + tripletSum);
                        System.out.println("Product abc: " + a*b*c);
                    }
                }
            }

        }
        
    }
}
