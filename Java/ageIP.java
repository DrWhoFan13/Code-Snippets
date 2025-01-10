import javax.swing.JOptionPane;

public class ageIP
{
   public static void main(String[]args)
	{
	   String ageIP;
		ageIP = JOptionPane.showInputDialog("What's your age?");  
		JOptionPane.showMessageDialog(null, ageIP);
		
		System.exit(0);
	}
}