package pirexProgram;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;

public class MenuItems extends JMenuBar
{
	private static final long serialVersionUID = 1L;
	private JMenuBar 	menuBar;
//	private JMenu		menu;
	private JMenu		submenu;
	private JMenuItem	menuItem;
	
	public MenuItems()
	{
		menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		add(fileMenu);
		
		JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
		fileMenu.add(newMenuItem);
		
		
		JMenuItem exportMenuItem = new JMenuItem("Export...", KeyEvent.VK_Z);
		fileMenu.add(exportMenuItem);
		
		JMenu editMenu = new JMenu("Edit");
		add(editMenu);
		
		JMenu viewMenu = new JMenu("View");
		add(viewMenu);
		
		JMenu windowMenu = new JMenu("Window");
		add(windowMenu);
		
		JMenu helpMenu = new JMenu("Help");
		add(helpMenu);
	}
	
}
