package chapter06;

/**
 * p124 构造函数
 * @author marsamoeba
 *
 */
public class BoxDemo6 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}
