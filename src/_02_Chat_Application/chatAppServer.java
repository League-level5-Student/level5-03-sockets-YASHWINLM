package _02_Chat_Application;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class chatAppServer {
	ServerSocket serverSocket;
	
	public chatAppServer() throws IOException{
		serverSocket=new ServerSocket(8080);
	}
	
	public void run() {}
	
	
	
}
