package chapter05;

/**
 * p108 return语句
 * @author marsamoeba
 *
 */
// Demonstrate return
public class Return {
	public static void main(String[] args) {
		boolean t = true;
		
		System.out.println("Before the return.");
		
		if (t) 
			return ;
		
		System.out.println("This won't execute.");
	}
}
