package pirexProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JSeparator;

public class LD extends JComponent 
{
	private static final long serialVersionUID = 1L;
	private JTextField TextField1;
	private JTextField TextField2;
	private JTextField TextField3;

	public LD() 
	{
		setLayout(null);
		
		JLabel lblTextFile = new JLabel("Text File:");
		lblTextFile.setBounds(10, 15, 58, 14);
		add(lblTextFile);
		
		TextField1 = new JTextField();
		TextField1.setText("/users/someone/taleOfTwoCities");
		TextField1.setColumns(10);
		TextField1.setBounds(65, 12, 603, 20);
		add(TextField1);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBrowse.setBounds(678, 11, 79, 23);
		add(btnBrowse);
		
		JLabel lblTextFilteType = new JLabel("Text Filter Type:");
		lblTextFilteType.setBounds(10, 46, 97, 14);
		add(lblTextFilteType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setToolTipText("");

		comboBox.setBounds(106, 43, 651, 20);
		add(comboBox);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(10, 77, 46, 14);
		add(lblTitle);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(401, 79, 46, 11);
		add(lblAuthor);
		
		
		TextField2 = new JTextField();
		TextField2.setText("A Tale of Two Cities");
		TextField2.setBounds(44, 74, 347, 20);
		add(TextField2);
		TextField2.setColumns(10);
		
		TextField3 = new JTextField();
		TextField3.setText("Charles Dickens");
		TextField3.setColumns(10);
		TextField3.setBounds(454, 74, 303, 20);
		add(TextField3);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 116, 750, 2);
		add(separator);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(10, 129, 91, 23);
		add(btnProcess);
		
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
		add(txtrOpususerssomenetaleoftwocitiestxt);
	}
}
