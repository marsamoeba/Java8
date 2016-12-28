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
	
	// 为box类添加方法
	void volume() {
		System.out.println("Volume is ");
		System.out.println(width * height * depth);
	}
}
