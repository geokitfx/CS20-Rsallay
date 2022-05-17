package ex1MySavings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//USE MySavingsGUI.java to run program!
//USE MySavingsGUI.java to run program!
//USE MySavingsGUI.java to run program!

public class MSWithdraw implements ActionListener {
	private MSMathFRAME frameWork;
	public MSWithdraw(MSMathFRAME frameWork) {
		this.frameWork = frameWork;
	}

	public void actionPerformed(ActionEvent event) {
		int choice = JOptionPane.showConfirmDialog(null, "Confirm?");
		if (choice == JOptionPane.YES_OPTION) { 
			String withdrawText = JOptionPane.showInputDialog(null, "How will you take?");
			double withdraw = Double.parseDouble(withdrawText);
			
			double data = withdraw / 100;
			
			frameWork.addTot(data);
			
			JOptionPane.showMessageDialog(null, "You added " + data + "$ To the piggy bank.");
			 } 
		else 
		{ // choice == NO_OPTION or CANCEL_OPTION
			int min = 1;
	        int max = 100;
	        int a = (int) ((Math.random() * (max - min)) + min);
	        
	        while (a >= 1 && a <= 10) {
	        	JOptionPane.showMessageDialog(null, "So long, and thanks for all the fish!");
	        	break;
	        	}
	        while (a >= 11 && a <= 20) {
	        	JOptionPane.showMessageDialog(null, "Bye Felicia!");
	        	break;
	        	}
	        while (a >= 21 && a <= 30) {
	        	JOptionPane.showMessageDialog(null, "Goodbye, don’t cry! We won’t!");
	        	break;
	        	}
	        while (a >= 31 && a <= 40) {
	        	JOptionPane.showMessageDialog(null, "I am looking forward to not keeping in touch with you! So long!");
	        	break;
	        	}
	        while (a >= 41 && a <= 50) {
	        	JOptionPane.showMessageDialog(null, "It will not be the same without you. It will actually be better!");
	        	break;
	        	}
	        while (a >= 51 && a <= 60) {
	        	JOptionPane.showMessageDialog(null, "Not all goodbyes are sad, for example “Goodbye Class!");
	        	break;
	        	}
	        while (a >= 61 && a <= 70) {
	        	JOptionPane.showMessageDialog(null, "Good friends never say goodbye, they simply say “see you soon”");
	        	break;
	        	}
	        while (a >= 71 && a <= 80) {
	        	JOptionPane.showMessageDialog(null, "That awkward moment when you think you’re important to someone, and you’re not.");
	        	break;
	        	}
	        while (a >= 81 && a <= 90) {
	        	JOptionPane.showMessageDialog(null, "Learning to let go should be learned before learning to get.");
	        	break;
	        	}
	        while (a >= 91 && a <= 99) {
	        	JOptionPane.showMessageDialog(null, "Sometimes, you have to give up on people. Not because you don’t care but because they don’t.");
	        	break;
	        	}
	        while (a == 100) {
	        	JOptionPane.showMessageDialog(null, "You’re the reason God created the middle finger. [P.S This was 1 in 100 chance :)]");
	        	break;
	        	}
	        
			 }
	}
}