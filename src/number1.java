import java.util.Scanner;

public class number1 {
	public static void main(String [] args) {
		Scanner st = new Scanner(System.in);
		
		double num1 = st.nextDouble();
		double num2 = st.nextDouble();
		
		Add a = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();
		
		System.out.println("Add : " + a.operate(num1, num2));
		System.out.println("Sub : " + s.operate(num1, num2));
		System.out.println("Mul : " + m.operate(num1, num2));
		System.out.println("Div : " + d.operate(num1, num2));
		
		st.close();
	}
}
