import javax.swing.*;
public class MemberPoint {

	public static void main(String[] args) {
		double point = 0,money = 0;
		String input;
		
		input = JOptionPane.showInputDialog(null,"PLease enter Money :");
		money = Double.parseDouble(input);
		
		point = calpoint.calpoint( money);
		
		JOptionPane.showMessageDialog(null, "Your Point is :"+point);
		
		
		

	}

}
