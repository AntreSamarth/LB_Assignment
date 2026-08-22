import java.util.*;

class Matrix
{
    public int Arr[][];
    public int iRow;
    public int iCol;

    public Matrix(int iRow, int iCol)
    {
        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Matrix is : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int iZero = 0;
        int iCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                iCount++;

                if(Arr[i][j] == 0)
                {
                    iZero++;
                }
            }
        }

        if(iZero > (iCount / 2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program881
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        if(mobj.ChkSparse(mobj.Arr, iRow, iCol))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}