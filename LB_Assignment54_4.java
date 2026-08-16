import java.io.*;

class Program4
{
    public static void main(String A[]) throws Exception
    {
        int iBudget = 0;
        int iN = 0;
        int iPrice = 0;
        int iCount = 0;
        int iBalance = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter budget amount : ");
        iBudget = Integer.parseInt(bobj.readLine());

        System.out.println("Enter number of items : ");
        iN = Integer.parseInt(bobj.readLine());

        if(iBudget < 0 || iN < 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            iBalance = iBudget;

            for(int i = 1; i <= iN; i++)
            {
                System.out.println("Enter price of item " + i + " : ");
                iPrice = Integer.parseInt(bobj.readLine());

                if(iPrice <= 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }

                if(iPrice <= iBalance)
                {
                    iBalance = iBalance - iPrice;
                    iCount++;
                }
                else
                {
                    break;
                }
            }

            System.out.println("Items Purchased: " + iCount);
            System.out.println("Remaining Balance: ₹" + iBalance);
        }
    }
}