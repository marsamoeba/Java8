package chapter08;

/**
 * p172 使用super调用超类的构造函数
 * @author marsamoeba
 *
 */
class BoxWeight1 extends Box {
	double weight;
	
	BoxWeight1(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
	
}
