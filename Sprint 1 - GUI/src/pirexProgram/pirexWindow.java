package pirexProgram;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.*;
import javax.swing.JTabbedPane;
import pirexProgram.*;



import javax.swing.JPanel;
import javax.swing.JFrame;




public class pirexWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public pirexWindow() 
	{
		super();
		setupLayout();
//		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setupLayout()
	{
		Container		contentPane;
		PanelCreation 	allTheTabs; 
				
		allTheTabs = new PanelCreation();
				
		setSize(800, 542);
		
		contentPane = getContentPane();
		contentPane.add(allTheTabs, BorderLayout.CENTER);
	}

}

