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
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
//import java.awt.Choice;
//import java.awt.Component;
//import javax.swing.Box;
//import java.awt.Color;
import javax.swing.JSeparator;
//import javax.swing.SwingConstants;
//import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.Font;
//import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Pirex {

	private JFrame frmPirex;
	private JTextField queryTextField;
	private JTextField txtuserssomeonetaleoftwocities;
	private JTextField titleTextBox;
	private JTextField authorTextBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pirex window = new Pirex();
					window.frmPirex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pirex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPirex = new JFrame();
		frmPirex.setTitle("Pirex");
		frmPirex.setIconImage(new ImageIcon(getClass().getResource("32x32.png")).getImage());
		frmPirex.setBounds(100, 100, 801, 544);
		frmPirex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPirex.getContentPane().setLayout(null);
		
		JTabbedPane Tabs = new JTabbedPane(JTabbedPane.TOP);
		Tabs.setBounds(10, 11, 775, 494);
		frmPirex.getContentPane().add(Tabs);
		frmPirex.getContentPane().setLayout(new BorderLayout());
		frmPirex.getContentPane().add(Tabs, BorderLayout.CENTER);
		
		JPanel SearchDocuments = new JPanel();
		Tabs.addTab("Search for Documents", null, SearchDocuments, null);
		
		JLabel labelQuery = new JLabel("Query:");
		
		queryTextField = new JTextField();
		queryTextField.setColumns(10);
		
		JButton clearButton = new JButton("Clear");
		
		JTextArea textAreaSFD1 = new JTextArea();
		textAreaSFD1.setText("Charles Dickens Bleak House  276 I knew he meant well in paying me this compliment, so I laughed at" +
							 "\nCharles Dickens Bleak House  519  it was one of those delightfully irregular houses where you go up and" +
							 "\nCharles Dickens Bleak House  635  There may be some motions of fancy among the lower animals at Chesney" +
							 "\nCharles Dickens Bleak House  769  \"They attend matins with me (very prettily done) at half-pax six" +
							 "\nCharles Dickens Bleak House  947  This proper name, so used by Mr. Snagsby, has before six" +
							 "\nCharles Dickens Bleak House  954  The red bit, the black bit, the inkstand top, the other inkstand top");
		
		JTextArea textAreaSFD2 = new JTextArea();
		textAreaSFD2.setText("There may be some motions of fancy among the lower animals at Chesney" +
							 "\nWold, The horses in the stables--the long stables in a barren," +
							 "\nred-brick court-yard, where there is a great bell in a turret, and a" +
							 "\nclock with a large face, which the pigeons who live near it and who" +
							 "\nlove to perch upon its shoulders seem to be always consulting--THEY" +
							 "\nmay contemplate some mental pictures of fine weather on occasions," +
							 "\nand may be better artists at them than the grooms. The old roan, so" +
							 "\nfamous for cross-country work, turning his large eyeball to the" +
							 "\ngrated window near his rack, may remember the fresh leaves that" +
							 "\nglitsen there at other times and the scents that stream in, and may");
		
		JScrollBar scrollBarSearchDocuments = new JScrollBar();
		GroupLayout gl_SearchDocuments = new GroupLayout(SearchDocuments);
		gl_SearchDocuments.setHorizontalGroup(
			gl_SearchDocuments.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SearchDocuments.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_SearchDocuments.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_SearchDocuments.createSequentialGroup()
							.addGroup(gl_SearchDocuments.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_SearchDocuments.createSequentialGroup()
									.addGap(41)
									.addComponent(queryTextField, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
								.addComponent(labelQuery, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(textAreaSFD1, GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
						.addGroup(gl_SearchDocuments.createSequentialGroup()
							.addComponent(textAreaSFD2, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
							.addGap(2)
							.addComponent(scrollBarSearchDocuments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(3)))
					.addGap(10))
		);
		gl_SearchDocuments.setVerticalGroup(
			gl_SearchDocuments.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SearchDocuments.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_SearchDocuments.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_SearchDocuments.createParallelGroup(Alignment.BASELINE)
							.addComponent(queryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(clearButton))
						.addGroup(gl_SearchDocuments.createSequentialGroup()
							.addGap(3)
							.addComponent(labelQuery)))
					.addGap(18)
					.addComponent(textAreaSFD1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
					.addGap(40)
					.addGroup(gl_SearchDocuments.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollBarSearchDocuments, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
						.addComponent(textAreaSFD2, GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE))
					.addGap(11))
		);
		SearchDocuments.setLayout(gl_SearchDocuments);
		
		JPanel LoadDocuments = new JPanel();
		Tabs.addTab("Load Documents", null, LoadDocuments, null);
		
		JLabel labelTextFile = new JLabel("Text File:");
		
		txtuserssomeonetaleoftwocities = new JTextField();
		txtuserssomeonetaleoftwocities.setText("/users/someone/taleOfTwoCities");
		txtuserssomeonetaleoftwocities.setColumns(10);
		
		JButton browseButton = new JButton("Browse");
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel labelTextFilteType = new JLabel("Text Filter Type:");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setToolTipText("");
		
		JLabel labelTitle = new JLabel("Title:");
		
		JLabel labelAuthor = new JLabel("Author:");
		
		titleTextBox = new JTextField();
		titleTextBox.setText("A Tale of Two Cities");
		titleTextBox.setColumns(10);
		
		authorTextBox = new JTextField();
		authorTextBox.setText("Charles Dickens");
		authorTextBox.setColumns(10);
		
		JSeparator separator = new JSeparator();
		
		JButton processButton = new JButton("Process");
		
		JTextArea textAreaLoadDocuments = new JTextArea();
		textAreaLoadDocuments.setText("Opus: /users/somene/taleOfTwoCities.txt" +
				 									  "\nAuthor: Charles Dickens" +
				 									  "\nOpus size: 3329 documents" +
				 									  "\nOpus number: 5" +
				 									  "\nNew Index terms: 1298" +
				 									  "\nNew postings: 55039" +
				 									  "\nTotal index terms: 26447" +
				 									  "\nTotal postings: 226412");
		GroupLayout gl_LoadDocuments = new GroupLayout(LoadDocuments);
		gl_LoadDocuments.setHorizontalGroup(
			gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_LoadDocuments.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
						.addComponent(textAreaLoadDocuments, GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
						.addGroup(gl_LoadDocuments.createSequentialGroup()
							.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_LoadDocuments.createSequentialGroup()
									.addGap(55)
									.addComponent(txtuserssomeonetaleoftwocities, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
								.addComponent(labelTextFile, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addComponent(browseButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addComponent(labelTextFilteType, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_LoadDocuments.createSequentialGroup()
							.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_LoadDocuments.createSequentialGroup()
									.addGap(34)
									.addComponent(titleTextBox, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
								.addComponent(labelTitle, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addComponent(labelAuthor, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(authorTextBox, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
						.addComponent(processButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_LoadDocuments.createSequentialGroup()
							.addGap(96)
							.addComponent(comboBox, 0, 664, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_LoadDocuments.setVerticalGroup(
			gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_LoadDocuments.createSequentialGroup()
					.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_LoadDocuments.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtuserssomeonetaleoftwocities, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(browseButton))
								.addGroup(gl_LoadDocuments.createSequentialGroup()
									.addGap(3)
									.addComponent(labelTextFile)))
							.addGap(14)
							.addComponent(labelTextFilteType)
							.addGap(14)
							.addGroup(gl_LoadDocuments.createParallelGroup(Alignment.LEADING)
								.addComponent(titleTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_LoadDocuments.createSequentialGroup()
									.addGap(3)
									.addComponent(labelTitle))
								.addGroup(gl_LoadDocuments.createSequentialGroup()
									.addGap(5)
									.addComponent(labelAuthor, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
								.addComponent(authorTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(processButton)
							.addGap(11)
							.addComponent(textAreaLoadDocuments, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
						.addGroup(gl_LoadDocuments.createSequentialGroup()
							.addGap(43)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		LoadDocuments.setLayout(gl_LoadDocuments);
		
		JPanel SummarizeDocuments = new JPanel();
		Tabs.addTab("Summarize Documents", null, SummarizeDocuments, null);
		
		JTextArea textAreaSummarizeDocuments = new JTextArea();
		textAreaSummarizeDocuments.setFont(new Font("Monospaced", Font.PLAIN, 11));
		textAreaSummarizeDocuments.setText("Opus  0: Charles Dickens   Bleak House     7312 documents" +
				  				"\n		/Users/christopherfox/Programs/java/ir/data/bleakHouse.txt" +
				  				"\nOpus  1: Thomas Hardy   Far from the Madding Crowd     3538 Documents" +
				  				"\n		/Users/christopherfox/Programs/java/ir/data/farFromTheMaddingCrowd.txt" +
				  				"\nOpus  2: Thomas Hardy   Jude the Obs     3650 Documents" +
				  				"\n		/Users/christopherfox/Programs/java/ir/data/judeTheObscure.txt" +
				  				"\nOpus  3: Daniel Defoe   The Fortunes and Misfortunes of the Famous Moll Falnders &c.     1283 Documents" +
				  				"\n		/Users/christopherfox/Programs/java/ir/data/mollFlanders.txt" +
				  				"\nOpus  4: Charles Dickens   Great Expectations     3848 Documents" +
				  				"\n		/Users/christopherfox/Programs/java/ir/data/greatExpectations.txt" +
				  				"\nOpus  5: Charles Dickens   A Tale of Two Cities     3329 Documents" +
				  				"\n		/Users/christopherfox/Programs/java/ir/data/taleOfTwoCities.txt" +
				  				"\n\nIndex terms: 26447" +
				  				"\nPostings:    226412");
		
		JScrollBar scrollBarSummarizeDocuments = new JScrollBar();
		GroupLayout gl_SummarizeDocuments = new GroupLayout(SummarizeDocuments);
		gl_SummarizeDocuments.setHorizontalGroup(
			gl_SummarizeDocuments.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_SummarizeDocuments.createSequentialGroup()
					.addContainerGap()
					.addComponent(textAreaSummarizeDocuments, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBarSummarizeDocuments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		gl_SummarizeDocuments.setVerticalGroup(
			gl_SummarizeDocuments.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_SummarizeDocuments.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_SummarizeDocuments.createParallelGroup(Alignment.TRAILING)
						.addComponent(textAreaSummarizeDocuments, Alignment.LEADING)
						.addComponent(scrollBarSummarizeDocuments, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
					.addContainerGap())
		);
		SummarizeDocuments.setLayout(gl_SummarizeDocuments);
		
		JMenuBar menuBar = new JMenuBar();
		frmPirex.setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New...");
		fileMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmSaveQuerry = new JMenuItem("Save Querry...");
		fileMenu.add(mntmSaveQuerry);
		
		JMenuItem mntmExport = new JMenuItem("Export...");
		fileMenu.add(mntmExport);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Load Querry...");
		fileMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		fileMenu.add(mntmExit);
		
		JMenu mnEdit = new JMenu(" Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnWindow = new JMenu("Window");
		menuBar.add(mnWindow);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Help");
		mnHelp.add(mntmNewMenuItem_2);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmSources = new JMenuItem("Sources");
		mnOptions.add(mntmSources);
	}
}
