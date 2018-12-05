package pirexProgram;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pirexProgram.exportWindow;



public class MenuItems extends JMenuBar
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
		
		//The save querry (AK)
		JMenuItem saveQuerry = new JMenuItem("Save Querry...", KeyEvent.VK_S);
		fileMenu.add(saveQuerry);
		
		JMenuItem exportMenuItem = new JMenuItem("Export...", KeyEvent.VK_Z);
		exportMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				exportWindow	window2;
				
		        window2 = new exportWindow();
		        window2.setTitle("Export Results");        
		        window2.setVisible(true);
				
			}
		}
		);
		fileMenu.add(exportMenuItem);
		
		//Load query menu item...should launch a new window on click to load query
		JMenuItem loadQueryMenuItem = new JMenuItem("Load Query...", KeyEvent.VK_L);
		loadQueryMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				loadQueryWindow	window3 = new loadQueryWindow();
				window3.setTitle("Load Query");
				window3.setVisible(true);
				
			}
		}
		);
		fileMenu.add(loadQueryMenuItem);
		
		//Exit in File menu, closes the program
		JMenuItem exitFileItem = new JMenuItem("Exit", KeyEvent.VK_X);
		exitFileItem.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});
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
		
		//About item for giving uusers basic information about the product
		JMenuItem aboutItem = new JMenuItem("About");
		helpMenu.add(aboutItem);
		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AboutDialog ad = new AboutDialog();
				ad.setVisible(true);
			}
		});
		
		
		//Index in Help menu, displays info on various aspects of Pirex
		JMenuItem indexHelpItem = new JMenuItem("Index");
		indexHelpItem.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        indexWindow	window4 = new indexWindow();
		        window4.setTitle("Index Help");
		        window4.setVisible(true);
		    }
		});
		helpMenu.add(indexHelpItem);
		
		//Options Menu Bar item
		JMenu optionsMenu = new JMenu("Options");
		add(optionsMenu);
		
		//Sources in Options Menu Bar 
		JMenuItem sourcesItem = new JMenuItem("Sources", KeyEvent.VK_S);
		sourcesItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sourcesWindow window5 = new sourcesWindow();
				window5.setTitle("Set Source Path");
				window5.setVisible(true);
			}
		});
		optionsMenu.add(sourcesItem);
		
	}

	
}

