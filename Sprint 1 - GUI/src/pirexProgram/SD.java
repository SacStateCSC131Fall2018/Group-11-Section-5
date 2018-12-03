package pirexProgram;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class SD extends JComponent 
{
	private JTextField TextField;

	public SD() 
	{
		setLayout(null);
		
			
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

		
		JScrollPane scroll3 = new JScrollPane(txtrOpusCharles);
		scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(txtrOpusCharles);
		

		
	}
}
