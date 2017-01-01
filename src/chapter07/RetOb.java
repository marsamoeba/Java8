package chapter07;

/**
 * p141 返回对象
 * @author marsamoeba
 *
 */
// Returning an object.
class Test3 {
	int a;
	
	Test3(int i) {
		a = i;
	}
	
	Test3 incrByTen() {
		Test3 temp = new Test3(a+10);
		return temp;
	}
}

class RetOb {
	
}
