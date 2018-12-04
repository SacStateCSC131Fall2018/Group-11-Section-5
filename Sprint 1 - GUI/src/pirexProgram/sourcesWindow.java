package pirexProgram;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class sourcesWindow extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public sourcesWindow() {
		super();
		setupLayout();
		setResizable(false);
	}
	
	private void setupLayout() {
		Container contentPane;
		JLabel editPathName;
		JPanel btnPanel, txtPanel;
		JTextField pathNameTxt;
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		setSize(460, 100);
		
		txtPanel = new JPanel();
		txtPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		editPathName = new JLabel("Path Name:");
		txtPanel.add(editPathName);
		
		pathNameTxt = new JTextField("/users/someone/taleOfTwoCities.txt");
		pathNameTxt.selectAll();
		pathNameTxt.setColumns(30);
		pathNameTxt.setSize(20, 60);
		txtPanel.add(pathNameTxt);
		
		JButton save = new JButton("Save");
		save.addActionListener(this);
		btnPanel.add(save);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		btnPanel.add(cancel);
		
		contentPane.add(txtPanel, BorderLayout.PAGE_START);
		contentPane.add(btnPanel, BorderLayout.PAGE_END);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		dispose();
		
	}
	

}
