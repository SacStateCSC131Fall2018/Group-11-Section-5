package pirexProgram;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class SFD extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private JTextField TextField;

	public SFD() 
	{
		setLayout(null);
		
		JLabel lblQuery = new JLabel("Query:");
		lblQuery.setBounds(5, 15, 50, 14);
		add(lblQuery);
		
		TextField = new JTextField();
		TextField.setBounds(55, 12, 575, 20);
		add(TextField);
		TextField.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(630, 12, 60, 20);
		add(btnClear);
		
		JTextArea textAreaSFD1 = new JTextArea();
		textAreaSFD1.setEditable(false);
		textAreaSFD1.setText("Charles Dickens Bleak House  276 I knew he meant well in paying me this compliment, so I laughed at" +
							 "\nCharles Dickens Bleak House  519  it was one of those delightfully irregular houses where you go up and" +
							 "\nCharles Dickens Bleak House  635  There may be some motions of fancy among the lower animals at Chesney" +
							 "\nCharles Dickens Bleak House  769  \"They attend matins with me (very prettily done) at half-pax six" +
							 "\nCharles Dickens Bleak House  947  This proper name, so used by Mr. Snagsby, has before six" +
							 "\nCharles Dickens Bleak House  954  The red bit, the black bit, the inkstand top, the other inkstand top");
		textAreaSFD1.setBounds(10, 46, 750, 205);
		
		JScrollPane scroll1 = new JScrollPane(textAreaSFD1);
		scroll1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		add(textAreaSFD1);
		
		JTextArea textAreaSFD2 = new JTextArea();
		textAreaSFD2.setEditable(false);
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
		textAreaSFD2.setBounds(10, 291, 750, 164);
		
		
		JScrollPane scroll2 = new JScrollPane(textAreaSFD2);
		scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(textAreaSFD2);
		

	}
}
