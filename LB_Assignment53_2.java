import java.io.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        int iAge = 0;
        int iIncome = 0;
        int iCreditScore = 0;
        String strLoan = null;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter age : ");
        iAge = Integer.parseInt(bobj.readLine());

        System.out.println("Enter monthly income : ");
        iIncome = Integer.parseInt(bobj.readLine());

        System.out.println("Enter credit score : ");
        iCreditScore = Integer.parseInt(bobj.readLine());

        System.out.println("Existing unpaid loan (Yes/No) : ");
        strLoan = bobj.readLine();

        if(iAge < 0 || iIncome < 0 || iCreditScore < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(!strLoan.equalsIgnoreCase("Yes") &&
                !strLoan.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Input");
        }
        else if(iAge < 21 || iAge > 60)
        {
            System.out.println("Loan Rejected: Age criteria not satisfied");
        }
        else if(iIncome < 25000)
        {
            System.out.println("Loan Rejected: Monthly income is less than ₹25,000");
        }
        else if(iCreditScore < 700)
        {
            System.out.println("Loan Rejected: Credit score is less than 700");
        }
        else if(strLoan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}