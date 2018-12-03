package pirexProgram;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import pirexProgram.pirexWindow;

import javax.swing.DropMode;
import javax.swing.ImageIcon;


public class Pirex2 
{
	public static void main(String[] args) 
	{
		pirexWindow		window;
		
        window = new pirexWindow();
        window.setTitle("Pirex");        
        window.setVisible(true);
	}
}