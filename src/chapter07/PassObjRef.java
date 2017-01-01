package chapter07;

/**
 * p140 参数传递的深入分析 第二种 引用传递 call-by-reference
 * 在方法内修改对象会影响到作为实参的对象。
 * @author marsamoeba
 *
 */
// Objects are passed through their references.
class Test2 {
	int a, b;
	
	Test2(int i, int j) {
		a = i;
		b = j;
	}
	
	// pass an object
	void meth(Test2 o) {
		o.a *= 2;
		o.b /= 2;
	}
}
class PassObjRef {

}
