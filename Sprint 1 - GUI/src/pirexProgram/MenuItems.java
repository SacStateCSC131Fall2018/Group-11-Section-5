package pirexProgram;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pirexProgram.exportWindow;



public class MenuItems extends JMenuBar implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	public MenuItems()
	{
		
		//File Menu Bar item
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		add(fileMenu);
		
		//Menu Items are listed below
		
		//Start with New
		JMenuItem newMenuItem = new JMenuItem("New...", KeyEvent.VK_N);
		fileMenu.add(newMenuItem);
		
		//Export menu item... should launch a new window on click
		JMenuItem exportMenuItem = new JMenuItem("Export...", KeyEvent.VK_Z);
		exportMenuItem.addActionListener(this);
		fileMenu.add(exportMenuItem);
		
		//Exit in File menu, closes the program
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		ActionListener al = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		};
		exitMenuItem.addActionListener(al);
		fileMenu.add(exitMenuItem);

		//Edit Menu Bar item
		
		JMenu editMenu = new JMenu("Edit");
		add(editMenu);
		
		//View Menu Bar item
		
		JMenu viewMenu = new JMenu("View");
		add(viewMenu);
		
		//Window Menu Bar item
		
		JMenu windowMenu = new JMenu("Window");
		add(windowMenu);
		
		//Help Menu Bar item
		
		JMenu helpMenu = new JMenu("Help");
		add(helpMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		exportWindow	window2;
		
        window2 = new exportWindow();
        window2.setTitle("Export Results");        
        window2.setVisible(true);
		
	}
	
}
