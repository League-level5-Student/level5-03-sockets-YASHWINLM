package _00_Click_Chat.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import _00_Click_Chat.networking.Client;
import _00_Click_Chat.networking.Server;

public class ButtonClicker extends JFrame {
	JButton button = new JButton("Send Message");
	JTextField textField= new JTextField(50);
	JPanel panel= new JPanel();
	
	Server server;
	Client client;
	
	
	public static void main(String[] args) {
		new ButtonClicker();
	}
	
	public ButtonClicker(){
		
		int response = JOptionPane.showConfirmDialog(null, "Would you like to host a connection?", "Buttons!", JOptionPane.YES_NO_OPTION);
		if(response == JOptionPane.YES_OPTION){
			server = new Server(8080);
			setTitle("SERVER");
			JOptionPane.showMessageDialog(null, "Server started at: " + server.getIPAddress() + "\nPort: " + server.getPort());
			button.addActionListener((e)->{
				server.sendClick();
			});
			add(panel);
			panel.add(button);
			panel.add(textField);
			
			setVisible(true);
			setVisible(true);
			setSize(400, 300);
			setSize(400, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			server.start();
			
		}else{
			setTitle("CLIENT");
			String ipStr = JOptionPane.showInputDialog("Enter the IP Address");
			String prtStr = JOptionPane.showInputDialog("Enter the port number");
			int port = Integer.parseInt(prtStr);
			client = new Client(ipStr, port);
			button.addActionListener((e)->{
				client.sendClick();
			});
			add(panel);
			panel.add(button);
			panel.add(textField);
			
			setVisible(true);
			setVisible(true);
			setSize(400, 300);
			setSize(400, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			client.start();
		}
	}
}
