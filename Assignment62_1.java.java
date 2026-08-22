import java.util.*;

class Program877
{
    public static int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0;

        for(int i = 0; i < iRow && i < iCol; i++)
        {
            iSum = iSum + Arr[i][i];
        }

        return iSum;
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

        int iRet = AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements is : " + iRet);
    }
}