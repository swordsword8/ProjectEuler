//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MultiplesOf3Or5
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 0; i < 1000; i++)
        {
            if (i % 3 == 0)
            {
                sum += i;
            } else if (i % 5 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

