import java.io.*;
import java.net.*;

class Program945
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

                String parts[] = command.split(" ", 2);

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                String str = parts[1];

                if(operation.equals("LENGTH"))
                {
                    dos.writeUTF("Length is : " + str.length());
                }
                else if(operation.equals("UPPER"))
                {
                    dos.writeUTF(str.toUpperCase());
                }
                else if(operation.equals("LOWER"))
                {
                    dos.writeUTF(str.toLowerCase());
                }
                else if(operation.equals("REVERSE"))
                {
                    String reverse = "";

                    for(int i = str.length() - 1; i >= 0; i--)
                    {
                        reverse = reverse + str.charAt(i);
                    }

                    dos.writeUTF(reverse);
                }
                else if(operation.equals("PALINDROME"))
                {
                    String reverse = "";

                    for(int i = str.length() - 1; i >= 0; i--)
                    {
                        reverse = reverse + str.charAt(i);
                    }

                    if(str.equalsIgnoreCase(reverse))
                    {
                        dos.writeUTF("String is Palindrome");
                    }
                    else
                    {
                        dos.writeUTF("String is not Palindrome");
                    }
                }
                else if(operation.equals("VOWELS"))
                {
                    int iCount = 0;

                    for(int i = 0; i < str.length(); i++)
                    {
                        char ch = Character.toLowerCase(str.charAt(i));

                        if(ch == 'a' || ch == 'e' ||
                           ch == 'i' || ch == 'o' ||
                           ch == 'u')
                        {
                            iCount++;
                        }
                    }

                    dos.writeUTF("Number of vowels : " + iCount);
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