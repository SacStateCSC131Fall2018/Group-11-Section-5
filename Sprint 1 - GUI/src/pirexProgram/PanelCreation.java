package pirexProgram;

import pirexProgram.LD;
import pirexProgram.SD;
import pirexProgram.SFD;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class PanelCreation extends JTabbedPane 
{
	private static final long serialVersionUID = 1L;
	public PanelCreation()
	{
		super();
		setupLayout();	
	}

	private void setupLayout()
	{
		JComponent		SFD;
		JComponent		LD;
		JComponent		SD;
		
		SFD = new SFD();
		addTab("Search for Documents", null, SFD, null);
		setMnemonicAt(0, KeyEvent.VK_1);
		
		LD = new LD();
		addTab("Load Documents", null, LD, null);
		setMnemonicAt(1, KeyEvent.VK_2);
		
		SD = new SD();
		addTab("Load Documents", null, SD, null);	
		setMnemonicAt(2, KeyEvent.VK_3);
	}
}
