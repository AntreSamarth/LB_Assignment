import java.io.*;
import java.net.*;
import java.util.*;

class Program66.2
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
                System.out.println("ADD <No1> <No2>");
                System.out.println("SUB <No1> <No2>");
                System.out.println("MULT <No1> <No2>");
                System.out.println("DIV <No1> <No2>");
                System.out.println("MOD <No1> <No2>");
                System.out.println("MAX <No1> <No2>");
                System.out.println("MIN <No1> <No2>");
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

                if(parts.length != 3)
                {
                    System.out.println("Invalid command format");
                    continue;
                }

                if(operation.equals("ADD") ||
                   operation.equals("SUB") ||
                   operation.equals("MULT") ||
                   operation.equals("DIV") ||
                   operation.equals("MOD") ||
                   operation.equals("MAX") ||
                   operation.equals("MIN"))
                {
                    try
                    {
                        Double.parseDouble(parts[1]);
                        Double.parseDouble(parts[2]);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter valid numbers");
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