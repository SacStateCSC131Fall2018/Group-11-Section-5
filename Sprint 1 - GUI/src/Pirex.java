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
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.Font;

public class Pirex {

	private JFrame frmPirex;
	private JTextField textField;
	private JTextField txtuserssomeonetaleoftwocities;
	private JTextField txtATaleOf;
	private JTextField txtCharlesDickens;

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
		frmPirex.setResizable(false);
		frmPirex.setTitle("Pirex");
		frmPirex.setIconImage(new ImageIcon(getClass().getResource("16x16.png")).getImage());
		frmPirex.setBounds(100, 100, 801, 544);
		frmPirex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPirex.getContentPane().setLayout(null);
		
		JTabbedPane Tabs = new JTabbedPane(JTabbedPane.TOP);
		Tabs.setBounds(10, 11, 775, 494);
		frmPirex.getContentPane().add(Tabs);
		
		JPanel SearchDocuments = new JPanel();
		Tabs.addTab("Search for Documents", null, SearchDocuments, null);
		SearchDocuments.setLayout(null);
		
		JLabel lblQuery = new JLabel("Query:");
		lblQuery.setBounds(10, 11, 42, 14);
		SearchDocuments.add(lblQuery);
		
		textField = new JTextField();
		textField.setBounds(51, 8, 628, 20);
		SearchDocuments.add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(689, 7, 68, 23);
		SearchDocuments.add(btnClear);
		
		JTextArea textAreaSFD1 = new JTextArea();
		textAreaSFD1.setText("Charles Dickens Bleak House  276 I knew he meant well in paying me this compliment, so I laughed at" +
							 "\nCharles Dickens Bleak House  519  it was one of those delightfully irregular houses where you go up and" +
							 "\nCharles Dickens Bleak House  635  There may be some motions of fancy among the lower animals at Chesney" +
							 "\nCharles Dickens Bleak House  769  \"They attend matins with me (very prettily done) at half-pax six" +
							 "\nCharles Dickens Bleak House  947  This proper name, so used by Mr. Snagsby, has before six" +
							 "\nCharles Dickens Bleak House  954  The red bit, the black bit, the inkstand top, the other inkstand top");
		textAreaSFD1.setBounds(10, 46, 750, 205);
		SearchDocuments.add(textAreaSFD1);
		
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
		textAreaSFD2.setBounds(10, 291, 728, 164);
		SearchDocuments.add(textAreaSFD2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(740, 291, 17, 164);
		SearchDocuments.add(scrollBar);
		
		JPanel LoadDocuments = new JPanel();
		Tabs.addTab("Load Documents", null, LoadDocuments, null);
		LoadDocuments.setLayout(null);
		
		JLabel lblTextFile = new JLabel("Text File:");
		lblTextFile.setBounds(10, 15, 58, 14);
		LoadDocuments.add(lblTextFile);
		
		txtuserssomeonetaleoftwocities = new JTextField();
		txtuserssomeonetaleoftwocities.setText("/users/someone/taleOfTwoCities");
		txtuserssomeonetaleoftwocities.setColumns(10);
		txtuserssomeonetaleoftwocities.setBounds(65, 12, 603, 20);
		LoadDocuments.add(txtuserssomeonetaleoftwocities);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBrowse.setBounds(678, 11, 79, 23);
		LoadDocuments.add(btnBrowse);
		
		JLabel lblTextFilteType = new JLabel("Text Filter Type:");
		lblTextFilteType.setBounds(10, 46, 97, 14);
		LoadDocuments.add(lblTextFilteType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setToolTipText("");

		comboBox.setBounds(106, 43, 651, 20);
		LoadDocuments.add(comboBox);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(10, 77, 46, 14);
		LoadDocuments.add(lblTitle);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(401, 79, 46, 11);
		LoadDocuments.add(lblAuthor);
		
		txtATaleOf = new JTextField();
		txtATaleOf.setText("A Tale of Two Cities");
		txtATaleOf.setBounds(44, 74, 347, 20);
		LoadDocuments.add(txtATaleOf);
		txtATaleOf.setColumns(10);
		
		txtCharlesDickens = new JTextField();
		txtCharlesDickens.setText("Charles Dickens");
		txtCharlesDickens.setColumns(10);
		txtCharlesDickens.setBounds(454, 74, 303, 20);
		LoadDocuments.add(txtCharlesDickens);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 116, 750, 2);
		LoadDocuments.add(separator);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(10, 129, 91, 23);
		LoadDocuments.add(btnProcess);
		
		JTextArea txtrOpususerssomenetaleoftwocitiestxt = new JTextArea();
		txtrOpususerssomenetaleoftwocitiestxt.setText("Opus: /users/somene/taleOfTwoCities.txt" +
				 									  "\nAuthor: Charles Dickens" +
				 									  "\nOpus size: 3329 documents" +
				 									  "\nOpus number: 5" +
				 									  "\nNew Index terms: 1298" +
				 									  "\nNew postings: 55039" +
				 									  "\nTotal index terms: 26447" +
				 									  "\nTotal postings: 226412");
		txtrOpususerssomenetaleoftwocitiestxt.setBounds(10, 163, 747, 292);
		LoadDocuments.add(txtrOpususerssomenetaleoftwocitiestxt);
		
		JPanel SummarizeDocuments = new JPanel();
		Tabs.addTab("Summarize Documents", null, SummarizeDocuments, null);
		SummarizeDocuments.setLayout(null);
		
		JTextArea txtrOpusCharles = new JTextArea();
		txtrOpusCharles.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrOpusCharles.setText("Opus  0: Charles Dickens   Bleak House     7312 documents" +
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
		txtrOpusCharles.setBounds(10, 11, 728, 444);
		SummarizeDocuments.add(txtrOpusCharles);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(740, 11, 17, 444);
		SummarizeDocuments.add(scrollBar_1);
	}
}
