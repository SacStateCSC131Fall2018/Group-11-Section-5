package pirexProgram;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class pirexWindow extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public pirexWindow() 
	{
		super();
		setupLayout();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setupLayout()
	{
		Container		contentPane;
		PanelCreation 	allTheTabs; 
		MenuItems		menus;
		ImageIcon		icon;
		
		allTheTabs = new PanelCreation();
		menus = new MenuItems();
		icon = new ImageIcon("image/32x32.png");
		setIconImage(icon.getImage());
				
		setSize(800, 542);
		
		contentPane = getContentPane();
		contentPane.add(allTheTabs, BorderLayout.CENTER);
		setJMenuBar(menus);
	}

}

