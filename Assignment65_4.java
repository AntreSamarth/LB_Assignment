import java.io.*;
import java.net.*;

class Program937
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Server Started -----");
            System.out.println("-------------------------------------");

            Socket clientsocket = serversocket.accept();

            System.out.println("Client connected successfully");

            DataInputStream dis =
                new DataInputStream(clientsocket.getInputStream());

            DataOutputStream dos =
                new DataOutputStream(clientsocket.getOutputStream());

            while(true)
            {
                String command = dis.readUTF();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("EXISTS"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : EXISTS <FileName>");
                        continue;
                    }

                    File file = new File(parts[1]);

                    if(file.exists() && file.isFile())
                    {
                        dos.writeUTF(parts[1] + " exists on server");
                    }
                    else
                    {
                        dos.writeUTF(parts[1] + " does not exist");
                    }
                }
                else if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }

            clientsocket.close();
            serversocket.close();

            dis.close();
            dos.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}