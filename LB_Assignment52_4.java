import java.io.*;

class Program4
{
    public static void main(String A[]) throws Exception
    {
        int units = 0;
        int billAmount = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter units consumed : ");
        units = Integer.parseInt(bobj.readLine());

        if(units < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(units <= 100)
        {
            billAmount = units * 5;
        }
        else if(units <= 200)
        {
            billAmount = (100 * 5) +
                         ((units - 100) * 7);
        }
        else
        {
            billAmount = (100 * 5) +
                         (100 * 7) +
                         ((units - 200) * 10);
        }

        System.out.println("Total Units Consumed: " + units);
        System.out.println("Total Electricity Bill: ₹" + billAmount);
    }
}