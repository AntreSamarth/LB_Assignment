import java.io.*;
import java.net.*;
import java.util.*;

class Program944
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("------------------------------------------");
            System.out.println("--------Marvellous Client Started---------");
            System.out.println("------------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",
                                        9000
                                      );

            System.out.println("Connection with Server is successful");

            DataInputStream dis =
                new DataInputStream(socket.getInputStream());

            DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

            while(true)
            {
                System.out.println();
                System.out.println("EVEN <number>");
                System.out.println("ODD <number>");
                System.out.println("PRIME <number>");
                System.out.println("PERFECT <number>");
                System.out.println("FACTORIAL <number>");
                System.out.println("REVERSE <number>");
                System.out.println("QUIT");

                System.out.println();
                System.out.println("Enter command : ");

                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Usage : QUIT");
                        continue;
                    }

                    dos.writeUTF(command);

                    String response = dis.readUTF();

                    System.out.println("Server : " + response);

                    break;
                }

                if(parts.length != 2)
                {
                    System.out.println("Invalid command format");
                    continue;
                }

                if(operation.equals("EVEN") ||
                   operation.equals("ODD") ||
                   operation.equals("PRIME") ||
                   operation.equals("PERFECT") ||
                   operation.equals("FACTORIAL") ||
                   operation.equals("REVERSE"))
                {
                    try
                    {
                        Integer.parseInt(parts[1]);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter a valid number");
                        continue;
                    }

                    dos.writeUTF(command);

                    String response = dis.readUTF();

                    System.out.println("Server : " + response);
                }
                else
                {
                    System.out.println("Invalid operation");
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