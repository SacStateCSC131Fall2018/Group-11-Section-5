package pirexProgram;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JFrame;
import javax.swing.JButton;

public class indexWindow extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	public indexWindow()
	{
		super();
		setupLayout();
		setResizable(false);
	}
	
	private void setupLayout()
	{
		setLayout(null);
		setSize(700, 100);
		
		JTextArea indexHelp = new JTextArea();
		indexHelp.setFont(new Font("Monospaced", Font.PLAIN, 11));
		indexHelp.setText("Pirex (personal information retrieval experimental system) is an information retrieval system that\r\n" + 
				"individuals can use to investigate their own texts.");

		
		JScrollPane scroll3 = new JScrollPane(indexHelp);
		scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(indexHelp);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		setVisible(false);
		dispose();
	}
}
