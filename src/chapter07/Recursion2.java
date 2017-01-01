package chapter07;

/**
 * p143 递归  详细步骤
 * @author marsamoeba
 *
 */
// Another example that uses recursion.
class RecTest {
	int values[];
	
	RecTest(int i) {
		values = new int[i];
	}
	
	void printArray(int i) {
		if (i == 0)
			return;
		else
			printArray(i - 1);
		System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
	
}
class Recursion2 {
	
}
