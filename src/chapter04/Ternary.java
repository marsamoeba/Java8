package chapter04;

/**
 * p78 "?"运算符
 * @author marsamoeba
 *
 */
// Demonstrate ?.
public class Ternary {
	public static void main(String[] args) {
		int i, k;
		
		i = 10;
		k = i < 0 ? -i : i;
		System.out.println("Absolute value of ");
		System.out.println(i + " is " + k);
		
		i = -10;
		k = i < 0 ? -i : i;
		System.out.println("Absolute value of ");
		System.out.println(i + " is " + k);
	}
}
