public class Number6SumSquareDifference
{
    public static void main(String[] args)
    {
        int sumOfSquares = 0;
        int squareOfSums = 0;
        int differenceOfSums = 0;

        for(int i = 1; i <= 100; i ++)
        {
            sumOfSquares += i*i;
        }
        for(int i = 1; i <= 100; i ++)
        {
            squareOfSums += i;
        }
        squareOfSums = squareOfSums*squareOfSums;
        differenceOfSums = squareOfSums - sumOfSquares;
        System.out.print(differenceOfSums);
    }
}