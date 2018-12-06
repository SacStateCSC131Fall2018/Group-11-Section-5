package pirexProgram;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//Class to implement the dialogue box for the "about" information.
 class AboutDialog extends JDialog{

	  private static final long serialVersionUID = 1L;

	  public AboutDialog() {
		    setTitle("About");
		    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		    add(Box.createRigidArea(new Dimension(0, 10)));

		    JLabel name = new JLabel("Pirex");
		    name.setAlignmentX(0.5f);
		    add(name);
		    
		    JLabel name0 = new JLabel("Group 11, Section 5");
		    name.setAlignmentX(0.5f);
		    add(name0);

		    
		    JLabel name1 = new JLabel("Search for words or phrases in the Search Documents tab.\n\n");
		    name.setAlignmentX(0.5f);
		    add(name1);

		    
		    JLabel name2 = new JLabel("Load an opus in the Load Documents tab.\n\n");
		    name.setAlignmentX(0.5f);
		    add(name2);

		    
		    JLabel name3 = new JLabel("See a summarized list of opera in the Summarize Documents tab.\n");
		    name.setAlignmentX(0.5f);
		    add(name3);


		    add(Box.createRigidArea(new Dimension(0, 100)));

		    JButton close = new JButton("Close");
		    close.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent event) {
		        dispose();
		      }
		    });

		    close.setAlignmentX(0.5f);
		    add(close);
		    setModalityType(ModalityType.APPLICATION_MODAL);
		    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		    setSize(300, 200);
		  }
  
}


