import java.io.*;

class Program5
{
    public static void main(String A[]) throws Exception
    {
        int iIncome = 0;
        double dTax = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter annual income : ");
        iIncome = Integer.parseInt(bobj.readLine());

        if(iIncome < 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(iIncome <= 250000)
            {
                dTax = 0;
            }
            else if(iIncome <= 500000)
            {
                dTax = (iIncome - 250000) * 0.05;
            }
            else if(iIncome <= 1000000)
            {
                dTax = (250000 * 0.05)
                     + ((iIncome - 500000) * 0.20);
            }
            else
            {
                dTax = (250000 * 0.05)
                     + (500000 * 0.20)
                     + ((iIncome - 1000000) * 0.30);
            }

            System.out.println("Annual Income: ₹" + iIncome);
            System.out.println("Total Tax Payable: ₹" + dTax);
        }
    }
}