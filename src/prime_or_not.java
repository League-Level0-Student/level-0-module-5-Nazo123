import javax.swing.JOptionPane;

public class prime_or_not {

	
	public static void main(String[] args) {
		
		for (int i =0; i<10;) {
			int keeper = 0;
		String input = JOptionPane.showInputDialog("Enter a number!");
		int primeOrNot = Integer.parseInt(input);
		
		for (int BOB = primeOrNot;BOB>0;BOB--) {
			if (primeOrNot%BOB==0) {
				keeper++;
				
				
			}}
			
			if (keeper<=2) {
				JOptionPane.showMessageDialog(null, "It's Prime");
			
			}
			else {
				JOptionPane.showMessageDialog(null, "NOT PRIME");
		
			}
			
		
		}}
}
