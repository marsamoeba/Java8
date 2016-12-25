package chapter05;

/**
 * p96 for循环的一些版本
 * @author marsamoeba
 *
 */
// Parts of the for loop can be empty.
public class ForVar {
	public static void main(String[] args) {
		int i;
		boolean done = false;
		
		i = 0;
		for ( ; !done; ) {
			System.out.println("i is " + i);
			if (i == 10) 
				done = true;
			i++;
		}
	}
}
