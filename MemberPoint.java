import javax.swing.*;
public class MemberPoint {

	public static void main(String[] args) {
		float point = 0,money = 0;
		String input;
		
		Calpoint calpoint = new Calpoint();
		
		input = JOptionPane.showInputDialog(null,"PLease enter Money :");
		money = Float.parseFloat(input);
		
		point = calpoint.calpoint( money);
		
		JOptionPane.showMessageDialog(null, "Your Point is :"+point);
		
		
		

	}

}
