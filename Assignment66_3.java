import java.io.*;
import java.net.*;

class Program943
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("------------------------------------------");
            System.out.println("--------Marvellous Server Started---------");
            System.out.println("------------------------------------------");

            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client connected successfully");

                Thread t = new Thread(() ->
                    HandleClientRequest(clientsocket));

                t.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis =
                new DataInputStream(socket.getInputStream());

            DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command received : " + command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    if(parts.length != 1)
                    {
                        dos.writeUTF("Usage : QUIT");
                        continue;
                    }

                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                int iNo = Integer.parseInt(parts[1]);

                if(operation.equals("EVEN"))
                {
                    if(CheckEven(iNo))
                    {
                        dos.writeUTF(iNo + " is an Even Number");
                    }
                    else
                    {
                        dos.writeUTF(iNo + " is not an Even Number");
                    }
                }
                else if(operation.equals("ODD"))
                {
                    if(CheckOdd(iNo))
                    {
                        dos.writeUTF(iNo + " is an Odd Number");
                    }
                    else
                    {
                        dos.writeUTF(iNo + " is not an Odd Number");
                    }
                }
                else if(operation.equals("PRIME"))
                {
                    if(CheckPrime(iNo))
                    {
                        dos.writeUTF(iNo + " is a Prime Number");
                    }
                    else
                    {
                        dos.writeUTF(iNo + " is not a Prime Number");
                    }
                }
                else if(operation.equals("PERFECT"))
                {
                    if(CheckPerfect(iNo))
                    {
                        dos.writeUTF(iNo + " is a Perfect Number");
                    }
                    else
                    {
                        dos.writeUTF(iNo + " is not a Perfect Number");
                    }
                }
                else if(operation.equals("FACTORIAL"))
                {
                    long iResult = Factorial(iNo);

                    dos.writeUTF("Factorial is : " + iResult);
                }
                else if(operation.equals("REVERSE"))
                {
                    int iResult = Reverse(iNo);

                    dos.writeUTF("Reverse is : " + iResult);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }

            socket.close();

            dis.close();
            dos.close();

            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }

    public static boolean CheckEven(int iNo)
    {
        return (iNo % 2 == 0);
    }

    public static boolean CheckOdd(int iNo)
    {
        return (iNo % 2 != 0);
    }

    public static boolean CheckPrime(int iNo)
    {
        if(iNo <= 1)
        {
            return false;
        }

        for(int i = 2; i <= iNo / 2; i++)
        {
            if(iNo % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static boolean CheckPerfect(int iNo)
    {
        if(iNo <= 1)
        {
            return false;
        }

        int iSum = 0;

        for(int i = 1; i <= iNo / 2; i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        return (iSum == iNo);
    }

    public static long Factorial(int iNo)
    {
        long iFact = 1;

        for(int i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }

    public static int Reverse(int iNo)
    {
        int iReverse = 0;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;

            iReverse = (iReverse * 10) + iDigit;

            iNo = iNo / 10;
        }

        return iReverse;
    }
}