import java.io.*;
import java.net.*;

class Program66.1
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

                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0;

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("MULT"))
                {
                    result = no1 * no2;

                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("DIV"))
                {
                    if(no2 == 0)
                    {
                        dos.writeUTF("Division by zero is not allowed");
                        continue;
                    }

                    result = no1 / no2;

                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("MOD"))
                {
                    if(no2 == 0)
                    {
                        dos.writeUTF("Division by zero is not allowed");
                        continue;
                    }

                    result = no1 % no2;

                    dos.writeUTF("Result is : " + result);
                }
                else if(operation.equals("MAX"))
                {
                    result = Math.max(no1, no2);

                    dos.writeUTF("Maximum number is : " + result);
                }
                else if(operation.equals("MIN"))
                {
                    result = Math.min(no1, no2);

                    dos.writeUTF("Minimum number is : " + result);
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
}