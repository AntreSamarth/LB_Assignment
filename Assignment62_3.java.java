import java.util.*;

class Program879
{
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iMax = Arr[0][0];

        for(int i = 0; i < iRow && i < iCol; i++)
        {
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }

            if(Arr[i][iCol - i - 1] > iMax)
            {
                iMax = Arr[i][iCol - i - 1];
            }
        }

        return iMax;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Largest number from both diagonals is : " + iRet);
    }
}