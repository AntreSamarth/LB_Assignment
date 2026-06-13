class Logic
{
    void PrintTable(int num)
    {
        int iCnt = 0;
        int iAns = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iAns = num * iCnt;
            System.out.println(iAns);
        }
    } 
}

class LBAssignment17q5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
    }
}