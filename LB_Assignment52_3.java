import java.io.*;

class Program3
{
    public static void main(String A[]) throws Exception
    {
        int marks = 0;
        int iSum = 0;
        double dAverage = 0;
        boolean bFailed = false;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Enter marks of subject " + i + " : ");
            marks = Integer.parseInt(bobj.readLine());

            if(marks < 0 || marks > 100)
            {
                System.out.println("Invalid Input");
                return;
            }

            iSum = iSum + marks;

            if(marks < 35)
            {
                bFailed = true;
            }
        }

        if(bFailed == true)
        {
            System.out.println("Result: Fail");
        }
        else
        {
            dAverage = (double)iSum / 5;

            System.out.println("Average Marks: " + dAverage);

            if(dAverage >= 75)
            {
                System.out.println("Final Result: Distinction");
            }
            else if(dAverage >= 60)
            {
                System.out.println("Final Result: First Class");
            }
            else if(dAverage >= 50)
            {
                System.out.println("Final Result: Second Class");
            }
            else
            {
                System.out.println("Final Result: Pass");
            }
        }
    }
}