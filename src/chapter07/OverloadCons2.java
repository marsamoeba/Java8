package chapter07;

/**
 * p138 将对象用作参数
 * @author marsamoeba
 *
 */
public class OverloadCons2 {
	public static void main(String[] args) {
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);
		
		Box myclone = new Box(mybox1);
		
		double vol;
		
	}
}
