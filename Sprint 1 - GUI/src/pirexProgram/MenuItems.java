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
		JMenuItem exitFileItem = new JMenuItem("Exit", KeyEvent.VK_X);
		ActionListener al0 = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		};
		exitFileItem.addActionListener(al0);
		fileMenu.add(exitFileItem);

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
		
		//Index in Help menu, displays info on various aspects of Pirex
		JMenuItem indexHelpItem = new JMenuItem("Index");
		ActionListener al1 = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        indexWindow	window3;
		        
		        window3 = new indexWindow();
		        window3.setTitle("Index Help");
		        window3.setVisible(true);
		    }
		};
		indexHelpItem.addActionListener(al1);
		helpMenu.add(indexHelpItem);
		
		//Options Menu Bar item
		JMenu optionsMenu = new JMenu("Options");
		add(optionsMenu);
		
		//Sources in Options Menu Bar 
		JMenuItem sourcesItem = new JMenuItem("Sources", KeyEvent.VK_S);
		ActionListener al2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sourcesWindow sources = new sourcesWindow();
				sources.setTitle("Set Source Path");
				sources.setVisible(true);
			}
		};
		sourcesItem.addActionListener(al2);
		optionsMenu.add(sourcesItem);
		
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
