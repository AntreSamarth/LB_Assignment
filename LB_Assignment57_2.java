import java.io.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        int R = 0;
        int C = 0;
        int i = 0;
        int j = 0;
        int iCount = 0;
        int iMax = 0;
        int iMaxRow = 0;
        boolean bFull = false;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of rows : ");
        R = Integer.parseInt(bobj.readLine());

        System.out.println("Enter number of columns : ");
        C = Integer.parseInt(bobj.readLine());

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[R][C];

        System.out.println("Enter seat status : ");

        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                Arr[i][j] = Integer.parseInt(bobj.readLine());

                if(Arr[i][j] != 0 && Arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        for(i = 0; i < R; i++)
        {
            iCount = 0;

            for(j = 0; j < C; j++)
            {
                if(Arr[i][j] == 1)
                {
                    iCount++;
                }
            }

            if(iCount > iMax)
            {
                iMax = iCount;
                iMaxRow = i;
            }
        }

        iCount = 0;

        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                if(Arr[i][j] == 1)
                {
                    iCount++;
                }
            }
        }

        for(i = 0; i < R; i++)
        {
            bFull = true;

            for(j = 0; j < C; j++)
            {
                if(Arr[i][j] == 0)
                {
                    bFull = false;
                    break;
                }
            }

            if(bFull == true)
            {
                break;
            }
        }

        System.out.println("Total Booked Seats: " + iCount);

        System.out.println("Row With Maximum Bookings: Row "
                           + (iMaxRow + 1));

        if(bFull == true)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }

        System.out.println("Seat Matrix:");

        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}