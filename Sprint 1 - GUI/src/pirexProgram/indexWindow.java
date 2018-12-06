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
		Container	contentPane;
		setLayout(null);
		setSize(650, 100);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JTextArea indexHelpInfo = new JTextArea();
		indexHelpInfo.setFont(new Font("Garamond", Font.PLAIN, 16));
		indexHelpInfo.setText("Pirex, or personal information retrieval experimental system,  is an information retrieval system that\r\n" + 
				"individuals can use to investigate their own texts. ");


		
		JScrollPane scroll3 = new JScrollPane(indexHelpInfo);
		scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(indexHelpInfo);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		setVisible(false);
		dispose();
	}
}
