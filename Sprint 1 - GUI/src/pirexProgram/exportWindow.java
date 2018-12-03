package pirexProgram;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;

//import javax.swing.*;

public class exportWindow extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	public exportWindow()
	{
		super();
		setupLayout();
		setResizable(false);
	}
	
	private void setupLayout()
	{
		Container		contentPane;
		JLabel			lblQuery;
		JPanel			buttonPanel, infoPanel;
		JTextField		fileNameText;
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		setSize(460, 100);
		
		infoPanel = new JPanel();
		infoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		lblQuery = new JLabel("File Name:");
		infoPanel.add(lblQuery);
		
		fileNameText = new JTextField();
		fileNameText.setColumns(30);
		fileNameText.setSize(20,60);
		infoPanel.add(fileNameText);
			
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(this);
		buttonPanel.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		buttonPanel.add(btnCancel);

		
		contentPane.add(buttonPanel, BorderLayout.PAGE_END);
		contentPane.add(infoPanel, BorderLayout.PAGE_START);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		setVisible(false);
		dispose();
	}
}
