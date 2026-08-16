import java.io.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        int N = 0;
        int M = 0;
        int i = 0;
        int j = 0;
        int iSum = 0;
        int iMax = 0;
        int iTopper = 0;
        int iFailed = 0;
        boolean bFailed = false;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of students : ");
        N = Integer.parseInt(bobj.readLine());

        System.out.println("Enter number of subjects : ");
        M = Integer.parseInt(bobj.readLine());

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][M];

        System.out.println("Enter marks : ");

        for(i = 0; i < N; i++)
        {
            for(j = 0; j < M; j++)
            {
                Arr[i][j] = Integer.parseInt(bobj.readLine());

                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        System.out.println("Student Totals:");

        for(i = 0; i < N; i++)
        {
            iSum = 0;

            for(j = 0; j < M; j++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println("Student " + (i + 1) + ": " + iSum);

            if(iSum > iMax)
            {
                iMax = iSum;
                iTopper = i;
            }
        }

        System.out.println();
        System.out.println("Topper: Student " + (iTopper + 1));

        System.out.println();
        System.out.println("Subject Averages:");

        for(j = 0; j < M; j++)
        {
            iSum = 0;

            for(i = 0; i < N; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            double dAverage = (double)iSum / N;

            System.out.printf("Subject %d: %.2f%n",
                              (j + 1), dAverage);
        }

        System.out.println();
        System.out.println("Students Failed:");

        for(i = 0; i < N; i++)
        {
            bFailed = false;

            for(j = 0; j < M; j++)
            {
                if(Arr[i][j] < 35)
                {
                    bFailed = true;
                    break;
                }
            }

            if(bFailed == true)
            {
                System.out.println("Student " + (i + 1));
                iFailed++;
            }
        }
    }
}