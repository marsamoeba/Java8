package chapter03;

/**
 * p39 使用double变量计算园的面积 
 * @author marsamoeba
 *
 */
// Compute the area of a circle
public class Area {
	public static void main(String[] args) {
		double pi, r, a;
		r = 10.8;
		pi = 3.1416;
		a = pi * r * r;
		
		System.out.println("Area of circle is " + a);
	}
}
