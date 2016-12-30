package chapter07;

/**
 * p132 方法的重载
 * @author marsamoeba
 *
 */
public class Overload {
	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		
		System.out.println("Result of ob.test(123.25): " + result);
	}
}
