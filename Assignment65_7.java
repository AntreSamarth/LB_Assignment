import java.io.*;
import java.net.*;
import java.util.*;

class Program940
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Client Started -----");
            System.out.println("-------------------------------------");

            Socket socket = new Socket("127.0.0.1", 9000);

            System.out.println("Connection with Server is successful");

            DataInputStream dis =
                new DataInputStream(socket.getInputStream());

            DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

            while(true)
            {
                System.out.println();
                System.out.println("INFO <FileName>");
                System.out.println("QUIT");
                System.out.println();

                System.out.println("Enter command : ");
                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("INFO"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : INFO <FileName>");
                        continue;
                    }

                    dos.writeUTF(command);

                    String response = dis.readUTF();

                    System.out.println();
                    System.out.println(response);
                }
                else if(operation.equals("QUIT"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Usage : QUIT");
                        continue;
                    }

                    dos.writeUTF(command);

                    String response = dis.readUTF();

                    System.out.println(response);

                    break;
                }
                else
                {
                    System.out.println("There is no such command");
                }
            }

            socket.close();
            sobj.close();
            dis.close();
            dos.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}