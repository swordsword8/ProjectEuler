public class Number5SmallestMultiple {
    public static void main(String[] args)
    {
        boolean check = false;
        int count = 9;
        while(!check)
        {
            count++;
            int modulusSum = count%2 + count%3 + count%4 + count%5 + count%6 + count%7 + count%8 + count%9 + count%10
                    + count%11 + count%12 + count%13 + count%14 + count%15 + count%16 + count%17 + count%18 + count%19 + count%20;
            if(modulusSum == 0)
            {
                check = true;
            }
        }
        System.out.print(count);
    }
}