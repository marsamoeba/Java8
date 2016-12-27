package chapter05;

/**
 * p107 continue语句指定标签
 * @author marsamoeba
 *
 */
// Using continue with a label
public class ContinueLabel {
	public static void main(String[] args) {
		outer: 
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (j > i) {
						System.out.println();
						continue outer;
					}
					System.out.print(" " + (i * j));
				}
			}
		System.out.println();
	}
}
