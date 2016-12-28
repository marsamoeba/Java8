package chapter06;

/**
 * Box类
 * @author marsamoeba
 *
 */
class Box {
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.println("Volume is ");
		System.out.println(width * height * depth);
	}
}
