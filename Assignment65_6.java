import java.io.*;
import java.net.*;

class Program939
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

                if(operation.equals("INFO"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : INFO <FileName>");
                        continue;
                    }

                    File file = new File(parts[1]);

                    if(file.exists() && file.isFile())
                    {
                        String info = "";

                        info = info + "File Name      : " +
                               file.getName() + "\n";

                        info = info + "Size           : " +
                               file.length() + " bytes\n";

                        info = info + "Readable       : " +
                               file.canRead() + "\n";

                        info = info + "Writable       : " +
                               file.canWrite() + "\n";

                        info = info + "Absolute Path  : " +
                               file.getAbsolutePath();

                        dos.writeUTF(info);
                    }
                    else
                    {
                        dos.writeUTF("File does not exist");
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