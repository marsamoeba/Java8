package chapter06;

/**
 * p123 添加带参数的方法
 * @author marsamoeba
 *
 */
public class BoxDemo5 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}
