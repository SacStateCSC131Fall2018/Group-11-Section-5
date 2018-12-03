package pirexProgram;

import pirexProgram.pirexWindow;

public class Pirex2 
{
	public static void main(String[] args) 
	{
		boolean isMacOS = System.getProperty("mrj.version") == null;
		if (isMacOS)
		{		
			System.setProperty("apple.laf.useScreenMenuBar", "true");
		}

		pirexWindow		window;
        window = new pirexWindow();
        window.setTitle("Pirex");        
        window.setVisible(true);
	}
}