import java.io.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        int iMarks = 0;
        int iAttendance = 0;
        int iIncome = 0;

        BufferedReader bobj =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter marks percentage : ");
        iMarks = Integer.parseInt(bobj.readLine());

        System.out.println("Enter attendance percentage : ");
        iAttendance = Integer.parseInt(bobj.readLine());

        System.out.println("Enter family income : ");
        iIncome = Integer.parseInt(bobj.readLine());

        if(iMarks < 0 || iMarks > 100 ||
           iAttendance < 0 || iAttendance > 100 ||
           iIncome < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(iMarks < 80)
        {
            System.out.println("Scholarship Rejected: Marks criteria not satisfied");
        }
        else if(iAttendance < 75)
        {
            System.out.println("Scholarship Rejected: Attendance criteria not satisfied");
        }
        else if(iIncome > 300000)
        {
            System.out.println("Scholarship Rejected: Family income exceeds ₹3,00,000");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }
}