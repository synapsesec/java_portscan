import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner; 
public class SimplePortScan {
    
    public static void main(String[] args) {
    // Socket(InetAddress address, int port, InetAddress localAddr, int localPort)

     // Taking inputs
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the port number you want to scan: ");
    int porttoscan = input.nextInt();
    input.nextLine();
    System.out.print("Enter the IP address you want to scan: ");
    String host = input.nextLine();
    
    try {
        Socket socket = new Socket(host,porttoscan); 
        System.out.println("The port " + porttoscan + " is open ");
        socket.close(); }

        catch (java.net.SocketException e) {
            System.out.println("The port " + porttoscan + " is closed at host " + host);
        
        }
        catch (java.net.UnknownHostException e) {
            System.out.println("Cannot resolve host: " + host);
        } 
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());


     }
     input.close();
     
    }
    }


