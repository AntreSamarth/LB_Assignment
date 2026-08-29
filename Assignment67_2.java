import java.io.*;
import java.net.*;
import java.util.*;

class Program946
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
                System.out.println("LENGTH <string>");
                System.out.println("UPPER <string>");
                System.out.println("LOWER <string>");
                System.out.println("REVERSE <string>");
                System.out.println("PALINDROME <string>");
                System.out.println("VOWELS <string>");
                System.out.println("QUIT");

                System.out.println();
                System.out.println("Enter command : ");

                String command = sobj.nextLine();

                String parts[] = command.split(" ", 2);

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
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

                if(operation.equals("LENGTH") ||
                   operation.equals("UPPER") ||
                   operation.equals("LOWER") ||
                   operation.equals("REVERSE") ||
                   operation.equals("PALINDROME") ||
                   operation.equals("VOWELS"))
                {
                    dos.writeUTF(command);

                    String response = dis.readUTF();

                    System.out.println("Server : " + response);
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