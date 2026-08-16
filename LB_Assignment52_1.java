import java.io.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        int daysKept = 0;
        int fineAmount = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter total number of days book was kept : ");
        daysKept = Integer.parseInt(bobj.readLine());

        if(daysKept < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(daysKept <= 7)
        {
            fineAmount = 0;
        }
        else if(daysKept <= 12)
        {
            fineAmount = (daysKept - 7) * 5;
        }
        else
        {
            fineAmount = (5 * 5) + ((daysKept - 12) * 10);
        }

        if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else
        {
            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }
    }
}